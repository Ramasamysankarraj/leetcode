# Write your MySQL query statement below
select t1.name as name ,sum(t2.amount) as balance
from Users as t1 join Transactions as t2
on t2.account = t1.account
group by t1.account
having sum(t2.amount) > 10000;