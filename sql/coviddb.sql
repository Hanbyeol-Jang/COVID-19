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

CREATE TABLE `covid_overview` (
	`confirmed`		int 		NOT NULL,		# 확진자
    `recovered`		int 		NOT NULL,		# 격리해제
    `active`		int 		NOT NULL,		# 격리중
	`deaths`		int 		NOT NULL,		# 사장
    `date`			varchar(20) NOT NULL
);

INSERT INTO covid_overview(confirmed, recovered, active, deaths, date)
VALUES(12563, 10974, 1307, 282, '2020-06-25');

commit;
