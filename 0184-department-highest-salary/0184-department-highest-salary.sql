# Write your MySQL query statement below
select t2.name as department,t1.name as employee, salary as salary from Employee as t1 inner join
Department as t2 
on t1.departmentId = t2.id
where salary = (select max(e.salary) from Employee as e 
where e.departmentID = t1.departmentId);