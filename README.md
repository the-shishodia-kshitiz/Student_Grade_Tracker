# Student Grade Tracker (Desktop Application)

The **Student Grade Tracker** is a Java-based desktop application that allows users to input and manage student marks for individual subjects (Math, Science, English). It displays real-time statistics and interactive charts using a modern HTML/JavaScript UI rendered inside a JavaFX desktop window. The backend is powered by Spring Boot.

---

## 🔧 Features

- Add student names and marks for Math, Science, and English
- Calculate and display subject-wise averages
- Visualize data with bar and line charts (using Chart.js)
- Run as a desktop app with an embedded WebView (JavaFX)
- Fully offline-capable and easy to use

---

## 🧱 Tech Stack

- Java 17+
- Spring Boot (REST API backend)
- JavaFX (UI launcher with WebView)
- HTML/CSS/JavaScript frontend (in `static/index.html`)
- Maven (for build and dependency management)

---

## 🚀 How to Run

### 🛠 Prerequisites
- Java 17 or higher
- Maven 3.x

### 💻 Run the App

1. Clone or unzip the project.
2. Open terminal in the root folder.
3. Run:

```bash
mvn clean install
mvn javafx:run




├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/studenttracker/
│       │       ├── DesktopLauncher.java
│       │       ├── StudentGradeTrackerApplication.java
│       │       ├── StudentController.java
│       │       ├── Student.java
│       │       └── SubjectSummary.java
│       └── resources/
│           ├── application.properties
│           └── static/
│               └── index.html
