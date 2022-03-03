# Glossary for database

## Entities

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

student_info-has-uic_classes

Maxima: many - many
Minima: one - one

student_info-has-student_contact_info

Maxima: one - one
Minima: one - zero

student_info-has-vaccination_card

Maxima: one - one
Minima: one - zero

student_info-has-payment

Maxima: one - many
Minima: one - one

student_info-has-reservation

Maxima: one - many
Minima: one - one

uic_covid_database-has-student_info

Maxima : one - many
Minima: one - one
