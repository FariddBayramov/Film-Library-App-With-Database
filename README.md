# 🎥 Film Library App

Welcome to the **Film Library App**! This is a JavaFX-based application developed using **SceneBuilder** for UI design, with a **MySQL database** for managing user data and film information.

---

## 🚀 Features

### 1. **User Authentication**

- Users can **log in** to their accounts.
- Profile settings allow users to **change their email**, **username**, and **password**.
- Users can **delete their accounts** if desired.

### 2. **Navigation Menu**

- A side menu with the following sections:
  - **Home** - View all available films.
  - **Liked Films** - Access a list of favorite films.
  - **Genres** - Browse films by genre.
  - **Actors** - View actors featured in the database.
  - **Directors** - Explore films by directors.

### 3. **Like and Favorite Films**

- Users can **like films**, which adds them to the **Liked Films** section.

### 4. **Detailed Film Information**

- For each film, view:
  - **Summary**
  - **Actors**
  - **Director**
  - **Year**
  - **Language**
  - **Awards**
  - **Screenwriters**

### 5. **Search Functionality**

- A **Search Bar** at the top allows users to search for films by name.

### 6. **Dynamic Data Integration**

- All data, including films, user profiles, and favorites, is retrieved from a **MySQL database**.

---

## 🛠️ Technologies Used

- **Java** - Core language for the application.
- **JavaFX** - Used for the UI components.
- **SceneBuilder** - For designing user interfaces with FXML.
- **MySQL** - Relational database for storing user data and film information.
- **Maven** - Project build tool for managing dependencies.

---

## 🎮 How to Run the Application

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/FariddBayramov/film-library-app.git
   ```

2. Set up the **MySQL Database**:

   - Import the provided database script into your MySQL server.
   - Update database credentials in the project configuration.

3. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

4. Ensure you have **JavaFX SDK**, **MySQL Connector**, and **Maven** properly set up.

5. Run the project:

   - Locate the `Main.java` file.
   - Run it as a Java Application.

---

## 📸 Screenshots


### 1. Home Page

![image](https://github.com/FaridBy/Film-Library-App-With-Database/assets/105610848/63e92700-7cda-46bc-853c-f051b2768307)

### 2. Film Details

![image](https://github.com/FaridBy/Film-Library-App-With-Database/assets/105610848/3616e2ae-3d01-4d1a-9999-27022cf3bbf0)

### 3. Profile Settings

![image](https://github.com/FaridBy/Film-Library-App-With-Database/assets/105610848/9d2ed8e6-62a5-4533-ac29-c003a6f54c58)

### 4. Entity Diagram

![image](https://github.com/FaridBy/Film-Library-App-With-Database/assets/105610848/b81d0277-c674-4e50-bebd-557e3a6105c8)

---

## 🎯 Future Enhancements

- Add a recommendation system based on user preferences.
- Include movie trailers for each film.
- Enable multi-language support.
- Improve search functionality with filters (e.g., by year, genre).

---

## 📝 Project Structure

```plaintext
MovieLibrary/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/example/movielibrary/
│   │   │   │   ├── CreateAnAccountController.java   # Controller for account creation
│   │   │   │   ├── HomePageController.java          # Controller for the home page
│   │   │   │   ├── LoginController.java             # Controller for login page
│   │   │   │   ├── Main.java                        # Application entry point
│   │   │   │   ├── ProfileController.java           # Controller for profile page
│   │   │   │   ├── Tables/                          # Database entity classes
│   │   │   │   │   ├── Actor.java
│   │   │   │   │   ├── Director.java
│   │   │   │   │   ├── Film.java
│   │   │   │   │   ├── Genre.java
│   │   │   │   │   ├── User.java
│   │   │   │
│   │   ├── resources/
│   │   │   ├── com/example/movielibrary/
│   │   │   │   ├── create-an-account.fxml           # FXML for account creation
│   │   │   │   ├── film-app.fxml                    # Main app UI
│   │   │   │   ├── log-in.fxml                      # FXML for login page
│   │   │   │   ├── profile.fxml                     # FXML for profile page
│   │   │   ├── img/                                 # Images and icons
│   │   │   │   ├── actor.png
│   │   │   │   ├── director.png
│   │   │   │   ├── home.png
│   │   │   │   ├── movies.png
│   │   │   │   ├── search.png
│   │   │   │   ├── settings.png
│   │   │   │   └── films/                           # Film cover images
│
├── pom.xml                                          # Maven configuration file
├── mvnw                                             # Maven wrapper
├── README.md                                        # Project documentation
└── .idea/                                           # IDE configuration files
```

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you'd like to change.

---

## 🧑‍💻 Author

- **Farid Bayramov** 
- GitHub: [FariddBayramov](https://github.com/FariddBayramov)

---


Thank you for checking out the **Film Library App**! 🎬🍿 Feel free to reach out if you have any suggestions or issues.








