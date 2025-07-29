DROP TABLE IF EXISTS Persons;

CREATE TABLE Persons (
                         PersonID int UNIQUE AUTO_INCREMENT NOT NULL,
                         LastName varchar(255) NOT NULL,
                         FirstName varchar(255) NOT NULL,
                         Gender varchar(80) NOT NULL,
                         Title varchar(255) NOT NULL,
                         Nat varchar(255) NOT NULL,
                         City varchar(255) NOT NULL,
                         Street varchar(255) NOT NULL,
                         HouseNumber varchar(50) NOT NULL

);


INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, City, Street, HouseNumber) VALUES ('Jane', 'Doe', 'female', 'Mrs', 'US', 'New York', '5th Street', '1224');

select * from Persons;

DELETE from Persons ;

drop table Persons;
