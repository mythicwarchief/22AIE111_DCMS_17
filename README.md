# Digital Complaint Management System (DCMS)

A Java-based Object-Oriented Programming project developed as part of the course **22AIE111 - Object Oriented Programming in Java** at Amrita School of Computing, Amritapuri Campus.

The Digital Complaint Management System (DCMS) is designed to provide a centralized platform for complaint registration, complaint tracking, officer assignment, and complaint resolution using Object-Oriented Programming principles in Java.

---

# Team Members

| Roll Number | Name | Role |
|---|---|---|
| AM.SC.U4AIE25120 | Adithyadev B | Testing, Validation and Exception Handling |
| AM.SC.U4AIE25157 | Kiran S Nair | Core Development and System Integration |
| AM.SC.U4AIE25159 | Shreyas Nair | Backend Logic and Complaint Workflow |
| AM.SC.U4AIE25163 | Vaishnav Sunil Nair | Documentation, UML Design and Repository Management |

---

# Problem Description

Manual complaint management systems are inefficient, difficult to monitor, and lack transparency. Users often cannot track complaint progress properly, while administrators struggle with complaint assignment and resolution tracking.

The Digital Complaint Management System solves these issues by providing:

- Complaint registration by users
- Complaint assignment by administrators
- Complaint resolution by officers
- Complaint status tracking
- Centralized complaint management

The project demonstrates the implementation of core Object-Oriented Programming concepts such as:

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism
- Exception Handling
- Modular Programming
- Package Organization

---

# Repository Structure

```text
22AIE111_DCMS_17/
|
|---Phase1/
|   |---Phase I Documentation
|
|--- Phase2/
|   |--- Phase II Documentation
|
|---src/
|   |---dcms/
|       |---core/
|       |   |---Admin.java
|       |   |---Officer.java
|       |   |---Complaint.java
|       |   |---User.java
|       |
|       |---services/
|           |---InvalidComplaintException.java
|           |---SystemManager.java
|           |---DCMSapp.java
|
|---output/
|   |---Output1.png
|   |---Output2.png
|   |---Output3.png
|   |---Output4.png
|   |---Exception1.png
|   |---Exception2.png
|
|--- README.md
```

---

# Package Overview

## Package: `dcms.core`

Contains the core entity classes used in the complaint management workflow.

### Files Included

| File Name | Description |
|---|---|
| `User.java` | Abstract base class representing generic system users |
| `Admin.java` | Handles complaint assignment and monitoring |
| `Officer.java` | Handles complaint processing and resolution |
| `Complaint.java` | Stores complaint information and status |

---

## Package: `dcms.services`

Contains the service layer and execution logic of the system.

### Files Included

| File Name | Description |
|---|---|
| `SystemManager.java` | Core controller managing complaints and workflow |
| `InvalidComplaintException.java` | Custom exception for invalid complaint handling |
| `DCMSapp.java` | Main application containing menu-driven execution |

---

# Class Overview

## Package: `dcms.core`

### `User.java`

Abstract base class representing users of the system.

#### Responsibilities
- Stores common user information
- Provides a common structure for Admin and Officer
- Supports polymorphic dashboard implementation

#### Important Methods

```java
displayDashboard()
getUserId()
getName()
```

---

### `Admin.java`

Represents the administrator responsible for complaint monitoring and assignment.

#### Responsibilities
- Assign complaints to officers
- Monitor complaint workflow
- Manage administrative operations

#### OOP Concepts Used
- Inheritance
- Method Overriding
- Encapsulation

#### Important Methods

```java
assignComplaint()
monitorStatus()
displayDashboard()
```

---

### `Officer.java`

Represents officers responsible for complaint handling and resolution.

#### Responsibilities
- Resolve complaints
- View assigned complaints
- Access officer dashboard

#### OOP Concepts Used
- Inheritance
- Polymorphism
- Encapsulation

#### Important Methods

```java
resolveComplaint(int complaintId)
viewAssignedComplaints()
displayDashboard()
```

---

### `Complaint.java`

Represents complaint records stored within the system.

#### Attributes Managed
- Complaint ID
- Description
- Status
- Assigned Officer

#### Responsibilities
- Maintain complaint information
- Update complaint status
- Store assignment details

#### Important Methods

```java
updateStatus(String status)
setAssignedOfficer(String officer)
getComplaintId()
toString()
```

---

## Package: `dcms.services`

### `SystemManager.java`

Acts as the central controller of the Digital Complaint Management System.

