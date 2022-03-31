use uic_covid_database;

-- Simple Queries

select first_dose, second_dose
from vaccination_card
where Name = "Annsh Agrawaal";

select *
from student_info
where rec_status = 1
order by UIN;

select *
from student_info
where vaccine_status > 0;

-- Aggregrate Queries

select Name, count(*) as total_students
from student_info
group by UIN
HAVING COUNT(*)=1;

select *
from vaccination_card
where name_of_vaccine like '%Pfizer%';

select first_dose, date(booster_dose) as booster_dose_date
from vaccination_card;


-- Complex Queries

select a.vaccine_status, b.first_dose, b.second_dose, b.booster_dose
from student_info a
left join vaccination_card b
on a.UIN = b.UIN;

select *
from student_info
WHERE symp_status IN (SELECT symp_status FROM student_info WHERE symp_status > 0);

