REM   Script: Activity2
REM   Session1_Activity2

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5001, 'James Hoog','New York', 15);

INSERT ALL  
    INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES (5005, 'Pit Alex','London', 11) 
    INTO salesman VALUES (5003, 'Lauson Hen','New York', 12) 
    INTO salesman VALUES (5007, 'Paul Adam','Rome', 13) 
    INTO salesman VALUES (5007, 'McLyon','Paris', 14) 
SELECT 1 FROM DUAL;

Select * from salesman;

