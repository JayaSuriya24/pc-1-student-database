-- create the database called school
CREATE DATABASE IF NOT  EXISTS `school`;
--use the school database
USE `school`;
--create the table called name student
CREATE TABLE IF NOT EXISTS `school`.`student`(
`roll_number` int not null primary key ,
`name` varchar(40) not null,
`grade` char not null
);
--query to select all the values in the table
SELECT * FROM school.student;