#### Responsibilities
- Register complaints
- Track complaint records
- Update complaint status
- Assign officers
- Coordinate workflow between Admin and Complaint objects

#### Features Implemented
- Complaint storage using ArrayList
- Synchronized operations
- Status tracking
- Complaint assignment
- Exception propagation

#### Important Methods

```java
addComplaint(String description)
trackComplaints()
updateStatus(int id, String newStatus)
assignAndProcess(int id, String officer, String newStatus)
```

---

### `InvalidComplaintException.java`

Custom exception class used for validating complaint submissions.

#### Purpose
- Prevent invalid or empty complaint entries
- Improve reliability using controlled exception handling

#### Example

```java
throw new InvalidComplaintException(...)
```

---

### `DCMSapp.java`

Main execution class of the application containing the menu-driven system.

#### Functionalities Provided
- Complaint submission
- Complaint viewing
- Complaint status updates
- Officer assignment
- Admin authentication
- Exception handling

#### Exception Handling Included

```java
InvalidComplaintException
NumberFormatException
General Exception Handling
```

---

# Functionalities Implemented

The system supports the following operations:

1. Submit Complaint
2. View All Complaints
3. Update Complaint Status
4. Assign Officer to Complaint
5. Monitor Complaint Records
6. Admin Authentication
7. Exception Handling for Invalid Inputs

---

# OOP Concepts Implemented

| OOP Concept | Implementation |
|---|---|
| Abstraction | `User` abstract class |
| Inheritance | `Admin` and `Officer` extend `User` |
| Polymorphism | Overridden `displayDashboard()` methods |
| Encapsulation | Private and protected data members |
| Exception Handling | `InvalidComplaintException` |
| Modularity | Package-based structure |

---

# Technologies Used

- Java
- Eclipse IDE
- GitHub
- UML Modelling
- Object-Oriented Programming Principles

---

# How to Run the Project

## Step 1
Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/22AIE111_DCMS_17.git
```

---

## Step 2
Open Eclipse IDE.

---

## Step 3
Import Existing Java Project.

---

## Step 4
Navigate to:

```text
src/dcms/services/DCMSapp.java
```

---

## Step 5
Run the file as:

```text
Right Click → Run As → Java Application
```

---

# Sample Output

## Complaint Registration

```text
--- Digital Complaint Management System ---

1. Submit Complaint (User)
2. View All Complaints (Admin/Officer)
3. Update Status (System)
4. Assign Officer & Update (Admin Only)
5. Exit

Select Option: 1

Enter your complaint:
The plumbing in the building is flawed

System: Complaint #101 stored and Admin notified.
```

---

## Multiple Complaint Records

```text
--- Current Complaint Records ---

ID: 101 | Status: Pending | Officer: Unassigned | Issue: The plumbing in the building is flawed

ID: 102 | Status: Pending | Officer: Unassigned | Issue: Geyser in room 306 does not work
```

---

## Officer Assignment and Status Update

```text
Select Option: 4

Enter Admin Password to proceed: 123

Enter Complaint ID: 102
Enter Officer Name to Assign: Adithya
Enter Status Update: In-Progress

Admin #0 is assigning a complaint...
Success: Officer assigned and status updated.
```

---

## Complaint Resolution

```text
Select Option: 3

Enter Complaint ID to update: 102
Enter New Status (Resolved/In-Progress): Resolved

System: Status updated for Complaint #102
```

---

## Final Complaint Status

```text
--- Current Complaint Records ---

ID: 101 | Status: In-Progress | Officer: Smitha | Issue: The plumbing in the building is flawed

ID: 102 | Status: Resolved | Officer: Adithya | Issue: Geyser in room 306 does not work
```

---

# Exception Handling Output

## Empty Complaint Submission

```text
Select Option: 1

Enter your complaint:

Submission Error: Description cannot be empty!
```

---

## Invalid Complaint ID Input

```text
Select Option: 3

Enter Complaint ID to update: avc

Error: Please enter a numeric ID.
```

---

# Documentation

## Phase I
Includes:
- Problem Identification
- Entity and Class Mapping
- Attribute and Behaviour Analysis

---

## Phase II
Includes:
- Class Diagram
- Use-Case Diagram
- Sequence Diagram
- Architectural Design

---

# Academic Information

Course: 22AIE111 - Object Oriented Programming in Java  
Department: Computer Science and Engineering  
Institution: Amrita School of Computing, Amritapuri Campus

---
