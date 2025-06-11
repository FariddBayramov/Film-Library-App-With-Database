package com.example.movielibrary;

import com.example.movielibrary.Tables.*;
import com.example.movielibrary.Tables.Character;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class Main extends Application {
    public static Stage mainStage;
    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("log-in.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println(getFilms());
        launch();
    }

    public static Connection sqlConnect() {
        String url;
        String serverName = "LAPTOP-HH01I48G\\SQLEXPRESS";
        String dbName = "VTYS_Proje";
        url = "jdbc:sqlserver://" + serverName + ";Database=" + dbName + ";integratedSecurity=true;encrypt=false;trustServerCertificate=true;";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return con;
    }

    // Row ArrayLists for each table
    public static ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList<>();
        try {
            Connection con = sqlConnect();
            Statement stmt = con.createStatement();
            // get employees
            String statementStr = "select * from Actors";
            ResultSet rset = stmt.executeQuery(statementStr);
            while (rset.next()) {
                actors.add(new Actor(
                        rset.getInt("ActorID"),
                        rset.getString("ActorName"),
                        rset.getString("ActorSurname"),
                        rset.getInt("ActorAge"),
                        rset.getString("ActorGender")
                ));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return actors;
    }

    public static ArrayList<Character> getCharacters() {
        ArrayList<Character> arrayList = new ArrayList<>();
        try {
            Connection con = sqlConnect();
            Statement stmt = con.createStatement();
            // get Characters
            String statementStr = "select * from Characters";
            ResultSet rset = stmt.executeQuery(statementStr);
            while (rset.next()) {
                arrayList.add(new Character(
                        rset.getInt("CharacterID"),
                        rset.getString("CharacterName"),
                        rset.getString("CharacterSurname"),
                        rset.getInt("CharacterAge"),
                        rset.getInt("FilmID"),
                        rset.getInt("ActorID")
                ));
            }
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return arrayList;
    }

    public static ArrayList<Director> getDirectors() {
        ArrayList<Director> arrayList = new ArrayList<>();
        try {
            Connection con = sqlConnect();
            Statement stmt = con.createStatement();
            // get Directors
            String statementStr = "select * from Directors";
            ResultSet rset = stmt.executeQuery(statementStr);
            while (rset.next()) {
                arrayList.add(new Director(
                        rset.getInt("DirectorID"),
                        rset.getString("DirectorName"),
                        rset.getString("DirectorSurname"),
                        rset.getInt("DirectorAge"),
                        rset.getString("DirectorGender")
                ));
            }
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return arrayList;
    }

    public static ArrayList<Film> getFilms() {
        ArrayList<Film> arrayList = new ArrayList<>();
        try {
            Connection con = sqlConnect();
            Statement stmt = con.createStatement();
            // get Films
            String statementStr = "select * from Films order by FilmName";
            ResultSet rset = stmt.executeQuery(statementStr);
            while (rset.next()) {
                arrayList.add(new Film(
                        rset.getInt("FilmID"),
                        rset.getString("FilmName"),
                        rset.getString("Summary"),
                        rset.getString("PrimaryLanguage"),
                        rset.getString("FilmPlatform"),
                        rset.getInt("Year"),
                        rset.getInt("RunTimeMin"),
                        rset.getInt("DirectorID"),
                        rset.getInt("ScenaristID"),
                        rset.getInt("GenreID")
                ));
            }
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return arrayList;
    }

    public static ArrayList<Genre> getGenres() {
        ArrayList<Genre> arrayList = new ArrayList<>();
        try {
            Connection con = sqlConnect();
            Statement stmt = con.createStatement();
            // get Films
            String statementStr = "select * from Genres";
            ResultSet rset = stmt.executeQuery(statementStr);
            while (rset.next()) {
                arrayList.add(new Genre(
                        rset.getInt("GenreID"),
                        rset.getString("GenreName")
                ));
            }
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return arrayList;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            Connection con = sqlConnect();
            Statement stmt = con.createStatement();
            // get Characters
            String statementStr = "Select * from Users";
            ResultSet rset = stmt.executeQuery(statementStr);
            while (rset.next()) {
                arrayList.add(new User(
                        rset.getInt("UserID"),
                        rset.getString("Mail"),
                        rset.getString("Password"),
                        rset.getString("Username"),
                        rset.getInt("UserAge"),
                        rset.getString("UserGender")
                ));
            }
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return arrayList;
    }
}
