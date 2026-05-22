# Write your MySQL query statement below
 select t1.product_name as product_name,sum(t2.unit) as unit
 from Products as t1 left join Orders as t2
 on t1.product_id = t2.product_id
 where t2.order_date>='2020-02-01' and t2.order_date<'2020-03-01'
GROUP BY t1.product_id
HAVING SUM(t2.unit) >= 100; 