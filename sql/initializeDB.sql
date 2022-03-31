CREATE DATABASE uic_covid_database;

use uic_covid_database;

CREATE TABLE uic_classes
(
UIN INT NOT NULL auto_increment,
CRN INT NOT NULL,
PRIMARY KEY (UIN)
);

CREATE TABLE student_contact_info
(
UIN INT NOT NULL auto_increment,
PhoneNumber varchar(15) NOT NULL,
Email varchar(255) NOT NULL,
Emergency_ContactNumber varchar(15) NOT NULL,
PRIMARY KEY (UIN)
);