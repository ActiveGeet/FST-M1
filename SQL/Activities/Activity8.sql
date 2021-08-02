REM   Script: Activity8
REM   Session2_Activity8

Select * from orders;

Select customer_id, MAX(purchase_amount) as "Highest Purchase Amount" from orders group by customer_id;

Select salesman_id, order_date, MAX(purchase_amount) as "Highest Purchase Amount" from orders where order_date = To_Date('2012/08/17','YYYY/MM/DD') group by salesman_id, order_date;

Select customer_id, order_date, MAX(purchase_amount) as "Highest Purchase Amount" from orders  
group by customer_id, order_date having MAX(purchase_amount) in (2030, 3450, 5760, 6000);

