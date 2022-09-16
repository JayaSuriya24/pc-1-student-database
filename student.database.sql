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
-- query to insert the values inside the table for all the fields
--query for rollNumber 624
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`) VALUES ('624', 'suriya', 'a');
--query for rollNumber 625
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`) VALUES ('625', 'ajay', 'b');
--query for rollNumber 626
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`) VALUES ('626', 'stanley', 'c');
--query for rollNumber 627
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`) VALUES ('627', 'sugeen', 'c');
--query for rollNumber 628
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`) VALUES ('628', 'hari', 'a');
