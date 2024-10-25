# Write your MySQL query statement below

SELECT name from Employee where id in(SELECT managerId from Employee where managerId is not null group by managerId Having count(*)>=5);
