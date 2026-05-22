# Write your MySQL query statement below
select t2.product_name as product_name,t1.year as year ,t1.price as price 
from Sales as t1 left join Product as t2
on t1.product_id = t2.product_id;