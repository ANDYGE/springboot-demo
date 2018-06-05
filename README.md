# springboot-demo

## 数据库初始化
```sh
mysql -uroot -p
create database test;
show databases;
use test;
show tables;
create table tbl_user(id int not null auto_increment,name varchar(8),password varchar(8),constraint pk_user primary key(id));
show tables;
insert into tbl_user values(1,'zhang','111');
select * from tbl_user;
```