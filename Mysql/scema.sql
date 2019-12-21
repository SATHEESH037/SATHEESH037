select * from HR.employees;  
select salary from HR.employees where salary>12000 GROUP BY salary;
select salary from HR.employees where salary>12000 GROUP BY salary HAVING(salary) > 20000;