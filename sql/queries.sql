use uic_covid_database;

-- Simple Queries

select first_dose, second_dose
from vaccination_card
where Name = "Vedant";

select *
from student_info
where rec_status = 1
order by UIN;

select *
from vaccination_card
where vaccine_status > 0;

-- Aggregrate Queries

select Name, count(*) as total_students
from student_info
group by UIN
HAVING COUNT(*)=1;

select *
from vaccination_card
where name_of_vaccine like '%Pfizer%';

select UIN, first_dose, date(second_dose) as second_dose_date
from vaccination_card
group by second_dose_date;

-- Complex Queries

select a.vaccine_status, b.first_dose, b.second_dose, b.booster_dose
from student_info a
left join vaccination_card b
on a.UIN = b.UIN
where b.booster_dose >= 0;

select *
from student_info
WHERE symp_status IN (SELECT symp_status FROM student_info WHERE symp_status > 0);

