# Student Management System - Java

## Project Description
A robust console-based Java application designed to manage student records efficiently. It allows administrators to add, view, search, update, and delete student data. The application utilizes a menu-driven interface and ensures data persistence across sessions using File IO.

## Features
* **Add Record:** Input new student details (ID, Name, Course, Age, Marks).
* **View All Records:** Display all stored students in a formatted view.
* **Search Record:** Find specific students in `O(1)` time complexity using their ID.
* **Update Record:** Modify course or marks for existing students.
* **Delete Record:** Remove a student from the system.
* **Auto-Save:** Saves data securely before application exit via background multithreading.

## Technologies & Concepts Used
* **Language:** Java 11+
* **Core OOP:** Inheritance, Polymorphism, Encapsulation, Abstraction, Interfaces.
* **Collections Framework:** Utilized `HashMap<String, Student>` for highly efficient data retrieval and storage.
* **Exception Handling:** Custom `StudentNotFoundException` and robust `InputMismatchException` catching to prevent app crashes.
* **File Handling:** `ObjectOutputStream` & `ObjectInputStream` for object serialization.
* **Multithreading:** A dedicated background `Thread` executes database saving upon system exit.

## How to Run the Project
1. Clone the repository: `git clone <your-repo-link>`
2. Compile the Java files: `javac Main.java`
3. Run the application: `java Main`

## Future Improvements
* Transition from a console UI to a Graphical User Interface (GUI) using JavaFX.
* Integrate a real relational database (MySQL/PostgreSQL) instead of flat-file serialization.
* Add sorting features (e.g., sort students by marks using `Comparator`).
