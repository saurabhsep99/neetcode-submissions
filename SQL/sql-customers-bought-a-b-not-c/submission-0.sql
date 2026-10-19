-- Write your query below
Select c.customer_id,c.customer_name from customers c
WHERE c.customer_id IN (
    Select o.customer_id from orders o where o.product_name ='A'
)
AND c.customer_id IN (
    Select o.customer_id from orders o where o.product_name ='B' 
)

AND c.customer_id NOT IN (
    Select o.customer_id from orders o where o.product_name ='C'
)
ORDER BY c.customer_name;