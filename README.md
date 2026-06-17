#  ꕥ Foofy Restaurant & Vending Machine System ꕥ
Welcome to the Foofy Restaurant Management System, a console-based Java application designed to simulate an end-to-end restaurant ordering process coupled with an automated drink vending machine. 
Developed as part of an academic assignment to apply and reinforce the concepts learned in Object-Oriented Programming (OOP).
## Key Features
- Hierarchical Menu Management: Leverages a multi-way tree structure to categorize food items dynamically into categories and subcategories (e.g., Burgers -> Fried Burgers / Grilled Burgers).
- Live Stock & Inventory Tracking: Every food and drink item maintains its own stock level. If a selection exceeds inventory capacity, the application flags an error and prompts an update.
- Order Queue Management: Multiple client orders are managed in a "First-In, First-Out" (FIFO) processing queue mimicking a kitchen assembly line.
- Dynamic Preparation Time & Cost Evaluation: Real-time generation of cumulative costs and estimated prep times for complex custom orders.
- Integrated Vending Machine: A standalone beverage dispatch module fueled by individual data stacks for quick selection and processing.
##  System Architecture & Data Structures

The system deliberately circumvents standard Java collection frameworks (except for basic stack interactions) to demonstrate custom core structural implementations:

| Component / Class | Data Structure Utilized | Purpose in Application |
| :--- | :--- | :--- |
| `TreeNode` | **General Tree Structure** | Handles the categorical layout of the menu hierarchy (Appetizers, Salads, Pizzas, etc.). |
| `SinglyLinkedList` | **Custom Singly Linked List** | Acts as the foundational underlying sequential data container across items, children nodes, and final order groups. |
| `LinkedQueue` | **FIFO Queue** | Represents the kitchen line processing interface where confirmed consumer bills are pushed sequentially. |
| `drink_vending_machine` | **LIFO Stack (`java.util.Stack`)** | Simulates the hardware column dispenser behavior of a vending machine for drinks (Juice, Cola, Water). |
| `Item` | **Object Entity Container** | Holds properties for ID, name, cost, preparation time, and inventory stock alongside localized terminal inputs. |

---

##  Project Directory Breakdown

* `testmultible.java`: The main entry-point execution file containing hardcoded menu seeds, main program loops, and primary transaction flows.
* `Item.java`: Context definitions for items sold including tracking systems and order creation mechanics.
* `Order.java`: Compiles item structures to calculate individual receipt metadata like overall cost and preparation delays.
* `drink_vending_machine.java`: Class managing independent LIFO storage units containing beverage items.
* `TreeNode.java`: Positional node design configuration allowing menu categorization layers to branching unlimitedly.
* `Node.java` / `SinglyLinkedList.java`: Custom dynamic list layout supporting data insertions, indexing, and positional traversals.
* `Queue1.java` / `LinkedQueue.java`: Queue interface specifications implementing linear FIFO scheduling behavior.
* `menu.java`: Formatted command terminal prints and explicit input filtering validations.

---
##  Getting Started

### Prerequisites
* **Java Development Kit (JDK)**: Version 8 or higher installed.

### Compilation
Open your terminal inside the project directory folder containing the `.java` files (ensure they are within a directory path matching the package declaration `treeMultiple` if compiling via console manually):

```bash
javac -d . *.java
