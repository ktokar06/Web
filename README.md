<h1 align="center">Hi there, I'm<a ></a> Kirill</a> 
<img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>
<h3 align="center"> Student, Java Developer 🇷🇺 </h3>

# 📜 Blog Application
This is a Spring Boot-based blog application where users can view posts, add new posts, and manage the content. The backend is built using Java with Spring Boot, and the posts are stored in a MySQL database. The application allows for adding, viewing, and listing blog posts with features such as creating, updating, and displaying the content.

## 📦 Installation

1. Clone repositories:
   
 ```bash
 git clone https://github.com/ktokar06/Web.git
 ```

2. Go to the project directory:
   
```bash
cd Web
```

## 🛠️ Technologies Used

- Java: Core language for the application.

- Spring Boot: Framework for building the backend API.

- Thymeleaf: Template engine used for rendering views.

- MySQL/MariaDB: Relational database to store blog posts.

- Spring Data JPA: Used for interacting with the database.

- Spring Security: (If implemented) for secure login and authentication (if required).

## 📄 Requirements

- Java 11+: Java Development Kit to run the application.

- MySQL Database Server: To store the blog data.

- Maven: For managing project dependencies and building the application.

## Application Structure
### Files

- WebApplication.java: The main class that runs the Spring Boot application.

- Post.java: Entity class representing the blog post.

- PostRepository.java: Interface for database CRUD operations for the blog posts.

- BlogController.java: Controller to manage blog-related routes like displaying posts and adding new ones.

- MainController.java: Controller for the homepage and about page.

- application.properties: Contains configuration settings like database connection and port settings.

`Database Schema`
- The application uses a MySQL database with a table for posts:

```sql
CREATE TABLE post (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    anons VARCHAR(255) NOT NULL,
    full_text TEXT,
    views INT DEFAULT 0
);
```

## 💻 Features

- Add Post: Allows users to create new blog posts with a title, anons (short description), and full content.

- View Posts: Displays a list of all available posts with links to view details.

- Edit and Delete Posts: Allows users to edit or delete existing posts (though the editing feature is not shown in the current code).

## Example Routes

- `/Blog:` Displays a list of all blog posts.

- `/Blog/Add:` A page where users can add new blog posts.

- `/about:` A page with information about the application.

- `/:` The homepage of the website.
