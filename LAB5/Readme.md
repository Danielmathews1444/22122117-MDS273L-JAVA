## Question

Create a student class, that will store the details of the Student

Reg. No.

Name

Email

Phone

Class

Department

The class will have a constructor to initialize the values of the Student and a method to print the Details of the Student.

In the main-method class, create an array of Student Class to hold maximum details of 100 Students.
In the menu-driven program, the menu options will have
Add a student
Adds the details of 1 student to the array of Student
Search for a student
Search for the details of a student from the array of Student
(Optional) Searching can be done with Name & Register Number
Display all students
Displays the details of all students
Note: Make use of functions to implement the menu options

Extension (Optional):
Save the details of each student in a file, with his name with the help of a method in student class, when the student is getting created.

## Student Register
Student Register System
This program allows the user to create a student register system. The user can add new students to the register, search for existing students by name or registration number, and display the details of all students in the register. The program uses a class called stud to represent each student in the register.

## Usage
Run the program.
Choose an option from the menu:
Enter 1 to add a student
Enter 2 search a student
Enter 3 to display all the details of all students
Enter any other key to exit
Follow the prompts to add or search for a student.
The program will continue to run until the user enters a key other than 0.
## Class Structure
The stud class has the following attributes:

Reg_No (String)
Name (String)
Email (String)
Phone (String)
Class (String)
Department (String)
It also has the following methods:

display(): Prints the details of the student to the console.
search(String par, int m): Searches for the student based on the search parameter (par) and the search type (m). Returns true if the student is found, and false otherwise.
The studentregister class is the main class that runs the program. It creates an array of stud objects to store the students in the register. It has the following methods:

main(String[] args): The main method that runs the program. It displays a menu of options, and allows the user to add, search, and display students in the register.

## Flow Chart
 ![alt text](flowchart.jpg)

