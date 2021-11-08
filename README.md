# Phase-III

SportyShoes

WEB APPLICATION : sportyshoes.com

DEVELOPED BY : GANAPATHI N 

1)DOWNLOAD THE ZIP FILE 

2)RUN THE APPLICATION IN ECLIPSE IDE

3)DATABASE SIDE RUN THE CREATE QUERIES IN MYSQL FILE :

create table Admin(admincode varchar(20),username varchar(20),password varchar(20));

create table Product(product_id varchar(20), catagories varchar(20),brand varchar(20),price int(20),sz int(20));

create table User(first_name varchar(20),last_name varchar(20),username varchar(20),password varchar(20));

select * from Admin;

select * from Product;

select * from User;

4)IN REST CLIENT TO CREATE ADMIN  :

METHOD : POST 

URL : http://localhost:9090/api/admin/signup/createadmin 

BODY:

[{
  "admincode":"admin1@comviva",
  "username":"RAJ",
  "password":"root@2"
}]



5) IN REST CLIENT TO CREATE USER  :

METHOD : POST

URL : http://localhost:9090/api/user/createuser

BODY :

[{
  "first_name":"RAJ",
  "last_name":"N",
  "username":"raj1@comviva",
  "password":"user@3"
}]


6) IN REST CLIENT , STORE ALL THESE DATA BEFORE VIEW PRODUCTS :

METHOD : POST

URL :http://localhost:9090/api/admin/addProducts/storeproducts

BODY   :

[
{
  "product_id":"OFFICE 101",
  "catagories":"OFFICE SHOES",
  "brand":"VAN HUSIEN",
  "price": 25500,
  "sz":10
},
{
  "product_id":"CASUAL 101",
  "catagories":"CASUAL SHOES",
  "brand":"SPARX",
  "price": 17000,
  "sz":10
},
{
  "product_id":"FORMAL 101",
  "catagories":"FORMAL SHOES",
  "brand":"BATA",
  "price":6000,
  "sz":11
},
{
  "product_id":"SPORTS 101",
  "catagories":"SPORTS SHOES",
  "brand":"NIKE",
  "price": 12500,
  "sz":11
},
{
  "product_id":"OFFICE 102",
  "catagories":"OFFICE SHOES",
  "brand":"VAN HUSIEN",
  "price": 13500,
  "sz":9
},
{
  "product_id":"CASUAL 102",
  "catagories":"CASUAL SHOES",
  "brand":"SPARX",
  "price": 4000,
  "sz":7
},
{
  "product_id":"FORMAL 102",
  "catagories":"FORMAL SHOES",
  "brand":"BATA",
  "price":5000,
  "sz":8
},
{
  "product_id":"SPORTS 102",
  "catagories":"SPORTS SHOES",
  "brand":"PUMA",
  "price": 14500,
  "sz":11
}
]

