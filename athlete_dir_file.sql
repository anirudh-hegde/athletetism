CREATE DATABASE  IF NOT EXISTS `athlete_directory`;
USE `athlete_directory`;


DROP TABLE IF EXISTS `athlete`;

CREATE TABLE `athlete` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int(2) DEFAULT NULL,
  `competingsport` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



INSERT INTO `athlete` VALUES 
	(1,'Rahul','Sharma','20','javelin'),
	(2,'Shane','Warne','24','high-jump'),
	(4,'Yuri','Petrov','21','triple-jump'),
	(5,'Milka','Singh','22','sprints');
