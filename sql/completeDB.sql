-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: uic_covid_database
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student_contact_info`
--

DROP TABLE IF EXISTS `student_contact_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_contact_info` (
  `UIN` int NOT NULL AUTO_INCREMENT,
  `PhoneNumber` varchar(15) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Emergency_ContactNumber` varchar(15) NOT NULL,
  PRIMARY KEY (`UIN`)
) ENGINE=InnoDB AUTO_INCREMENT=980713256 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_contact_info`
--

LOCK TABLES `student_contact_info` WRITE;
/*!40000 ALTER TABLE `student_contact_info` DISABLE KEYS */;
INSERT INTO `student_contact_info` VALUES (67898730,'3126471688','aagraw26@uic.edu','3126471688'),(705917324,'3126160416','sgedam24@uic.edu','3126471688'),(908723454,'3126712402','apatel24@uic.edu','3121791322'),(980713242,'3128769837','akpatel24@uic.edu','3128973059'),(980713255,'3129807234','smittal2@uic.edu','3126512783');
/*!40000 ALTER TABLE `student_contact_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_info` (
  `UIN` int unsigned NOT NULL AUTO_INCREMENT,
  `CRN` int NOT NULL,
  `rec_status` int NOT NULL,
  `housing_status` int NOT NULL,
  `symp_status` int NOT NULL,
  `quarantine_start` date NOT NULL,
  `quarantine_end` date NOT NULL,
  `last_test_result` int NOT NULL,
  `vaccine_status` int NOT NULL,
  `recent_travel_status` int NOT NULL,
  PRIMARY KEY (`UIN`)
) ENGINE=InnoDB AUTO_INCREMENT=987612347 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
INSERT INTO `student_info` VALUES (632523140,13529,0,1,1,'2022-03-01','2022-01-17',0,1,0),(632547123,15830,0,0,0,'2022-02-16','2022-02-03',1,0,1),(632547896,15830,0,0,0,'2022-02-16','2022-02-03',1,0,1),(645214321,14257,0,1,0,'2022-01-18','2022-01-02',1,1,1),(645214583,14257,0,1,0,'2022-01-18','2022-01-02',1,1,1),(652145236,13529,0,1,1,'2022-03-01','2022-01-17',0,1,0),(678791230,13189,1,1,0,'2022-03-03','2022-03-17',0,1,1),(678794567,13189,1,1,0,'2022-03-03','2022-03-17',0,1,1),(678798730,13189,1,1,0,'2022-03-03','2022-03-17',0,1,1),(769310015,15432,1,0,1,'2021-12-15','2021-12-29',1,0,1),(769321487,15432,1,0,1,'2021-12-15','2021-12-29',1,0,1),(769341036,15432,1,0,1,'2021-12-15','2021-12-29',1,0,1),(897532325,13529,0,1,1,'2022-03-01','2022-01-17',0,1,0),(987452732,15830,0,0,0,'2022-02-16','2022-02-03',1,0,1),(987612346,14257,0,1,0,'2022-01-18','2022-01-02',1,1,1);
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uic_classes`
--

DROP TABLE IF EXISTS `uic_classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uic_classes` (
  `UIN` int NOT NULL AUTO_INCREMENT,
  `CRN` int NOT NULL,
  PRIMARY KEY (`UIN`)
) ENGINE=InnoDB AUTO_INCREMENT=875421366 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uic_classes`
--

LOCK TABLES `uic_classes` WRITE;
/*!40000 ALTER TABLE `uic_classes` DISABLE KEYS */;
INSERT INTO `uic_classes` VALUES (452136587,4110054),(652132548,431256),(654215874,4102540),(654369872,4136540),(875421365,5421365);
/*!40000 ALTER TABLE `uic_classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaccination_card`
--

DROP TABLE IF EXISTS `vaccination_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaccination_card` (
  `UIN` int NOT NULL,
  `Name` varchar(255) NOT NULL,
  `first_dose` date NOT NULL,
  `second_dose` date NOT NULL,
  `booster_dose` int DEFAULT NULL,
  `name_of_vaccine` varchar(255) NOT NULL,
  PRIMARY KEY (`UIN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccination_card`
--

LOCK TABLES `vaccination_card` WRITE;
/*!40000 ALTER TABLE `vaccination_card` DISABLE KEYS */;
INSERT INTO `vaccination_card` VALUES (632148741,'Vedant','2021-07-06','2021-07-09',1,'Covax'),(632523140,'Andrea','2021-06-24','2021-09-24',0,'Pfizer'),(632547896,'John','2021-06-15','2021-08-16',1,'Pfizer'),(645214583,'Ganesh','2021-06-08','2021-06-11',0,'Pfizer'),(652145236,'Sahil','2021-07-15','2021-11-15',0,'CoviShield');
/*!40000 ALTER TABLE `vaccination_card` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-31 15:54:30
