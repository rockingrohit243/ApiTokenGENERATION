create table course
(
id bigint not null,
name    varchar(10) not null,
username varchar(10) not null,
mobilenumber bigint not null,
email varchar(20) not null,
password varchar(10) not null,
primary key(username)
);