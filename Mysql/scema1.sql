select *FROM HR.employees;
select first_name,salary from HR.employees where job_id = (select job_id from HR.employees where employee_id=115);
select first_name,salary,job_id,employee_id from HR.employees where job_id in (select job_id from HR.employees where employee_id>115);
select first_name,salary,hr.employees.email,phone_number from HR.employees where job_id < (select job_id from HR.employees where employee_id=115);
------------------------------------------------------------------------------------------------
select *from HR.employees where mod(employee_id , 2)=0;
select*from(select first_name,last_name,salary
select max(salary)from HR.employees

--------------------------------------------------------------------------
select hr.employees.employee_id,HR.employees.first_name,hr.departments.department_id,hr.departments.department_name from HR.employees
left join hr.departments on
hr.employees.employee_id=hr.departments.department_id ;
-------------------------------------------------------------------

select *from HR.employees where salary<10000; 
-----------------------------------------------
select first_name,hire_date from HR.employees
where to_char(hire_date, 'yyyy')between 2002 and 2005 order by hire_date;
--------------------------------------------------------
select *from HR.employees where hire_date >'01-01-08';
--------------------------------------------------------
select *from HR.employees where employee_id in (150,160);
---------------------------------------------------------
select employee_id,first_name,salary,commission_pct,hire_date from HR.employees where salary<10000;
-----------------------------------------------------------
select *FROM HR.jobs;
select job_title,MAX_salary-MIN_salary difference from HR.jobs where MAX_salary between 10000 AND 20000;
-----------------------------------------------------------
select salary,first_name,employee_id, ROUND(salary,3) from hr.employees;
------------------------------------------------------------
select *from HR.jobs order by job_title;
-------------------------------------------------------------
select first_name,last_name from hr.employees where first_name like 's%' or last_name like 's%';
 -  ----------------------------------------------------------
select*from HR.employees where to_char(hire_date,'MON')='MAY';
--------------------------------------------------------------
select *from HR.employees where commission_pct is null AND salary between 5000 AND 10000 AND department_id=30;
------------------------------------------------------------------------
select first_name,hire_date, last_day(hire_date)+1 from HR.employees;
--------------------------------------------------------------------------
select first_name,hire_date, floor((sysdate-hire_date)/365) from hr.employees;
---------------------------------------------------------------------------
select first_name,hire_date from hr.employees where to_char(hire_date, 'yyyy')=2001;
------------ ---------------------------------------------------
select INITCAP(first_name), INITCAP(last_name) from hr.employees;
-------------------------------------------------------------------
select job_title, substr(job_title,1, instr(job_title, ' ')-1)from HR.jobs;
-----------------------------------------------------------------
select first_name,last_name from HR.employees where INSTR(last_name, 'b')>3;
-----------------------------------------------------------------
select UPPER(first_name),LOWER(email) from hr.employees where UPPER(first_name)=UPPER(email);
----------------------------------------------------------------
SELECt* from HR.employees where to_char(hire_date,'yyyy')=to_char(sysdate,'yyyy');

-----------------------------------------------------------------
-----   index  -----
SELECT *FROM HR.sc
create INDEX fruit on HR.locations(location_id);

------------------------------------------------------------------
---------------- view ------------------------
create view val as select salary,first_name,employee_id from HR.employees where salary > 5000;
select * from val;
-----------------------------------------------------------------------
select * from HR.employees


SELECT *
FROM hr.Employees e
WHERE 3=(SELECT COUNT(DISTINCT Salary) FROM hr.Employees p
WHERE e.Salary<=p.Salary)

select max(salary) from HR.employees









