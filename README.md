# 💰 Loan Account Hierarchy – Java OOP Project

A Java-based object-oriented programming project that demonstrates inheritance, encapsulation, and polymorphism through a loan management system. The program models various types of loans and generates detailed monthly reports for customers using polymorphic behavior.

---

## 🛠️ Tech Stack

- **Language**: Java
- **Paradigm**: Object-Oriented Programming (OOP)
- **IDE**: Apache NetBeans (Recommended)


## 📂 Project Structure

### ➕ Core Classes
- `LoanAccount.java` – Base abstract class for all loan types
- `CarLoan.java` – Extends `LoanAccount` with vehicle details
- `PrimaryMortgage.java` – Extends `LoanAccount` with property address and PMI
- `UnsecuredLoan.java` – Basic loan with higher interest rate, no collateral

### 👤 User Classes
- `Customer.java` – Represents an individual customer with SSN and multiple loans
- `Address.java` – Represents address details used by mortgage accounts

### 🚀 Runner Class
- `LoanAccountHierarchy.java` – Initializes customers, assigns loans, and prints monthly loan reports using polymorphism

---

## 🔑 Features

- Create and manage:
  - Car Loans
  - Primary Mortgages
  - Unsecured Loans
- Associate multiple loans with customers
- Generate **polymorphic reports** displaying:
  - Monthly payment breakdown
  - Interest rates, principal, and duration
  - Loan-specific attributes (e.g., Vehicle VIN, Property Address)
- Modular class-based design showcasing real-world OOP implementation

---

## 📌 OOP Concepts Practiced

- **Inheritance** – Loan types inherit from `LoanAccount`
- **Polymorphism** – Unified interface for generating monthly reports
- **Encapsulation** – Secure and organized data access via private fields and public methods
- **Composition** – Mortgage class includes `Address` object

---

## 🚀 How to Run

1. **Clone or download the repository**
    ```bash
    git clone https://github.com/yourusername/LoanAccountHierarchy.git
    ```

2. **Open in NetBeans or any Java IDE**

3. **Run the `LoanAccountHierarchy.java` file**
    - The output will be displayed in the terminal showing formatted reports for each customer and their associated loans.

---

## 👨‍💻 Author

**Aarya Soni**  
Java Developer | OOP Enthusiast | Undergraduate Student

---

## 📜 License

This project is intended for academic use. All rights reserved © Aarya Soni.
