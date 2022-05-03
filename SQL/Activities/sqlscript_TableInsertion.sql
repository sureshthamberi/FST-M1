REM   Script: Session 03_Table_selection
REM   table selection

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

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

ALTER TABLE salesman 
ADD (age int , sex char);

SELECT * FROM salesman;

ALTER TABLE salesman 
DROP COLUMN sex;

SELECT * FROM salesman;

ALTER TABLE salesman 
ADD (sex varchar2(10));

SELECT * FROM salesman;

update table salesman set age=20;

update salesman set age=20;

SELECT * FROM salesman;

update salesman set age=20 where SALESMAN_ID='5005';

SELECT * FROM salesman;

delete from salesman where SALESMAN_ID='5005';

SELECT * FROM salesman;

rollback


SELECT * FROM salesman;

delete from salesman where SALESMAN_ID='5005';

rollback


SELECT * FROM salesman;

delete from salesman where SALESMAN_ID='1';

SELECT * FROM salesman;

rollback


SELECT * FROM salesman;

SELECT * FROM salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
     
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'MM/YYYY/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'DD/YYYY/MM'), 3004, 5006) 
     
     
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
     
    INTO orders VALUES(70008, 5760, TO_DATE('08/2012/15', 'MM/YYYY/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('10/2012/10', 'DD/YYYY/MM'), 3004, 5006) 
     
     
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders;

select * from orders where order_no between 70001 to 70004;

select * from orders where order_no between 70001 to 70004;

select * from orders;

select * from orders where order_no between 70001 and 70004;

select * from orders;

select * from orders where order_no = 70001 or PURCHASE_AMOUNT=5760;

select * from orders;

select * from orders where order by PURCHASE_AMOUNT,order_no;

select * from orders order by PURCHASE_AMOUNT,order_no;

select * from orders;

select * from orders order by salesman_id,order_no;

select * from orders;

select * from orders order by salesman_id,order_no;

