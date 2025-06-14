# Technical Support Request Management System

This Java application simulates a basic **Technical Support Request Management System** for a company called **Tecnologías del Atlántico S.A.**. The system uses a **stack data structure (LIFO)** to manage incoming support tickets, ensuring that the **most recent request is addressed first**.

The application was developed using **Apache NetBeans** and **Swing (JFrame GUI)**, and follows the **Model-View-Controller (MVC)** design pattern for clean code separation.

---

## 📦 Features

1. **Register New Support Request**  
   Users can input:
   - Client name
   - Type of problem (software, hardware, network, or other)
   - Brief description of the issue  
   This data is pushed onto the stack.

2. **View the Most Recent Request**  
   Displays the latest request without removing it from the stack.

3. **Attend a Request**  
   Pops the most recent request from the stack and informs the user that it has been addressed.

4. **View All Pending Requests**  
   Displays a list of all current support tickets in the stack without modifying it.

5. **Clear All Requests**  
   Empties the stack completely and shows a confirmation message.

6. **Exit System**  
   Closes the application.

---

## 🛠️ Technologies Used

- Java SE 8+
- Apache NetBeans (tested with version 18)
- Swing (JFrame, JTextArea, JComboBox, JOptionPane)
- Java Collections (`Stack`)
- MVC Architecture

---

## 📂 Project Structure

```plaintext
src/
├── modelo/
│   └── SolicitudSoporte.java         // Data model (support request)
├── controlador/
│   └── SolicitudControlador.java     // Singleton logic controller (stack management)
├── vista/
│   └── SolicitudVista.java           // JFrame-based GUI
```

---

## 🚀 How to Run

1. Open the project in **Apache NetBeans**.
2. Make sure the project is set to use **JDK 8 or higher**.
3. Run the `SolicitudVista` class.
4. Use the menu buttons to test functionality.

---

## 📸 GUI Preview

- Main menu: Buttons to register, view, attend, list, or clear requests.
- Input fields: Text fields and dropdown to enter request data.
- Output area: Displays request info dynamically.

*(An illustrative screenshot can be included here)*

---

## 💡 Design Highlights

- Uses the **Singleton pattern** to ensure only one instance of the request controller (`SolicitudControlador`) is shared across the UI.
- Implements exception handling to manage empty stack operations.
- Clear UI logic to separate responsibilities between MVC components.

---

## 🔒 License

This project is intended for educational or demonstration purposes. You are free to modify and distribute it for non-commercial use.

---

## ✍️ Author

Developed by a Computer Systems Engineering student as part of a practice project.