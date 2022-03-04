# Glossary for database

## Entities
---------------------------------------------------------------------------
#### Entity 1: student_info
Synonms: student <br>
Desciption: A person who goes to UIC for education.

#### Entity 2: student_contact_info
Synonms: Contact <br>
Description: Information to reach the particular individual.


#### Entity 3: uic_classes
Synonms: Class <br>
Description: The classes the individual is taking.

#### Entity 4: vaccination_card
Synonms: Vaccination Info <br>
Description: Previous history of the individuals vaccination history. 

#### Entity 5: payment
Synonms: Money <br>
Description: Payment info if the individual has a reservation. 

#### Entity 6: reservation
Synonms: Appointment <br>
Description: Reserving a time for a COVID test. 

#### Entity 7: uic_covid_database
Synonms: Cases <br>
Description: Main database in which we have the statistics of COVID cases at UIC. 

#### Entity 8: login_user
Synonms: login, credentials <br>
Description: Users login information. 

## Relationship
---------------------------------------------------------------------------
student_info-has-uic_classes
~~~
Maxima: many - many
Minima: one - one
~~~

student_info-has-student_contact_info
~~~
Maxima: one - one
Minima: one - zero
~~~

student_info-has-vaccination_card
~~~
Maxima: one - one
Minima: one - zero
~~~

student_info-has-payment
~~~
Maxima: one - many
Minima: one - one
~~~

student_info-has-reservation
~~~
Maxima: one - many
Minima: one - one
~~~

uic_covid_database-has-student_info
~~~
Maxima : one - many
Minima: one - one
~~~
## Attribute Minima
---------------------------------------------------------------------------
~~~
Entity 1: student_info
    `UIN` 			required
    `CRN` 			required
    `rec_status` 		required
    `housing_status` 		required
    `symp_status` 		required
    `quarantine_start`  	required
    `quarantine_end`  		required
    `last_test_result`  	optional
    `vaccine_status`  		optional
    `recent_travel_status`  	optional
	
Entity 2: student_contact_info
    `UIN` 			required
    `phone_number` 		required
    `email` 		    	required
    `emergency_contant` 	optional

Entity 3: uic_classes
    `CRN`			required
    `UIN_of_class` 		required

Entity 4: vaccination_card
    `UIN`			required
    `Name` 			required
    `first_dose` 		required
    `second_dose` 		required
    `booster_dose` 		optional
    `name_of_vaccine` 		required

Entity 5: payment
    `UIN` 			required
    `payment_date` 		required
    `duration_of_stay` 		required
    `amount` 			required
    `payment_id` 		optional

Entity 6: reservation
    `UIN` 			required
    `reservation_date` 		required
    `reservation_status` 	required
    `insurance_status` 		optional

Entity 7: uic_covid_database
    `UIN` 			required
    `total_cases` 		required
    `active_cases` 		required
    `cured_cases` 		required
    `test_result` 		required
    `vaccinated_count` 		required
    `unvaccinated_count` 	required

Entity 8: login_user
    `UIN` 			optional
    `user_name` 		required
    `user_password` 		required
~~~

## Attribute Types and Cardinality
---------------------------------------------------------------------------
~~~
Entity 1: student_info
    `UIN` 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `CRN` 			INT NOT NULL,
    `rec_status` 		INT NOT NULL,
    `housing_status` 		INT NOT NULL,
    `symp_status` 		INT NOT NULL,
    `quarantine_start` 		DATE NOT NULL,
    `quarantine_end` 		DATE NOT NULL,
    `last_test_result` 		INT NOT NULL,
    `vaccine_status` 		INT NOT NULL,
    `recent_travel_status`  INT NOT NULL

Entity 2: student_contact_info
    `UIN` 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `phone_number` 		INT NOT NULL,
    `email` 			INT NOT NULL,
    `emergency_contant` 	INT NOT NULL

Entity 3: uic_classes
    `CRN`			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `UIN_of_class` 		INT NOT NULL

Entity 4: vaccination_card
    `UIN`			INT NOT NULL,
    `Name`	         	VARCHAR(255) NOT NULL,
    `first_dose` 		DATE NOT NULL,
    `second_dose` 		DATE NOT NULL,
    `booster_dose` 		DATE NOT NULL,
    `name_of_vaccine` 		VARCHAR(255) NOT NULL

Entity 5: payment
    `UIN` 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `payment_date` 		DATETIME NOT NULL,
    `duration_of_stay` 		INT NOT NULL,
    `amount` 			DECIMAL(8, 2) NOT NULL,
    `payment_id` 		INT NOT NULL

Entity 6: reservation
    `UIN` 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `reservation_date` 		DATETIME NOT NULL,
    `reservation_status` 	TINYINT(1) NULL,
    `insurance_status` 		TINYINT(1) NULL

Entity 7: uic_covid_database
    `UIN` 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `total_cases` 		INT NOT NULL,
    `active_cases` 		INT NOT NULL,
    `cured_cases` 		INT NOT NULL,
    `test_result` 		INT NOT NULL,
    `vaccinated_count` 		INT NOT NULL,
    `unvaccinated_count` 	INT NOT NULL

Entity 8: login_user
    `UIN` 			INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `user_name` 		VARCHAR(255) NOT NULL,
    `user_password` 		VARCHAR(255) NOT NULL

~~~
