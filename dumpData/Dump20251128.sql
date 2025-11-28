-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: collegemanagement
-- ------------------------------------------------------
-- Server version	8.0.44

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
-- Table structure for table `admins`
--

DROP TABLE IF EXISTS `admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admins` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userId` int NOT NULL,
  `adminId` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `departmentId` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId` (`userId`),
  UNIQUE KEY `adminId` (`adminId`),
  KEY `fk_department` (`departmentId`),
  CONSTRAINT `admins_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`),
  CONSTRAINT `fk_department` FOREIGN KEY (`departmentId`) REFERENCES `departments` (`departmentId`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admins`
--

LOCK TABLES `admins` WRITE;
/*!40000 ALTER TABLE `admins` DISABLE KEYS */;
INSERT INTO `admins` VALUES (1,11,'ADMIN00012025','2012-02-12','New Delhi',NULL);
/*!40000 ALTER TABLE `admins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course_subjects`
--

DROP TABLE IF EXISTS `course_subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_subjects` (
  `subjectId` int NOT NULL AUTO_INCREMENT,
  `courseId` int NOT NULL,
  `semester` int NOT NULL,
  `type` enum('CLASS','LAB') DEFAULT NULL,
  `subjectName` varchar(100) NOT NULL,
  `subjectCode` varchar(20) NOT NULL,
  `description` text,
  `teachesBy` varchar(20) DEFAULT NULL,
  `shortName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`subjectId`),
  UNIQUE KEY `subjectCode` (`subjectCode`),
  KEY `courseId` (`courseId`),
  KEY `fk_teaches_by` (`teachesBy`),
  CONSTRAINT `course_subjects_ibfk_1` FOREIGN KEY (`courseId`) REFERENCES `courses` (`courseId`),
  CONSTRAINT `fk_teaches_by` FOREIGN KEY (`teachesBy`) REFERENCES `teachers` (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_subjects`
--

LOCK TABLES `course_subjects` WRITE;
/*!40000 ALTER TABLE `course_subjects` DISABLE KEYS */;
INSERT INTO `course_subjects` VALUES (1,1,1,'CLASS','Discrete Structures','MCA101',NULL,'FACULTY00022025','DS'),(2,1,1,'CLASS','Object Oriented Programming and JAVA','MCA102',NULL,'FACULTY00072025','JAVA'),(3,1,1,'CLASS','Database Management Systems','MCA103',NULL,'FACULTY00052025','DBMS'),(4,1,1,'CLASS','Computer Networks','MCA104',NULL,'FACULTY00082025','CN'),(5,1,1,'CLASS','Operating Systems with Linux','MCA105',NULL,'FACULTY00032025','OS'),(6,1,1,'LAB','Object Oriented Programming and JAVA Lab','MCA106',NULL,'FACULTY00072025','JAVA (lab)'),(7,1,1,'LAB','Database Management Systems Lab','MAC107',NULL,'FACULTY00052025','DBMS (lab)'),(8,1,1,'LAB','Computer Networks Lab','MCA108',NULL,'FACULTY00082025','CN (lab)'),(9,1,1,'LAB','Operating Systems with Linux Lab','MCA109',NULL,'FACULTY00032025','OS (lab)'),(10,1,1,'CLASS','IEEE Seminar','MCA110',NULL,NULL,'IEEE'),(11,1,1,'CLASS','Coporate Grooming','MCA111',NULL,NULL,'CG'),(12,1,1,'LAB','Placement Session','MCA112',NULL,NULL,'PS');
/*!40000 ALTER TABLE `course_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `courseId` int NOT NULL AUTO_INCREMENT,
  `courseName` varchar(100) NOT NULL,
  `courseCode` varchar(20) NOT NULL,
  `description` text,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `years` int NOT NULL,
  `semesters` int DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  UNIQUE KEY `courseCode` (`courseCode`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'MCA','MCA101','Master of Computer Applications','2025-11-24 19:10:02',2,4),(2,'BCA','BCA101','Bachelor of Computer Applications','2025-11-24 19:10:02',3,6),(3,'BTech','BTECH101','Bachelor of Technology','2025-11-24 19:10:02',4,8),(4,'BJAMC','BJAMC101','Bachelor of Journalism and Mass Communication','2025-11-24 19:10:02',4,8);
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departments` (
  `departmentId` int NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(100) NOT NULL,
  PRIMARY KEY (`departmentId`),
  UNIQUE KEY `departmentName` (`departmentName`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (2,'BVICAM'),(1,'BVIMR');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `studentId` int NOT NULL,
  `courseId` int NOT NULL,
  `enrolled_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `rollNo` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `father_name` varchar(20) DEFAULT NULL,
  `mother_name` varchar(20) DEFAULT NULL,
  `father_occu` varchar(30) DEFAULT NULL,
  `mother_occu` varchar(30) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `studentId` (`studentId`),
  UNIQUE KEY `rollNo` (`rollNo`),
  KEY `fk_student_course` (`courseId`),
  CONSTRAINT `fk_student_course` FOREIGN KEY (`courseId`) REFERENCES `courses` (`courseId`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_student_user` FOREIGN KEY (`studentId`) REFERENCES `users` (`userId`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,1,1,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,2,2,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,3,3,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,4,4,'2025-11-24 19:14:15','BJAMC00042025','2025-11-05','L D Joshi','Deepa Joshi','Government Job','House Wife','sarojini nagar'),(5,5,1,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,6,4,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,7,4,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,8,3,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,9,3,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,10,1,'2025-11-24 19:14:15',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjectclassrecord`
--

DROP TABLE IF EXISTS `subjectclassrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subjectclassrecord` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `subjectId` int NOT NULL,
  `faculty_id` varchar(15) NOT NULL,
  `week_total_classes` int NOT NULL,
  `week_taken_classes` int DEFAULT '0',
  `total_classes_till_date` int DEFAULT '0',
  PRIMARY KEY (`record_id`),
  KEY `subjectId` (`subjectId`),
  KEY `faculty_id` (`faculty_id`),
  CONSTRAINT `subjectclassrecord_ibfk_1` FOREIGN KEY (`subjectId`) REFERENCES `course_subjects` (`subjectId`),
  CONSTRAINT `subjectclassrecord_ibfk_2` FOREIGN KEY (`faculty_id`) REFERENCES `teachers` (`employeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjectclassrecord`
--

LOCK TABLES `subjectclassrecord` WRITE;
/*!40000 ALTER TABLE `subjectclassrecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `subjectclassrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachers` (
  `userId` int NOT NULL,
  `employeeId` varchar(15) DEFAULT NULL,
  `designation` varchar(50) DEFAULT NULL,
  `departmentId` int NOT NULL,
  `joiningDate` date DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `father_name` varchar(50) DEFAULT NULL,
  `mother_name` varchar(50) DEFAULT NULL,
  `father_occu` varchar(50) DEFAULT NULL,
  `mother_occu` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `employeeId` (`employeeId`),
  KEY `departmentId` (`departmentId`),
  CONSTRAINT `teachers_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`),
  CONSTRAINT `teachers_ibfk_2` FOREIGN KEY (`departmentId`) REFERENCES `departments` (`departmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (2,'FACULTY00022025','Professor',2,'2020-08-15','2025-11-25 10:47:45','Anil Kumar Sharma','Priya Devi','Government Employee',NULL,'1985-06-20','123, Sector 10, Noida - 201301'),(3,'FACULTY00032025','Assistant Professor',2,'2021-01-20','2025-11-25 10:48:38','Rajesh Singh','Suman Lata','Business Owner',NULL,'1990-03-12','Flat 45, Green Apartments, Pune - 411001'),(5,'FACULTY00052025','Lecturer',2,'2022-05-10','2025-11-25 10:49:07','Gopal Varma','Lalita Devi','Farmer',NULL,'1992-11-01','Village & Post: Khera, Dist: Jaipur - 302001'),(7,'FACULTY00072025','Assistant Professor',2,'2025-11-27','2025-11-27 18:15:35','Mr. Wason','Mrs. Wason','Business','Business','1980-10-21','New Delhi'),(8,'FACULTY00082025','Senior Professor',2,'2019-03-25','2025-11-25 10:49:20','Sanjay Patel','Meena Ben','Retired Teacher',NULL,'1975-09-15','B-10, Sunrise Complex, Ahmedabad - 380006'),(9,'FACULTY00092025','Associate Professor',2,'2023-08-01','2025-11-25 10:49:45','Vikas Choudhary','Reena Singh','Doctor',NULL,'1988-04-28','House No. 56, Civil Lines, Lucknow - 226001'),(10,'FACULTY00102025','Trainee',2,'2024-01-15','2025-11-25 10:50:05','Deepak Kumar','Sita Ram','Software Engineer',NULL,'1995-12-05','4th Floor, Tech Tower, Bangalore - 560001'),(12,'FACULTY00122025','Assistant Professor',1,'2025-11-25','2025-11-25 06:59:19','Joshi2','Joshi2','JOB2','House Wife','2003-12-28','Delhi, New Delhi - 110023');
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userId` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` enum('Student','Faculty','Admin') DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `contact` bigint DEFAULT NULL,
  `status` enum('complete','default') DEFAULT 'default',
  PRIMARY KEY (`userId`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Sayyam singhal','sayyam@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Student','2025-11-24 14:27:52',9876543210,'default'),(2,'Parul Arora','parul@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Faculty','2025-11-24 14:27:52',9123456780,'default'),(3,'Sunil Pratap Singh','sunil@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Faculty','2025-11-24 14:27:52',9988776655,'default'),(4,'Shubham Joshi','shubham@123','$2a$12$bYKkn3PG3wDnDp2dFPnBV.0tME1GdercT2KNvZTy1BPfct.KY0WMC','Student','2025-11-24 14:27:52',9090909090,'complete'),(5,'Rakhee Sharma','rakhee@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Faculty','2025-11-24 14:27:52',9797979797,'default'),(6,'Harshit Gupta','harshit@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Student','2025-11-24 14:27:52',9665544332,'default'),(7,'Ritika Wason','ritika@gmail.com','$2a$12$oGJHRtAjK4a0qBGXsVStPeRtafKAWAMhoR/uvw8W6VINH2bCrWKOG','Faculty','2025-11-24 14:27:52',9001122334,'complete'),(8,'Arpita Nagpal','arpita@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Faculty','2025-11-24 14:27:52',8776655443,'default'),(9,'Archit Tanwar','archit@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Faculty','2025-11-24 14:27:52',9443322110,'default'),(10,'Bhuvan Jain','bhuvan@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Faculty','2025-11-24 14:27:52',9556677889,'default'),(11,'admin','admin@gmail.com','$2a$12$N/kOlMKAn2srryKo0/BLq.46vV682useh5VhyZ9wyKOcQWNCVXbYS','Admin','2025-11-24 14:27:52',9898989898,'complete'),(12,'Shubham Johsi','shubhamjoshi45@gmail.com','$2a$12$vV9IeQaRqgz34P3k0WiOcOLOOUg7uovCeiw4CN9E5stmlmRw2FLg.','Faculty','2025-11-25 05:26:32',9891971080,'complete');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-28 11:40:56
