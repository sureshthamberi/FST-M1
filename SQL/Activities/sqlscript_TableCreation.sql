REM   Script: Session 01_Table_Creation
REM   table creation

SELECT  
    first_name 
FROM 
    employees 
WHERE 
    YEAR(hire_date) = 2000;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
   commission int 
);

