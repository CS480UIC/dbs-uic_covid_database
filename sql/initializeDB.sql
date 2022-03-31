DROP DATABASE uic_covid_dataabase; 

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

CREATE TABLE student_info
(
UIN INT UNSIGNED NOT NULL AUTO_INCREMENT,
CRN INT NOT NULL,
rec_status INT NOT NULL,
housing_status INT NOT NULL,
symp_status INT NOT NULL,
quarantine_start DATE NOT NULL,
quarantine_end DATE NOT NULL,
last_test_result INT NOT NULL,
vaccine_status INT NOT NULL,
recent_travel_status INT NOT NULL,

PRIMARY KEY(UIN)
); 

CREATE TABLE vaccination_card
(
UIN INT NOT NULL,
Name VARCHAR(255) NOT NULL,
first_dose DATE NOT NULL,
second_dose DATE NOT NULL,
booster_dose DATE,
name_of_vaccine VARCHAR(255) NOT NULL,

PRIMARY KEY(UIN)
);