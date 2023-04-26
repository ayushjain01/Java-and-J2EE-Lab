# Java-and-J2EE-Lab
This repository contains program files for Java and J2EE Lab, 6th Sem, Information Science Engineering.

### General Project Structure 
You will find the code in under the ```src``` folder.

![image](https://user-images.githubusercontent.com/67141217/234694044-b5778a6d-e1e7-4bed-992a-8c43dc0117ff.png)


## Updated Syllabus

#### 1. Write Java program to
* Create a collection of contact lists (contact number and name)
* Accept missed calls from the user and store them in another list. If the caller details exist in the contact list , retrieve the caller details stored as “private caller”. Store them in the order
* Users can trace the missed call list and display them if required.
* Delete the number if the user specifies a number to delete.

Write a main program to test the class.

#### 2. Write a Java program using user-defined storage classes to create a book database and store it in a Collection List. Books collection should include title, author, publisher and price.
* Write a method to sort the books in ascending order of price and store it in another List.
* Maintain the book details with respect to an unique book id.
* Prompt for an author name and list all the books with the same author’s name.
* Create a new list holding all the book details with price greater than a user specified price.
* For a given  value by the user, find all the books that match either the whole or a part of the book title.
* Identify a publisher and print books from a particular publisher. Update the publisher details based on a title.

#### 3.Create a desktop java application  using swings to enable an user to enter student information such as name, usn, age, address, sgpa of 8 semesters, category.
* Perform validations on age and sgpa. Display appropriate messages in pop up boxes to indicate wrong entries.
* On clicking of the “compute” button, find the cgpa based on the obtained sgpa’s.
* On clicking the “done” button, place the student details in a collection.
* A click on the “display” button should display the collection in a textarea. 

#### 4. Write a java program using swings to validate user login information using dialog boxes. Once validated, allow the user to enter the customer id, if the person is a new customer, else check whether the customer exists in a collection and obtain the customer id.   The customer id can be obtained given a mobile number. Allow the user to enter the item purchased by giving the item id and quantity purchased. On clicking of a button, the item name and the total cost should appear in the corresponding GUI components. Using option dialog box, indicate the types of discount available for the customer. On clicking on the print button, print the details in the information dialog box. 

#### 5. Write a program that uses Java Swing and JDBC to create a stand-alone application:
Create two tables namely, Representative (RepNo, RepName, State, Comission, Rate) and Customer (CustNo, CustName, State, Credit_Limit, RepNo) in MySQL database. Use appropriate Swing components to insert values in a form. Use another form to display Representative’s information when Credit_Limit is above 15,000.

#### 6.Create a Servlet to file IT returns that accepts personal information, salary information and Tax deduction details from the user and write the information into a file. Also accept the name of the person and display in on the page.

#### 7. Create a servlet that accepts patient information in a hospital such as patient id, patient name, age, date of admission, cause of admission, doctor diagnosed, and treatment proposed. Place the details into a database. Allow options to insert, update, and view and delete the contents in the database.

#### 8. Write a JSP and Servlet Program to do the following to buy a T-Shirt online:A set of checkboxes to select your T-Shirt accessories such as ‘belt’, ‘cap’, ‘hair-band’ etc.A text area / text field to enter your T-Shirt tag-line A Radio-button that allows the user to choose between T-Shirt with chest pocket and without.A Combo Box to choose your T-Shirt colorAppropriate labels for these GUI Components
* A Button called “Click Me” which when pressed will 
* Insert the details entered into a table called ‘TShirts’. 
* An OrderNo is generated by adding ‘1’ to the existing ‘OrderNo’
* If ‘TShirts’ table is empty the initial value of ‘OrderNo’ is 100.
* This ‘OrderNo’ is also inserted into the ‘TShirts’ table 
* Display all the records of the ‘TShirts’ table in tabular form
* PS: Frontend display should be in JSP and the business logic should be written in Servlet Class.

#### 9. Create two tables Flight (Flight_Number, Airline_Name, Weekdays) and seatReservation(Flight_Number, Date, Seat_Number, Customer_Name, Customer_Phone) in MySQL database. Create JSP page ReserveOnline.jsp to reserve an airline seat and insert the values into the table SeatReservation. OnClick of Submit in ViewDetails.jsp display information about reservation. Validate the Flight_Number from already existing Flight database and generate random number for Seat_Number within the range 1-500. Also create a link to display information of all the flights running on a particular day.

#### 10.  a. Write a Java Program that creates two threads object of Thread class. Where one thread asks the user to enter a number not less than four digits. Split the digits of the number and display in words the value of the number. Ex: 1 – One. Second thread finding the number of vowels in a word. Ex: JAVA – Vowel - A, Count – 2. 
#### b.Write a program using java.net to transfer file from client socket to server socket.
