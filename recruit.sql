/*
SQLyog Ultimate v8.55 
MySQL - 5.5.5-10.1.37-MariaDB : Database - recruit
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`recruit` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `recruit`;

/*Table structure for table `application` */

DROP TABLE IF EXISTS `application`;

CREATE TABLE `application` (
  `id` bigint(20) NOT NULL,
  `application_status` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `related_offer` varchar(50) DEFAULT NULL,
  `resume` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `application` */

insert  into `application`(`id`,`application_status`,`email`,`related_offer`,`resume`) values (1,'applied','pawan@gmail.com','java developer','pawan resume'),(2,'rejected','bhavesh@gmail.comq','.Net developer','bhavesh resume'),(3,'applied','aditya@gmail.com','SAP developer','aditya resume');

/*Table structure for table `offer` */

DROP TABLE IF EXISTS `offer`;

CREATE TABLE `offer` (
  `id` bigint(20) NOT NULL,
  `application` varchar(255) DEFAULT NULL,
  `job_title` varchar(50) DEFAULT NULL,
  `start_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_pv9jibyjqyv001kf39cfjhaxn` (`job_title`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `offer` */

insert  into `offer`(`id`,`application`,`job_title`,`start_date`) values (1,'8','.Net developer','26-10-2020'),(2,'4','java developer','22-10-2020'),(3,'10','SAP developer','22-10-2020');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
