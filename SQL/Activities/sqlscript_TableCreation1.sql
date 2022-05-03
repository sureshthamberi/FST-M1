REM   Script: Session 02_Table_insertion
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

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
   commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
   commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
   commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
   commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
   commission int 
);

DESCRIBE salesman


INSERT into salesman ( 
    1, 
    'suresh', 
    'Bangalore', 
   2 
);

INSERT into salesman values( 
    1, 
    'suresh', 
    'Bangalore', 
   2 
);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

