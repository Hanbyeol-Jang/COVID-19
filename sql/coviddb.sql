create database if not exists coviddb;
use coviddb;

CREATE TABLE `user_info` (
	`id` 		varchar(20)	NOT NULL,
	`pwd` 		varchar(30)	NOT NULL,
	`uname` 	varchar(20) NOT NULL,
    `birth` 	varchar(20),
    `gender`	varchar(20),
    `email` 	varchar(40),
    `phone` 	varchar(20),
	PRIMARY KEY (`id`),
	UNIQUE KEY 	(`id`)
);

INSERT INTO user_info(id, pwd, uname, birth, gender, email, phone) 
VALUES('admin', 'admin', 'admin', '2020-01-01', 'male', 'admin@admin.com', '010-1234-1234');

commit;

