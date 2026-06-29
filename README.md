# Blood Bank Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

A robust, portable desktop application built with **Java Swing** and **MySQL** for managing blood bank operations. This system streamlines the process of registering donors, maintaining blood stock inventory, and searching for available blood based on location or blood group.

## ✨ Features

- **Donor Management**: Add, update, and delete blood donors securely.
- **Smart Inventory Tracking**: Automatically update blood stock upon donor registration via SQL triggers.
- **Manual Stock Adjustments**: dedicated modules to manually increase or decrease blood units as they are consumed or acquired.
- **Advanced Search**: Quickly search and filter for blood donors by their location/city or specific blood group.
- **Portable Architecture**: Completely decoupled from IDE-specific files (like NetBeans `.form` files), allowing it to run seamlessly via terminal on any operating system.

## 🛠️ Technologies Used

- **Frontend**: Java Swing / AWT (GUI)
- **Backend Core**: Java (JDK 8+)
- **Database**: MySQL 8.0
- **Libraries**:
  - `mysql-connector-java.jar` (Database Connectivity)
  - `AbsoluteLayout.jar` (UI Positioning)

## 🚀 Getting Started

Follow these steps to set up the project on your local machine.

### Prerequisites
- Java Development Kit (JDK) installed and configured in your system path.
- MySQL Server installed and running locally on port 3306.

### 1. Database Setup
A complete SQL initialization script is provided in the root directory.
1. Open your MySQL command line or Workbench.
2. Run the provided script to create the database, tables, and necessary triggers:
   ```bash
   mysql -u root -p < bbms.sql
   ```

### 2. Configure Credentials
Navigate to `src/bbms/db/ConnectionProvider.java`. 
Update the `password` variable to match your local MySQL root password:
```java
String url = "jdbc:mysql://localhost:3306/bbms";
String username = "root";
String password = "your_mysql_password_here"; // Update this
```

### 3. Compile and Run
Open your terminal in the project root directory and run the following commands:

**Compile the project:**
```powershell
javac -cp "lib\AbsoluteLayout.jar;lib\mysql-connector-java.jar" -d bin src\bbms\db\*.java src\bbms\ui\*.java
```

**Run the application:**
```powershell
java -cp "bin;lib\AbsoluteLayout.jar;lib\mysql-connector-java.jar" bbms.ui.login1
```

## 🔐 Default Login Credentials
- **Username:** `bbms`
- **Password:** `admin`

## 📝 License
This project is open-source and available for educational purposes.
