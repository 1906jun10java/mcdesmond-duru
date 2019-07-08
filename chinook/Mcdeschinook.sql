--2.1 SELECT
--Task – Select all records from the Employee table.

SELECT * FROM EMPLOYEE; 
/
--Task – Select all records from the Employee table where last name is King.

SELECT * FROM EMPLOYEE WHERE LASTNAME = 'King';
/
--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

SELECT * FROM EMPLOYEE WHERE FIRSTNAME = 'Andrew' AND REPORTSTO is NULL;
--evidently REPORTSTO = NULL & REPORTSTO IS NULL produce two different results
/

--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.

SELECT * FROM ALBUM ORDER BY TITLE desc;
/
--Task – Select first name from Customer and sort result set in ascending order by city

SELECT FIRSTNAME FROM CUSTOMER ORDER BY CITY ASC;

--2.3 INSERT INTO
--Task – Insert two new records into Genre table 

INSERT INTO GENRE (GENREID,NAME) VALUES (30,'CHILLWAVE');
INSERT INTO GENRE (GENREID,NAME) VALUES (33, 'House');
/
--Task – Insert two new records into Employee table

INSERT INTO EMPLOYEE (EMPLOYEEID,LASTNAME,firstname,title,reportsto,birthdate,hiredate,address,CITY,STATE,country,postalcode,phone,FAX,EMAIL) VALUES (9, 'Duru','McDesmond','Engineer', '1', TO_DATE('1990-08-12','yyyy-mm-dd'),TO_DATE('2019-07-05','yyyy-mm-dd'),'1234 Wishful Lane','Charlotte','NC','USA','28213','+1 793 747-8787','+1 793 747-4478', 'mcdduru@gmail.com');
INSERT INTO EMPLOYEE (EMPLOYEEID,LASTNAME,firstname,title,reportsto,birthdate,hiredate,address,CITY,STATE,country,postalcode,phone,FAX,EMAIL) VALUES (10, 'Jack','Holland','Sr. Engineer', '1', TO_DATE('1990-12-12','yyyy-mm-dd'),TO_DATE('2019-07-05','yyyy-mm-dd'),'1234 Different St','Charlotte','NC','USA','28287','+1 793 342-3435','+1 793 546-4664', 'jack@gmail.com');
/
--Task – Insert two new records into Customer table

INSERT INTO customer (CUSTOMERID, FIRSTNAME, LASTNAME, COMPANY, ADDRESS, CITY, STATE, COUNTRY, POSTALCODE,PHONE,fax, EMAIL,SUPPORTREPID) VALUES(368, 'Al', 'Franken', 'Government', '2634 Near Whitehouse Lane', 'Norfolk','VA','USA','28246','+1 847 747 7474','+1 847 747 4749','allyal@hotmail.com','3');
INSERT INTO customer (CUSTOMERID, FIRSTNAME, LASTNAME, COMPANY, ADDRESS, CITY, STATE, COUNTRY, POSTALCODE,PHONE, EMAIL,SUPPORTREPID) VALUES(345, 'Duey', 'Newton', 'Music Factory', '647 Blackhouse St', 'Baltimore','MD','USA','44873','+1 854 748 8384','duhu@gmail.com','5');
/
--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter

UPDATE customer
SET firstname = 'Robert', lastname = 'Walter'
WHERE customerid = 32;
/
--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”	

UPDATE artist
SET name = 'CCR'
WHERE artistid = 76;
/
--2.5 LIKE
--Task – Select all invoices with a billing address like “T%” 
SELECT * FROM invoice 
where billingaddress like 'T%';
/
--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50
SELECT * FROM invoice 
where total between 15 and 50;
/
--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
SELECT * FROM employee 
where hiredate between '01-JUN-03' and '01-MAR-04';
/
--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
DELETE FROM customer
WHERE customerid = 32;


--3.1 System Defined Functions
--Task – Create a function that returns the current time.
CREATE OR REPLACE FUNCTION CURRENTTIME
(time number)
RETURN TIME is
BEGIN
RETURN time; 
END;

--Task – create a function that returns the length of name in MEDIATYPE table
CREATE OR REPLACE FUNCTION NAMELENGTH
()
RETURN number 
BEGIN
from MEDIATYPE
RETURN name.length;
END;


--3.2 System Defined Aggregate Functions
--Task – Create a function that returns the average total of all invoices 
CREATE OR REPLACE FUNCTION avg_total
()
RETURN number
BEGIN
RETURN ();
END;



--Task – Create a function that returns the most expensive track
CREATE OR REPLACE FUNCTION mostexp
()
RETURN TIME
BEGIN
RETURN
END;



--3.3 User Defined Scalar Functions
--Task – Create a function that returns the average price of invoice line items in the invoiceline table
CREATE OR REPLACE FUNCTION avrg
()
RETURN TIME
BEGIN
RETURN
END;


--3.4 User Defined Table Valued Functions
--Task – Create a function that returns all employees who were born after 1968.
CREATE OR REPLACE FUNCTION born
()
RETURN TIME
BEGIN
RETURN
END;

--4.1 Basic Stored Procedure
--Task – Create a stored procedure that selects the first and last names of all the employees.
CREATE PROCEDURE NAMES
() AS 
BEGIN
COMMIT;
END;


--4.2 Stored Procedure Input Parameters
--Task – Create a stored procedure that updates the personal information of an employee.
CREATE PROCEDURE PERSONALUPDATE
() AS 
BEGIN
COMMIT;
END;
--Task – Create a stored procedure that returns the managers of an employee.
CREATE PROCEDURE MANAGERS
() AS 
BEGIN
COMMIT;
END;

--4.3 Stored Procedure Output Parameters
--Task – Create a stored procedure that returns the name and company of a customer.
CREATE PROCEDURE CUSTOMER
() AS 
BEGIN
COMMIT;
END;

--5.0 Transactions
--Task – Create a transaction that given a invoiceId will delete that invoice (There may be constraints that rely on this, find out how to resolve them).
 CREATE OR REPLACE (invoiceId)

--6.1 AFTER/FOR
--Task - Create an after insert trigger on the employee table fired after a new record is inserted into the table.
create trigger updatemeployeetable
after
insert on employee

--Task – Create an after update trigger on the album table that fires after a row is inserted in the table
create trigger updatealbum
after
insert on album

--Task – Create an after delete trigger on the customer table that fires after a row is deleted from the table.
create trigger updatealbum
after
insert on album

--7.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
SELECT customer.lastname, customer.firstname, orders.
from customer
inner join orders on orders.customerID = customer.customerID;


--7.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
SELECT customer.firstname, customer.lastname,customer.total, invoice.invoiceid
from invoice
outer join customer on invoice.customerID = customer.customerID;

--7.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
SELECT album.title, artist.name
from artist
right join album on album.artistID = artist.artistID;

--7.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
SELECT album, artist
from artist
cross join album on album.artistID = artist.artistID;
order by artist.name asc;

--7.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.
SELECT employee.reportsto
from employee A, employee B
where a.reportsto <> b.reportsto
and a.reportsto = b.reportsto;
