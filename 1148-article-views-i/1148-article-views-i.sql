# Write your MySQL query statement below
select distinct t1.author_id as id from Views as t1
join Views as t2
on t2.viewer_id = t1.author_id
where t2.viewer_id = t1.viewer_id
order by id asc;