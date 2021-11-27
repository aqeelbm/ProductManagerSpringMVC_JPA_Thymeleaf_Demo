
# Product Manager Application

## Spring MVC, Spring Data JPA, Thymeleaf and MySQL

This is demonstration of an simple CRUD web application using Java Spring MVC, Spring Data JPA with web template as Thymeleaf and MySql as 
A database to store, update and delete records.



### Steps to Configure App

**1-Clone the app**
```
git clone 
```

**2-Create MySql database**
```
create database productdb
```
Create table
```
CREATE TABLE productdb.product (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `madein` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
)
```


**3-Change MySql credentials**

- Open ``` src/main/resources/db.properties ```
- Change ``` spring.datasource.username=``` and ```spring.datasource.password=```


4-Build and run the app using maven
```
Man package
```
