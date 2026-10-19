-- Write your query below

select c.name from customers c
 LEFT JOIN orders o
ON o.customer_id = c.id
where o.customer_id IS Null;
