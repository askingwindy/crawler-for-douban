-- MySQL dump 10.13  Distrib 5.6.17, for osx10.7 (x86_64)
--
-- Host: localhost    Database: tongji
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `listening_music`
--

DROP TABLE IF EXISTS `listening_music`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `listening_music` (
  `listening_music` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `music_name` varchar(100) NOT NULL,
  PRIMARY KEY (`listening_music`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listening_music`
--

LOCK TABLES `listening_music` WRITE;
/*!40000 ALTER TABLE `listening_music` DISABLE KEYS */;
/*!40000 ALTER TABLE `listening_music` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `often_group`
--

DROP TABLE IF EXISTS `often_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `often_group` (
  `often_group_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `group_name` varchar(100) NOT NULL,
  PRIMARY KEY (`often_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `often_group`
--

LOCK TABLES `often_group` WRITE;
/*!40000 ALTER TABLE `often_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `often_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reading_book`
--

DROP TABLE IF EXISTS `reading_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reading_book` (
  `reading_book_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  PRIMARY KEY (`reading_book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reading_book`
--

LOCK TABLES `reading_book` WRITE;
/*!40000 ALTER TABLE `reading_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `reading_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `user_home_page_url` varchar(255) NOT NULL,
  `user_sex` varchar(10) DEFAULT NULL,
  `user_age` int(11) DEFAULT NULL,
  `user_join_date` datetime DEFAULT NULL,
  `fellow_people_num` int(11) DEFAULT NULL,
  `fellowed_people_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `want_book`
--

DROP TABLE IF EXISTS `want_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `want_book` (
  `want_book_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  PRIMARY KEY (`want_book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `want_book`
--

LOCK TABLES `want_book` WRITE;
/*!40000 ALTER TABLE `want_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `want_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `want_movie`
--

DROP TABLE IF EXISTS `want_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `want_movie` (
  `want_movie_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `movie_name` varchar(100) NOT NULL,
  PRIMARY KEY (`want_movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `want_movie`
--

LOCK TABLES `want_movie` WRITE;
/*!40000 ALTER TABLE `want_movie` DISABLE KEYS */;
/*!40000 ALTER TABLE `want_movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `want_music`
--

DROP TABLE IF EXISTS `want_music`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `want_music` (
  `want_music` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `music_name` varchar(100) NOT NULL,
  PRIMARY KEY (`want_music`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `want_music`
--

LOCK TABLES `want_music` WRITE;
/*!40000 ALTER TABLE `want_music` DISABLE KEYS */;
/*!40000 ALTER TABLE `want_music` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `watched_movie`
--

DROP TABLE IF EXISTS `watched_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `watched_movie` (
  `watchid_movie_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `movie_name` varchar(100) NOT NULL,
  PRIMARY KEY (`watchid_movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `watched_movie`
--

LOCK TABLES `watched_movie` WRITE;
/*!40000 ALTER TABLE `watched_movie` DISABLE KEYS */;
/*!40000 ALTER TABLE `watched_movie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-24 17:43:42
