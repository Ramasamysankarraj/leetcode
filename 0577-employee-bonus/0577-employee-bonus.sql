# Write your MySQL query statement below
select t1.name as name ,t2.bonus as bonus 
from Employee as t1 left join Bonus as t2
on t1.empId = t2.empId
where bonus <1000 or bonus is null;