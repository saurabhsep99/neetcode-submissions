Select e.employee_id , 
Case
    WHEN e.employee_id%2=1 and e.name NOT LIKE 'M%'
    THEN  e.salary

ELSE 
    0
End as bonus
from employees  e
ORDER BY e.employee_id;

