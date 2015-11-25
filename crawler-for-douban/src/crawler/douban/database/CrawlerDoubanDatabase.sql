-- MySQL dump 10.13  Distrib 5.6.17, for osx10.7 (x86_64)
--
-- Host: localhost    Database: tongji
-- ------------------------------------------------------
-- Server version 5.6.17

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
-- Table structure for table `crawler_log`
--

DROP TABLE IF EXISTS `crawler_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crawler_log` (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `log_content` varchar(255) NOT NULL,
  `log_date` datetime NOT NULL,
  `log_level` int(11) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=219 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crawler_log`
--

LOCK TABLES `crawler_log` WRITE;
/*!40000 ALTER TABLE `crawler_log` DISABLE KEYS */;
INSERT INTO `crawler_log` VALUES (2,'http://www.douban.com/people/b -- not exist!','2015-11-04 23:16:48',1),(3,'empty person information','2015-11-04 23:16:48',1),(4,'empty reading book','2015-11-04 23:17:24',1),(5,'empty want book','2015-11-04 23:17:24',1),(6,'empty want movie','2015-11-04 23:17:24',1),(7,'empty watched movie','2015-11-04 23:17:24',1),(8,'empty listening music','2015-11-04 23:17:24',1),(9,'empty want music','2015-11-04 23:17:24',1),(10,'connect mysql success!','2015-11-04 23:17:24',1),(11,'User:b: empty reading book','2015-11-04 23:25:12',1),(12,'User:b: empty want book','2015-11-04 23:25:12',1),(13,'User:b: empty want movie','2015-11-04 23:25:12',1),(14,'User:b: empty watched movie','2015-11-04 23:25:12',1),(15,'User:b: empty listening music','2015-11-04 23:25:12',1),(16,'User:b: empty want music','2015-11-04 23:25:12',1),(17,'connect mysql success!','2015-11-04 23:25:12',1),(18,'insert User Error!','2015-11-04 23:25:12',3),(19,'insert user Error!','2015-11-04 23:25:12',3),(20,'User:b: empty reading book','2015-11-04 23:25:29',1),(21,'User:b: empty want book','2015-11-04 23:25:29',1),(22,'User:b: empty want movie','2015-11-04 23:25:29',1),(23,'User:b: empty watched movie','2015-11-04 23:25:29',1),(24,'User:b: empty listening music','2015-11-04 23:25:29',1),(25,'User:b: empty want music','2015-11-04 23:25:29',1),(26,'connect mysql success!','2015-11-04 23:25:29',1),(27,'insert User Error!','2015-11-04 23:25:29',3),(28,'insert user Error!','2015-11-04 23:25:29',3),(29,'User:b: empty reading book','2015-11-04 23:26:19',1),(30,'User:b: empty want book','2015-11-04 23:26:19',1),(31,'User:b: empty want movie','2015-11-04 23:26:19',1),(32,'User:b: empty watched movie','2015-11-04 23:26:19',1),(33,'User:b: empty listening music','2015-11-04 23:26:19',1),(34,'User:b: empty want music','2015-11-04 23:26:19',1),(35,'connect mysql success!','2015-11-04 23:26:19',1),(36,'connect mysql success!','2015-11-04 23:26:23',1),(37,'insert want music Error!','2015-11-04 23:26:23',3),(38,'connect mysql success!','2015-11-04 23:26:28',1),(39,'insert listening music Error!','2015-11-04 23:26:28',3),(40,'http://www.douban.com/people/e -- not exist!','2015-11-04 23:26:34',1),(41,'User:e: empty person information','2015-11-04 23:26:34',1),(42,'User:f: empty reading book','2015-11-04 23:26:35',1),(43,'User:f: empty want book','2015-11-04 23:26:35',1),(44,'User:f: empty want movie','2015-11-04 23:26:35',1),(45,'User:f: empty listening music','2015-11-04 23:26:35',1),(46,'User:f: empty want music','2015-11-04 23:26:35',1),(47,'connect mysql success!','2015-11-04 23:26:35',1),(48,'http://www.douban.com/people/tina -- not exist!','2015-11-06 18:52:56',1),(49,'User:tina: empty person information','2015-11-06 18:52:56',1),(50,'connect mysql success!','2015-11-14 21:28:52',1),(51,'connect mysql success!','2015-11-14 21:29:13',1),(52,'User:f: empty reading book','2015-11-14 21:29:56',1),(53,'User:f: empty want book','2015-11-14 21:29:56',1),(54,'User:f: empty want movie','2015-11-14 21:29:56',1),(55,'User:f: empty listening music','2015-11-14 21:29:56',1),(56,'User:f: empty want music','2015-11-14 21:29:56',1),(57,'connect mysql success!','2015-11-14 21:29:56',1),(58,'User:f: empty reading book','2015-11-14 21:30:14',1),(59,'User:f: empty want book','2015-11-14 21:30:14',1),(60,'User:f: empty want movie','2015-11-14 21:30:14',1),(61,'User:f: empty listening music','2015-11-14 21:30:14',1),(62,'User:f: empty want music','2015-11-14 21:30:14',1),(63,'connect mysql success!','2015-11-14 21:32:39',1),(64,'http://www.douban.com/people/b -- not exist!','2015-11-14 21:42:10',1),(65,'User:b: empty person information','2015-11-14 21:42:10',1),(66,'http://www.douban.com/people/c -- not exist!','2015-11-14 21:42:16',1),(67,'User:c: empty person information','2015-11-14 21:42:16',1),(68,'http://www.douban.com/people/d -- not exist!','2015-11-14 21:42:24',1),(69,'User:d: empty person information','2015-11-14 21:42:24',1),(70,'http://www.douban.com/people/e -- not exist!','2015-11-14 21:42:31',1),(71,'User:e: empty person information','2015-11-14 21:42:31',1),(72,'http://www.douban.com/people/f -- not exist!','2015-11-14 21:42:37',1),(73,'User:f: empty person information','2015-11-14 21:42:37',1),(74,'http://www.douban.com/people/g -- not exist!','2015-11-14 21:42:49',1),(75,'User:g: empty person information','2015-11-14 21:42:49',1),(76,'http://www.douban.com/people/h -- not exist!','2015-11-14 21:42:53',1),(77,'User:h: empty person information','2015-11-14 21:42:53',1),(78,'http://www.douban.com/people/i -- not exist!','2015-11-14 21:43:01',1),(79,'User:i: empty person information','2015-11-14 21:43:01',1),(80,'http://www.douban.com/people/j -- not exist!','2015-11-14 21:43:14',1),(81,'User:j: empty person information','2015-11-14 21:43:14',1),(82,'User:k: empty reading book','2015-11-14 21:43:19',1),(83,'connect mysql success!','2015-11-14 21:43:19',1),(84,'insert want book Error!','2015-11-14 21:43:19',3),(85,'User:l: empty reading book','2015-11-14 21:43:21',1),(86,'User:l: empty want book','2015-11-14 21:43:21',1),(87,'User:l: empty listening music','2015-11-14 21:43:21',1),(88,'User:l: empty want music','2015-11-14 21:43:21',1),(89,'connect mysql success!','2015-11-14 21:43:21',1),(90,'User:m: empty listening music','2015-11-14 21:43:24',1),(91,'User:m: empty want music','2015-11-14 21:43:24',1),(92,'connect mysql success!','2015-11-14 21:43:24',1),(93,'connect mysql success!','2015-11-14 21:43:27',1),(94,'insert want book Error!','2015-11-14 21:43:27',3),(95,'User:o: empty want music','2015-11-14 21:43:27',1),(96,'connect mysql success!','2015-11-14 21:43:27',1),(97,'User:p: empty reading book','2015-11-14 21:43:29',1),(98,'User:p: empty want book','2015-11-14 21:43:29',1),(99,'User:p: empty want movie','2015-11-14 21:43:29',1),(100,'User:p: empty watched movie','2015-11-14 21:43:29',1),(101,'User:p: empty listening music','2015-11-14 21:43:29',1),(102,'User:p: empty want music','2015-11-14 21:43:29',1),(103,'connect mysql success!','2015-11-14 21:43:29',1),(104,'http://www.douban.com/people/q -- not exist!','2015-11-14 21:43:32',1),(105,'User:q: empty person information','2015-11-14 21:43:32',1),(106,'User:r: empty listening music','2015-11-14 21:43:37',1),(107,'connect mysql success!','2015-11-14 21:43:37',1),(108,'User:s: empty want book','2015-11-14 21:43:38',1),(109,'User:s: empty want movie','2015-11-14 21:43:38',1),(110,'User:s: empty watched movie','2015-11-14 21:43:38',1),(111,'User:s: empty listening music','2015-11-14 21:43:38',1),(112,'User:s: empty want music','2015-11-14 21:43:38',1),(113,'connect mysql success!','2015-11-14 21:43:38',1),(114,'connect mysql success!','2015-11-14 21:43:41',1),(115,'insert want music Error!','2015-11-14 21:43:41',3),(116,'insert want music Error!','2015-11-14 21:43:41',3),(117,'insert want book Error!','2015-11-14 21:43:41',3),(118,'User:u: empty listening music','2015-11-14 21:43:41',1),(119,'User:u: empty want music','2015-11-14 21:43:41',1),(120,'connect mysql success!','2015-11-14 21:43:41',1),(121,'User:v: empty reading book','2015-11-14 21:43:42',1),(122,'User:v: empty want book','2015-11-14 21:43:42',1),(123,'User:v: empty watched movie','2015-11-14 21:43:42',1),(124,'User:v: empty listening music','2015-11-14 21:43:42',1),(125,'User:v: empty want music','2015-11-14 21:43:42',1),(126,'connect mysql success!','2015-11-14 21:43:42',1),(127,'http://www.douban.com/people/w -- not exist!','2015-11-14 21:43:46',1),(128,'User:w: empty person information','2015-11-14 21:43:46',1),(129,'User:x: empty listening music','2015-11-14 21:43:47',1),(130,'connect mysql success!','2015-11-14 21:43:47',1),(131,'User:y: empty want music','2015-11-14 21:43:48',1),(132,'connect mysql success!','2015-11-14 21:43:48',1),(133,'User:z: empty listening music','2015-11-14 21:43:49',1),(134,'User:z: empty want music','2015-11-14 21:43:49',1),(135,'connect mysql success!','2015-11-14 21:43:49',1),(136,'User:aa: empty reading book','2015-11-14 21:43:50',1),(137,'User:aa: empty want book','2015-11-14 21:43:50',1),(138,'User:aa: empty watched movie','2015-11-14 21:43:50',1),(139,'User:aa: empty listening music','2015-11-14 21:43:50',1),(140,'connect mysql success!','2015-11-14 21:43:50',1),(141,'insert want music Error!','2015-11-14 21:43:50',3),(142,'http://www.douban.com/people/ab -- not exist!','2015-11-14 21:43:51',1),(143,'User:ab: empty person information','2015-11-14 21:43:51',1),(144,'User:ac: empty reading book','2015-11-14 21:43:52',1),(145,'User:ac: empty want book','2015-11-14 21:43:52',1),(146,'User:ac: empty want movie','2015-11-14 21:43:52',1),(147,'User:ac: empty watched movie','2015-11-14 21:43:52',1),(148,'User:ac: empty listening music','2015-11-14 21:43:52',1),(149,'User:ac: empty want music','2015-11-14 21:43:52',1),(150,'connect mysql success!','2015-11-14 21:43:52',1),(151,'http://www.douban.com/people/ad -- not exist!','2015-11-14 21:43:53',1),(152,'User:ad: empty person information','2015-11-14 21:43:53',1),(153,'User:ae: empty reading book','2015-11-14 21:43:53',1),(154,'User:ae: empty want book','2015-11-14 21:43:53',1),(155,'User:ae: empty want movie','2015-11-14 21:43:53',1),(156,'User:ae: empty watched movie','2015-11-14 21:43:53',1),(157,'User:ae: empty listening music','2015-11-14 21:43:53',1),(158,'User:ae: empty want music','2015-11-14 21:43:53',1),(159,'connect mysql success!','2015-11-14 21:43:53',1),(160,'connect mysql success!','2015-11-14 21:43:55',1),(161,'http://www.douban.com/people/ag -- not exist!','2015-11-14 21:43:58',1),(162,'User:ag: empty person information','2015-11-14 21:43:58',1),(163,'User:ah: empty reading book','2015-11-14 21:44:01',1),(164,'User:ah: empty want music','2015-11-14 21:44:01',1),(165,'connect mysql success!','2015-11-14 21:44:01',1),(166,'User:ai: empty reading book','2015-11-14 21:44:02',1),(167,'User:ai: empty want book','2015-11-14 21:44:02',1),(168,'User:ai: empty want movie','2015-11-14 21:44:02',1),(169,'User:ai: empty watched movie','2015-11-14 21:44:02',1),(170,'User:ai: empty listening music','2015-11-14 21:44:02',1),(171,'User:ai: empty want music','2015-11-14 21:44:02',1),(172,'connect mysql success!','2015-11-14 21:44:02',1),(173,'User:aj: empty reading book','2015-11-14 21:44:02',1),(174,'User:aj: empty want book','2015-11-14 21:44:02',1),(175,'User:aj: empty want movie','2015-11-14 21:44:02',1),(176,'User:aj: empty want music','2015-11-14 21:44:02',1),(177,'connect mysql success!','2015-11-14 21:44:03',1),(178,'http://www.douban.com/people/ak -- not exist!','2015-11-14 21:44:03',1),(179,'User:ak: empty person information','2015-11-14 21:44:03',1),(180,'http://www.douban.com/people/al -- not exist!','2015-11-14 21:44:03',1),(181,'User:al: empty person information','2015-11-14 21:44:03',1),(182,'User:am: empty reading book','2015-11-14 21:44:04',1),(183,'User:am: empty want book','2015-11-14 21:44:04',1),(184,'User:am: empty want movie','2015-11-14 21:44:04',1),(185,'User:am: empty watched movie','2015-11-14 21:44:04',1),(186,'User:am: empty listening music','2015-11-14 21:44:04',1),(187,'User:am: empty want music','2015-11-14 21:44:04',1),(188,'connect mysql success!','2015-11-14 21:44:04',1),(189,'http://www.douban.com/people/an -- not exist!','2015-11-14 21:44:05',1),(190,'User:an: empty person information','2015-11-14 21:44:05',1),(191,'User:ao: empty reading book','2015-11-14 21:44:06',1),(192,'User:ao: empty want book','2015-11-14 21:44:06',1),(193,'User:ao: empty want movie','2015-11-14 21:44:06',1),(194,'User:ao: empty listening music','2015-11-14 21:44:06',1),(195,'User:ao: empty want music','2015-11-14 21:44:06',1),(196,'connect mysql success!','2015-11-14 21:44:06',1),(197,'User:ap: empty reading book','2015-11-14 21:44:07',1),(198,'User:ap: empty listening music','2015-11-14 21:44:07',1),(199,'User:ap: empty want music','2015-11-14 21:44:07',1),(200,'connect mysql success!','2015-11-14 21:44:07',1),(201,'User:aq: empty reading book','2015-11-14 21:44:09',1),(202,'User:aq: empty want book','2015-11-14 21:44:09',1),(203,'User:aq: empty want movie','2015-11-14 21:44:09',1),(204,'User:aq: empty listening music','2015-11-14 21:44:09',1),(205,'User:aq: empty want music','2015-11-14 21:44:09',1),(206,'connect mysql success!','2015-11-14 21:44:09',1),(207,'User:ar: empty fellow people','2015-11-14 21:44:09',1),(208,'User:ar: empty fellowed people','2015-11-14 21:44:09',1),(209,'User:ar: empty reading book','2015-11-14 21:44:09',1),(210,'User:ar: empty want book','2015-11-14 21:44:09',1),(211,'User:ar: empty want movie','2015-11-14 21:44:09',1),(212,'User:ar: empty watched movie','2015-11-14 21:44:09',1),(213,'User:ar: empty listening music','2015-11-14 21:44:09',1),(214,'User:ar: empty want music','2015-11-14 21:44:09',1),(215,'User:ar: empty join date','2015-11-14 21:44:09',1),(216,'connect mysql success!','2015-11-14 21:44:09',1),(217,'insert User Error!','2015-11-14 21:44:09',3),(218,'insert user Error!','2015-11-14 21:44:09',3);
/*!40000 ALTER TABLE `crawler_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listening_music`
--

DROP TABLE IF EXISTS `listening_music`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `listening_music` (
  `listening_music` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `music_name` varchar(100) NOT NULL,
  PRIMARY KEY (`listening_music`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listening_music`
--

LOCK TABLES `listening_music` WRITE;
/*!40000 ALTER TABLE `listening_music` DISABLE KEYS */;
INSERT INTO `listening_music` VALUES (6,'Tina','许巍 - 爱如少年'),(7,'Tina','李志 - 被禁忌的游戏'),(8,'Tina','图腾 - 我在那邊唱'),(9,'Tina','Ko Otani (composer) - Haibane-Renmei Soundtrack Hanenone'),(10,'Tina','林一峰 - 你今日拯救咗地球未呀'),(11,'alps','Eric Benet - A Day in the Life'),(12,'alps','Ray Charles - Ray Charles: Ultimate Hits Collection'),(13,'alps','James Blunt - Back To Bedlam'),(14,'alps','U2 - October'),(27,'k','DJ OKAWARI - DIORAMA'),(28,'k','Various Artists - 独立女皇'),(29,'k','Sheryl Crow - Wildflower'),(30,'k','张震岳 - OK'),(31,'k','彭靖惠 - 浪费时间是快乐的'),(32,'n','蔡健雅 - 失语者'),(33,'n','Black Knights - Almighty'),(34,'n','Damien Rice - My Favourite Faded Fantasy'),(35,'n','Various Artists - Begin Again: Music From & Inspired By The Original Motion Picture'),(36,'n','Lana Del Rey - Ultraviolence (Deluxe Edition)'),(37,'o','Original Soundtrack - Juno'),(38,'o','蔡淳佳 - 庆幸拥有蔡淳佳'),(39,'o','Avril Lavigne - Let Go'),(40,'o','S.H.E - PLAY'),(41,'o','陶喆 - 樂之路'),(42,'t','Crystal Castles - Crystal Castles (II)'),(43,'t','Einstürzende Neubauten - Ende Neu'),(44,'t','Roger Waters - Amused to Death'),(45,'t','The Jesus and Mary Chain - The Sound of Speed'),(46,'t','Siouxsie and the Banshees - Juju'),(47,'y','王若琳 - The Things We Do For Love'),(48,'y','旅行団 - Wonderful Day'),(49,'y','陈奕迅 - Stranger Under My Skin'),(50,'y','萬芳 - 我們不要傷心了'),(51,'af','堯十三 - 飛船,宇航員'),(52,'af','许巍 - 此时此刻演唱会LIVE纪录辑'),(53,'af','许巍 - 许巍此时此刻巡回演唱会'),(54,'af','Hans Zimmer - Interstellar: Original Motion Picture Soundtrack'),(55,'af','汪峰 - 信仰在空中飘扬'),(56,'ah','Keren Ann - La Disparition'),(57,'ah','Rosie Thomas - When We Were Small'),(58,'aj','蔡健雅 - Close To 蔡健雅 Original x Tanya');
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
  `user_id` varchar(20) NOT NULL,
  `group_name` varchar(100) NOT NULL,
  PRIMARY KEY (`often_group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=223 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `often_group`
--

LOCK TABLES `often_group` WRITE;
/*!40000 ALTER TABLE `often_group` DISABLE KEYS */;
INSERT INTO `often_group` VALUES (1,'Tina','砳砳！海宝！大作战！'),(2,'Tina','武侠世界'),(3,'Tina','我们骑车去西藏'),(4,'Tina','减肥餐设计与健身|公众...'),(5,'Tina','冰与火之歌'),(6,'Tina','HBO剧集 冰与火之歌 －...'),(7,'Tina','绿剧人'),(8,'Tina','唐家屯大集合 Downton ...'),(9,'alps','京瓣儿'),(10,'alps','blogger'),(11,'alps','Google'),(12,'alps','维基百科 Wikipedia'),(13,'alps','Lonely Planet'),(14,'alps','古典音乐'),(15,'alps','吃喝玩乐在北京'),(16,'alps','电影大师之研究'),(19,'CHEO','重庆最靠谱的谈恋爱小组'),(20,'CHEO','重庆豆瓣'),(21,'CHEO','成都豆瓣'),(22,'CHEO','从没谈过恋爱的人'),(23,'CHEO','♫ ♬和五月天混在...'),(24,'CHEO','豆瓣互助旅行'),(25,'CHEO','西藏攻略'),(26,'CHEO','一起去旅行'),(64,'k','低血糖'),(65,'k','深圳豆瓣'),(66,'k','70年代末80年代初生人'),(67,'k','爱看电影'),(68,'k','我们爱讲冷笑话'),(69,'k','想不想很多人帮你！'),(70,'k','南昌豆瓣'),(71,'k','闪吧俱乐部'),(72,'l','摄影'),(73,'l','日本料理学堂【禁广告】'),(74,'l','使用钢笔联盟'),(75,'l','手帳'),(76,'m','NBA'),(77,'m','test..orz'),(78,'m','个性化推荐'),(79,'m','豆瓣fans'),(80,'m','小组目前没有主题讨论'),(81,'m','spurs'),(82,'m','HoopChina'),(83,'m','Greasemonkey'),(84,'n','John Frusciante'),(85,'n','Tom Hiddleston'),(86,'n','神探夏洛克 （Sherlock）'),(87,'n','Blur'),(88,'n','格拉汉'),(89,'n','巴塞罗那 FC Barcelona'),(90,'n','Jason Mraz'),(91,'n','我爱亦舒'),(92,'n','flickr'),(93,'n','黄子华'),(94,'n','Britpop'),(95,'n','Robert Downey Jr. 小...'),(96,'n','Kula Shaker'),(97,'n','Sean Lennon'),(98,'o','代购之家&海淘'),(99,'o','英文翻译 Workshop™'),(100,'o','我们爱讲冷笑话'),(101,'o','爱看电影'),(102,'o','心理学交流'),(103,'o','合肥豆瓣'),(104,'o','生活小常识¤'),(105,'o','想不想很多人帮你！'),(106,'r','兰州大学'),(107,'r','EAT in LanZhou'),(108,'r','生活·读书·新知'),(109,'r','学院派扯淡爱好者'),(110,'r','北望经济学园'),(111,'r','Financial Engineering'),(112,'r','科幻世界'),(113,'r','疯人院'),(114,'r','巴丹吉林'),(115,'r','留有余地'),(116,'r','海市'),(117,'r','物理经济学'),(118,'r','四川大学'),(119,'r','常识 常識 Common Sense'),(120,'s','手工DIY教程（微信号：...'),(121,'s','自己动手做布袋'),(122,'s','网店推荐·淘宝'),(123,'s','驴友俱乐部'),(124,'s','我要去香港'),(125,'s','南京豆瓣'),(126,'s','电影感摄影图片展'),(127,'s','香港周末自由行 〉山'),(128,'t','摄影人'),(129,'t','怪力/GuaiLi'),(130,'t','越南旅游'),(131,'t','出国自助游教室(微信：...'),(132,'t','S.T.D.'),(133,'t','武汉豆瓣'),(134,'t','文隽'),(135,'t','AV大久保'),(136,'t','我们养猫，可能是gay，...'),(137,'t','收债'),(138,'t','CARSICK CARS'),(139,'t','URBAN Media'),(140,'t','Nikon F3'),(141,'t','Hellen van Meene'),(142,'u','1983'),(143,'u','厦门旅游攻略'),(144,'u','厦门豆瓣'),(145,'u','ゆずの芽'),(146,'u','深圳老干中心'),(147,'u','深圳K歌团'),(148,'u','黄子华'),(149,'u','处女座流淌AB型血'),(150,'u','我们统称为柚某人'),(151,'u','好玩的老头——黄永玉'),(152,'u','妹尾河童的书'),(153,'u','梦'),(154,'u','All About Romance'),(155,'u','刘慈欣'),(156,'v','假裝'),(157,'v','随笔'),(158,'x','深圳80后'),(159,'x','苹果产品二手买卖'),(160,'x','香港豆瓣'),(161,'x','ALL about HK'),(162,'x','林宥嘉'),(163,'x','我要去香港'),(164,'x','深圳豆瓣'),(165,'x','泰国'),(166,'x','出国自助游教室(微信：...'),(167,'x','一起去旅行'),(168,'x','一个人旅行'),(169,'x','奕身迅情 | 陈奕迅准备中'),(170,'x','跳 蚤 市 场 Flea Market'),(171,'x','台灣豆瓣'),(172,'y','天蝎座'),(173,'y','be lovely be TOUS'),(174,'y','必得书店(必得书店粉丝...'),(175,'y','Dream of Cello'),(176,'y','科学松鼠会读者花园'),(177,'y','爱BV'),(178,'y','agnès b.'),(179,'y','旅行团乐队'),(180,'z','驴友俱乐部'),(181,'z','我们都是拖延症'),(182,'z','【戒你们所】小飞&喻舟...'),(183,'z','我是测试狂'),(184,'z','征友相亲'),(185,'z','童话'),(186,'z','京瓣儿?Appstore搜 篝火'),(187,'z','动画'),(188,'aa','爱看电影'),(189,'aa','豆瓣生日汇：生活因逗...'),(190,'aa','玩物启志-大连店(创意...'),(191,'af','上海豆瓣'),(192,'af','长沙豆瓣'),(193,'af','长沙二手'),(194,'af','摄影人'),(195,'af','我自己练吉他'),(196,'af','吉他+女'),(197,'af','凤凰'),(198,'af','二手音乐设备'),(199,'ah','【天秤座】'),(200,'ah','【恶魔商店】'),(201,'ah','Lie To Me*别对我说谎'),(202,'ah','线鸡文化及其传承者研究'),(203,'ah','蛱蝶哈拉子'),(204,'ah','每天一首诗'),(205,'ah','dHb 大三'),(206,'ah','大嘴吃昆明'),(207,'aj','华中师范大学第一附属中学'),(208,'aj','豆瓣足球协会'),(209,'aj','音乐剧FANS'),(210,'aj','爱看电影'),(211,'aj','科幻世界'),(212,'aj','买书如山倒 读书如抽丝'),(213,'aj','武汉豆瓣'),(214,'aj','姿迷天下'),(215,'ap','《九州幻想》杂志小组&...'),(216,'ap','自制力差'),(217,'ap','爱看电影'),(218,'ap','上班这件事'),(219,'ap','佳片推荐 （只迷电影不...'),(220,'ap','冷门佳片推荐 （只迷电...'),(221,'ap','门外汉舒国治'),(222,'ap','土豆哪里去挖·2011你好');
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
  `user_id` varchar(20) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  PRIMARY KEY (`reading_book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reading_book`
--

LOCK TABLES `reading_book` WRITE;
/*!40000 ALTER TABLE `reading_book` DISABLE KEYS */;
INSERT INTO `reading_book` VALUES (1,'Tina','Lonsome Dove 孤独鸽'),(2,'Tina','巨流河'),(3,'Tina','我心所属'),(4,'Tina','古今食事'),(5,'Tina','海边的卡夫卡'),(6,'alps','光荣与梦想'),(7,'CHEO','1Q84 BOOK 1'),(25,'m','锦绣蓝图'),(26,'m','精通Web Analytics'),(27,'m','Programming Collective Intelligence'),(28,'m','The Jordan Rules'),(29,'n','微塵眾：紅樓夢小人物3'),(30,'n','藍色黐膠花'),(31,'n','微喜重行'),(32,'n','標童話集 6'),(33,'n','真正的家'),(34,'o','深入理解计算机系统（原书第2版）'),(35,'o','Enterprise JavaBeans 3.0中文版'),(36,'o','卓有成效的程序员'),(37,'o','常识'),(38,'o','Head First Servlets & JSP（中文版）'),(39,'r','新約'),(40,'r','金融中的统计方法'),(41,'r','随机金融基础'),(42,'r','Atom and Archetype'),(43,'r','Snow Crash.'),(44,'s','建筑细部集成  4册'),(45,'t','人的性世界'),(46,'t','卡桑德拉的炼狱'),(47,'t','达摩流浪者'),(48,'t','悖论简史'),(49,'t','脏话文化史'),(50,'u','魔法活船1·魔法之船（上下）'),(51,'u','吕著三国史话'),(52,'u','历代蒙求·史鉴节要便读'),(53,'u','金泥玉屑丛考'),(54,'u','津津有味谭'),(55,'x','让心自由'),(56,'y','天空之鏡'),(57,'y','娱乐至死 童年的消逝'),(58,'y','目送'),(59,'z','战略管理'),(60,'z','可爱的洪水猛兽'),(61,'z','王小波经典作品'),(62,'af','“太空漫游”四部曲'),(63,'af','暗时间'),(64,'af','直面内心的恐惧'),(65,'af','人类行为的经济分析'),(66,'af','模拟集成电路设计精粹');
/*!40000 ALTER TABLE `reading_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` varchar(20) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_home_page_url` varchar(255) NOT NULL,
  `user_sex` varchar(10) DEFAULT NULL,
  `user_age` int(11) DEFAULT NULL,
  `user_join_date` datetime DEFAULT NULL,
  `fellow_people_num` int(11) DEFAULT NULL,
  `fellowed_people_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('aa','AA','http://www.douban.com/people/aa','n',0,'2005-10-21 00:00:00',2,11),('ac','AC MILAN','http://www.douban.com/people/ac','n',0,'2006-02-06 00:00:00',0,5),('ae','A&E','http://www.douban.com/people/ae','n',0,'2006-03-11 00:00:00',0,7),('af','A5hine','http://www.douban.com/people/af','n',0,'2006-07-07 00:00:00',14,60),('ah','拉','http://www.douban.com/people/ah','n',0,'2007-06-09 00:00:00',44,66),('ai','花心不死','http://www.douban.com/people/ai','n',0,'2005-11-10 00:00:00',0,3),('aj','Aj','http://www.douban.com/people/aj','n',0,'2005-12-02 00:00:00',21,27),('alps','alps','http://www.douban.com/people/alps','n',0,'2005-11-12 00:00:00',1,14),('am','am','http://www.douban.com/people/am','n',0,'2005-08-22 00:00:00',0,7),('ao','Aiyo','http://www.douban.com/people/ao','n',0,'2006-07-21 00:00:00',0,1),('ap','大脸师太','http://www.douban.com/people/ap','n',0,'2007-08-24 00:00:00',10,15),('aq','GIZAX','http://www.douban.com/people/aq','n',0,'2006-04-24 00:00:00',0,2),('CHEO','陌路_','http://www.douban.com/people/CHEO','n',0,'2010-02-13 00:00:00',56,42),('k','k','http://www.douban.com/people/k','n',0,'2005-11-23 00:00:00',26,52),('l','l','http://www.douban.com/people/l','n',0,'2006-01-10 00:00:00',33,32),('m','@M的不要@我啊','http://www.douban.com/people/m','n',0,'2005-11-06 00:00:00',106,99),('n','n','http://www.douban.com/people/n','n',0,'2006-03-19 00:00:00',113,203),('o','bingo','http://www.douban.com/people/o','n',0,'2006-07-15 00:00:00',19,28),('p','lil pp','http://www.douban.com/people/p','n',0,'2006-04-22 00:00:00',0,11),('r','小川','http://www.douban.com/people/r','n',0,'2005-10-22 00:00:00',29,170),('s','s','http://www.douban.com/people/s','n',0,'2006-04-12 00:00:00',36,76),('t','t','http://www.douban.com/people/t','n',0,'2005-11-23 00:00:00',438,527),('Tina','痞子笛','http://www.douban.com/people/Tina','n',0,'2005-06-02 00:00:00',278,1183),('u','吃柚子的提泡','http://www.douban.com/people/u','n',0,'2006-11-14 00:00:00',19,17),('v','上帝之泪','http://www.douban.com/people/v','n',0,'2006-01-01 00:00:00',0,10),('x','侧头','http://www.douban.com/people/x','n',0,'2005-12-30 00:00:00',139,121),('y','yoyo','http://www.douban.com/people/y','n',0,'2006-01-09 00:00:00',7,31),('z','向着阳光走','http://www.douban.com/people/z','n',0,'2005-06-15 00:00:00',5,24);
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
  `user_id` varchar(20) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  PRIMARY KEY (`want_book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `want_book`
--

LOCK TABLES `want_book` WRITE;
/*!40000 ALTER TABLE `want_book` DISABLE KEYS */;
INSERT INTO `want_book` VALUES (1,'Tina','Word Power Made Easy'),(2,'Tina','Thinking, Fast and Slow'),(3,'Tina','无命运的人生'),(4,'Tina','地下'),(5,'Tina','约堡黄昏'),(27,'k','别跟我说你懂日本'),(28,'k','诺阿诺阿'),(29,'k','殺死99隻貓的少女'),(30,'m','增长黑客'),(31,'m','21世纪的隐形冠军'),(32,'m','资源革命：如何抓住一百年来最大的商机'),(33,'m','人类简史'),(34,'m','How Google Works'),(35,'n','Gone Girl'),(36,'n','夢紅樓'),(37,'n','肉身供養'),(38,'n','空白'),(39,'o','Expert One-on-One J2EE Development without EJB'),(40,'o','Expert One-on-One J2EE Design and Development'),(41,'o','Spring in Action'),(42,'r','释迦的本心'),(43,'r','侘寂天涯'),(44,'r','蜀山剑侠传'),(45,'r','丑的历史'),(46,'r','异教徒'),(47,'t','American Surfaces'),(48,'t','青春 - Madi Ju第一本自选摄影集'),(49,'t','少女椿'),(50,'t','日本緊縛写真史'),(51,'u','俗语佛源'),(52,'u','死生有命 富贵在天'),(53,'u','梦也何曾到谢桥'),(54,'u','中国古代文化常识'),(55,'u','唐代政治史述论稿'),(56,'x','一个女人的幸福时光'),(57,'x','味道台北'),(58,'x','台北爸爸，纽约妈妈'),(59,'x','單身'),(60,'x','因为痛，所以是爱情'),(61,'y','零ZEЯRO'),(62,'y','米沃什词典'),(63,'y','当彩色的声音尝起来是甜的'),(64,'y','卡尔维诺文集（第五卷）'),(65,'z','關於羅馬人的二十個問題'),(66,'z','Ideas in Reality'),(67,'z','飄移中國'),(68,'z','货币战争2:金权天下'),(69,'z','如何掌控自己的时间和生活'),(70,'af','把青春唱完1990-1999'),(71,'af','光明王'),(72,'af','银河系漫游指南'),(73,'af','你一生的故事'),(74,'af','未来的序曲'),(75,'ah','肠子'),(76,'ah','脏话文化史'),(77,'ah','打飞机英雄集'),(78,'ah','怎样鉴别黄色歌曲'),(79,'ap','流浪集'),(80,'ap','台北小吃札記');
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
  `user_id` varchar(20) NOT NULL,
  `movie_name` varchar(100) NOT NULL,
  PRIMARY KEY (`want_movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `want_movie`
--

LOCK TABLES `want_movie` WRITE;
/*!40000 ALTER TABLE `want_movie` DISABLE KEYS */;
INSERT INTO `want_movie` VALUES (1,'Tina','行尸走肉 第六季'),(2,'Tina','无耻之徒(美版) 第六季\n\n无耻之徒(美版) / 无耻家庭(美版) 第六季'),(3,'Tina','小镇疑云 第三季'),(4,'Tina','小森林 夏秋篇\n\n小森林 夏秋篇 / 小森食光/夏秋篇(台)'),(5,'Tina','迷失1971\n\n迷失1971 / 71暴乱夜(港/台)'),(6,'alps','女囚尼基塔\n\n女囚尼基塔 / 霹雳煞'),(7,'CHEO','看得见风景的房间\n\n看得见风景的房间 / 翡冷翠之恋'),(8,'CHEO','海上传奇\n\n上海传奇'),(29,'k','裂缝\n\n裂缝 / 迷恋对象'),(30,'k','月光诗篇\n\n月光诗篇 / 握住月光'),(31,'k','普罗旺斯的夏天\n\n普罗旺斯的夏天 / 米斯特拉尔说'),(32,'k','血钻\n\n血钻 / 血腥钻石'),(33,'k','伴我同行\n\n伴我同行 / 与我常在'),(34,'l','少年派的奇幻漂流\n\n少年派的奇幻漂流 / 少年Pi的奇幻漂流'),(35,'l','飞越疯人院\n\n飞越疯人院 / 飞越杜鹃窝'),(36,'l','当幸福来敲门\n\n当幸福来敲门 / 寻找快乐的故事(港)'),(37,'l','楚门的世界\n\n楚门的世界 / 真人Show(港)'),(38,'l','天堂电影院\n\n天堂电影院 / 星光伴我心(台)'),(39,'m','狼图腾\n\nLe Dernier Loup'),(40,'m','凤凰劫\n\n凤凰劫 / 荒漠十壮士'),(41,'m','蜂蜜与四叶草\n\n蜂蜜与四叶草 / 蜂蜜幸运草(台)'),(42,'m','真实罗曼史\n\n真实罗曼史 / 浪漫风暴'),(43,'m','南极大冒险\n\n南极大冒险 / 零下八度'),(44,'n','艾米\n\n艾米 / 艾米怀丝(台)'),(45,'n','爱与慈悲\n\n爱与慈悲 / 迷失巨声(港)'),(46,'n','麦克白'),(47,'n','Taboo'),(48,'n','至暴之年\n\n至暴之年 / 暴力年代(台)'),(49,'o','江湖告急\n\n江湖告急 / 舞尽人生'),(50,'o','大丈夫\n\n大丈夫之暗战男女'),(51,'o','公民凯恩\n\n公民凯恩 / 大国民(港/台)'),(52,'o','功夫熊猫之盖世五侠的秘密\n\n功夫熊猫之盖世五侠的秘密 / 功夫熊猫：盖世五侠的秘密'),(53,'o','荒野生存\n\n荒野生存 / 浪荡天涯(港)'),(54,'r','大西洋帝国 第一季\n\n大西洋帝国 / 海滨帝国 第一季'),(55,'r','火线 第一季\n\n火线 / 线人 第一季'),(56,'r','发展受阻 第一季\n\n发展受阻 / 发展受阻 第一季'),(57,'r','时间的风景\n\n时间的风景 / 令人震撼窒息的画面'),(58,'r','丁丁历险记\n\n丁丁历险记 / 丁丁历险记：独角兽号的秘密'),(59,'t','真实\n\n真实 / 不真实的荒谬(台)'),(60,'t','雪莉：现实的愿景\n\n雪莉：现实的愿景 / 十三个雪莉(港)'),(61,'t','蓝调传奇\n\n蓝调传奇 / 爵士传奇'),(62,'t','幻之光\n\n幻之光 / 特殊家庭'),(63,'t','机动战士高达0083 星尘的回忆\n\n机动战士高达0083 星尘的回忆 / 機動戰士Gundam0083：STARDUST MEMORY'),(64,'u','克兰弗德 第一季\n\n克兰弗德 / 克兰福德纪事 第一季'),(65,'u','第二春\n\n第二春 / 拜拜围裙'),(66,'u','本杰明·巴顿奇事\n\n本杰明·巴顿奇事 / 奇幻逆缘(港)'),(67,'u','20世纪少年：第二部 最后的希望\n\n20世纪少年：第二部 最后的希望 / 20世纪少年：最后的希望'),(68,'u','不可饶恕\n\n不可饶恕 / 豪情盖天'),(69,'v','玩命速递：重启之战\n\n玩命速递：重启之战 / 玩命快递：肆意横行(台)'),(70,'v','真相禁区\n\nInside or Outside'),(71,'v','不可思异\n\n非法操作'),(72,'x','东方快车谋杀案'),(73,'x','东方快车谋杀案\n\n东方快车谋杀案 / 大侦探波罗系列之东方快车谋杀案2010'),(74,'x','东方快车谋杀案\n\n东方快车谋杀案 / 东洋特快杀人事件'),(75,'x','十二怒汉\n\n十二怒汉 / 十二怒汉（电视原版）'),(76,'x','十二怒汉\n\n十二怒汉'),(77,'y','恋爱起义\n\n恋爱起义'),(78,'y','兵临城下\n\n兵临城下 / 决战中的较量'),(79,'y','时尚先锋香奈儿\n\n时尚先锋香奈儿 / 少女香奈儿'),(80,'z','战争之王\n\n战争之王 / 军火之王(台/港)'),(81,'aa','七夜\n\nSeven Nights'),(82,'aa','戏梦巴黎\n\n戏梦巴黎 / 梦想家'),(83,'af','大同\n\n中国市长'),(84,'af','再次出发之纽约遇见你\n\n再次出发之纽约遇见你 / 再次出发'),(85,'af','寻找小糖人\n\n寻找小糖人 / 寻找甜秘客(台)'),(86,'af','《星际穿越》中的科学\n\n《星际穿越》中的科学 / 探索频道：星际穿越的科学'),(87,'af','中国合伙人\n\n海阔天空(台)'),(88,'ah','无敌破坏王\n\n无敌破坏王 / 破坏王拉尔夫'),(89,'ah','纯真年代\n\n纯真年代 / 心外幽情(港)'),(90,'ah','大象\n\n大象'),(91,'ah','式日\n\n式日 / Shiki Jitsu'),(92,'ah','资产阶级的审慎魅力\n\n资产阶级的审慎魅力 / 中产阶级的审慎魅力'),(93,'ap','恋爱通告\n\n玩转大明星');
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
  `user_id` varchar(20) NOT NULL,
  `music_name` varchar(100) NOT NULL,
  PRIMARY KEY (`want_music`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `want_music`
--

LOCK TABLES `want_music` WRITE;
/*!40000 ALTER TABLE `want_music` DISABLE KEYS */;
INSERT INTO `want_music` VALUES (1,'Tina','Adele - Chasing Pavements'),(2,'Tina','縱貫線... - 南下專線'),(3,'Tina','曾轶可 - Forever Road'),(4,'Tina','郁可唯 - 蓝短裤'),(5,'Tina','陶喆 - 69乐章'),(6,'alps','Ray Charles - Le Genius of Soul'),(7,'alps','雅克琳娜・杜普蕾... - 约翰内斯·勃拉姆斯2首大提琴奏鸣曲 雅克琳娜·杜普蕾'),(9,'CHEO','张学友 - 活出生命Live演唱会'),(10,'CHEO','永邦 - 永邦.com'),(26,'k','Belle & Sebastian - Storytelling'),(27,'k','Nightwish - Sleeping Sun'),(28,'n','Jason Mraz - Yes!'),(29,'n','Morrissey - World Peace Is None Of Your Business'),(30,'n','拱廊之火乐队 Arcade Fire - her'),(31,'n','杨乃文 - Zero'),(32,'n','陈绮贞 - 时间的歌'),(33,'r','苏通达 GTS - 我身骑白馬'),(34,'r','自由發揮 - 電影原聲帶'),(35,'r','八大锤 - 中国民族打击乐精选集:八大锤打击乐音乐会(VCD)'),(36,'r','万能青年旅店 - 万能青年旅店@MAO'),(37,'t','Caspian - The Four Trees'),(38,'t','Mazzy Star - Flowers In December'),(39,'t','Muscle Snog - Mind Shop'),(40,'x','黃偉文... - Y100+ (Grateful版)'),(41,'x','武汉大学原创音乐协会 - 珞樱2'),(42,'x','黄艾伦... - 春娇与志明'),(43,'x','何韵诗... - 黄伟文十周年音乐会'),(44,'x','赵可 - 赵可能性 梦境'),(45,'af','张浅潜 - 张浅潜'),(46,'af','张浅潜 - 灵魂出窍'),(47,'af','张浅潜 - 自己的主人 EP'),(48,'af','张浅潜 - 灵魂出窍'),(49,'af','许巍 - 此时此刻');
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
  `user_id` varchar(20) NOT NULL,
  `movie_name` varchar(100) NOT NULL,
  PRIMARY KEY (`watchid_movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `watched_movie`
--

LOCK TABLES `watched_movie` WRITE;
/*!40000 ALTER TABLE `watched_movie` DISABLE KEYS */;
INSERT INTO `watched_movie` VALUES (1,'Tina','行尸走肉 第六季'),(2,'Tina','无耻之徒(美版) 第六季\n\n无耻之徒(美版) / 无耻家庭(美版) 第六季'),(3,'Tina','小镇疑云 第三季'),(4,'Tina','小森林 夏秋篇\n\n小森林 夏秋篇 / 小森食光/夏秋篇(台)'),(5,'Tina','迷失1971\n\n迷失1971 / 71暴乱夜(港/台)'),(6,'alps','女囚尼基塔\n\n女囚尼基塔 / 霹雳煞'),(7,'CHEO','看得见风景的房间\n\n看得见风景的房间 / 翡冷翠之恋'),(8,'CHEO','海上传奇\n\n上海传奇'),(29,'k','赎罪\n\n赎罪 / 爱．诱．罪(台)'),(30,'k','再次出发之纽约遇见你\n\n再次出发之纽约遇见你 / 再次出发'),(31,'k','十二公民\n\n12公民'),(32,'k','我和厄尔以及将死的女孩\n\n我和厄尔以及将死的女孩 / 初恋有病(港)'),(33,'k','碟中谍5：神秘国度\n\n碟中谍5：神秘国度 / 职业特工队5：叛逆帝国(港)'),(34,'l','贫民窟的百万富翁\n\n贫民窟的百万富翁 / 贫民百万富翁(台)'),(35,'l','霸王别姬\n\n再见，我的妾'),(36,'l','活着\n\n人生'),(37,'l','阿凡达\n\n阿凡达 / 天神下凡'),(38,'l','触不可及\n\n触不可及 / 闪亮人生(港)'),(39,'m','末日崩塌\n\n末日崩塌 / 加州大地震(台)'),(40,'m','三国演义\n\nThe Romance of Three Kingdoms'),(41,'m','速度与激情7\n\n速度与激情7 / 狂野时速7(港)'),(42,'m','行尸走肉 第五季\n\n行尸走肉 / 阴尸路 第五季(台)'),(43,'m','未知死亡\n\n未知死亡 / 凶心人在宝莱坞'),(44,'n','007：幽灵党\n\n007：幽灵党 / 007：鬼影帝国(港)'),(45,'n','国土安全 第四季\n\n国土安全 / 国土 第四季'),(46,'n','唐顿庄园 第五季'),(47,'n','傲骨贤妻 第六季\n\n傲骨贤妻 / 法庭女王'),(48,'n','福斯特医生 第一季\n\n福斯特医生 / 出轨的爱人'),(49,'o','机械姬\n\n机械姬 / 机器夏娃'),(50,'o','夏洛特烦恼\n\nGoodbye Mr. Loser'),(51,'o','泰迪熊2\n\n泰迪熊2 / 熊麻吉2(台)'),(52,'o','碟中谍5：神秘国度\n\n碟中谍5：神秘国度 / 职业特工队5：叛逆帝国(港)'),(53,'o','煎饼侠\n\n屌丝男士大电影'),(54,'r','冰血暴 第一季'),(55,'r','无耻之徒(美版) 第四季\n\n无耻之徒(美版) / 无耻家庭(美版) 第四季'),(56,'r','我们的父辈\n\n我们的父辈 / 我们的母亲，我们的父亲'),(57,'r','夜幕下的故事\n\n夜幕下的故事 / 夜幕下的物语'),(58,'r','罪恶黑名单 第一季\n\n罪恶黑名单 / 黑名单'),(59,'t','大路\n\n大路 / The Road'),(60,'t','超完美地狱\n\n超完美地狱 / 麻烦的人'),(61,'t','机动战士高达 第08MS小队\n\n机动战士高达 第08MS小队'),(62,'t','SPEC\n\nSPEC / SPEC 警视厅公安部公安第五课 未详事件特别对策系事件簿'),(63,'t','越狱兔 第四季\n\n越狱兔 第四季 / 普京兔和基里连科兔'),(64,'u','扫毒\n\n扫毒 / 变役'),(65,'u','饥饿游戏2：星火燎原\n\n饥饿游戏2：星火燎原 / 饥饿游戏 第二部'),(66,'u','人再囧途之泰囧\n\n泰囧'),(67,'u','黄金大劫案\n\n黄金谜案'),(68,'u','开心家族\n\n开心家族 / 开心鬼上身'),(69,'x','我是证人\n\n盲证'),(70,'x','山河故人\n\n山河恋人'),(71,'x','十二公民\n\n12公民'),(72,'x','夏洛特烦恼\n\nGoodbye Mr. Loser'),(73,'x','伊莎贝拉\n\nIsabella'),(74,'y','全面回忆\n\n全面回忆 / 拦截记忆码(台)'),(75,'y','无敌破坏王\n\n无敌破坏王 / 破坏王拉尔夫'),(76,'y','谍影重重4\n\n谍影重重4 / 叛谍追击4：机密逃杀(港)'),(77,'y','蝙蝠侠：黑暗骑士崛起\n\n蝙蝠侠：黑暗骑士崛起 / 蝙蝠侠前传3：黑暗骑士崛起'),(78,'y','听风者\n\nThe Silent War'),(79,'z','蓝白红三部曲之红\n\n蓝白红三部曲之红 / 红'),(80,'z','蓝白红三部曲之白\n\n蓝白红三部曲之白 / 白'),(81,'z','蓝白红三部曲之蓝\n\n蓝白红三部曲之蓝 / 蓝'),(82,'z','死亡诗社\n\n死亡诗社 / 暴雨骄阳(港)'),(83,'z','放牛班的春天\n\n放牛班的春天 / 歌声伴我心(港)'),(84,'af','心迷宫\n\n殡棺'),(85,'af','爆裂鼓手\n\n爆裂鼓手 / 鼓动真我(港)'),(86,'af','黄金时代\n\n穿过爱情的漫长旅程'),(87,'af','夺命手机\n\n夺命手机 / 梯阵阴谋'),(88,'af','超验骇客\n\n超验骇客 / 超越潜能(港)'),(89,'ah','小时代3：刺金时代\n\n小时代3'),(90,'ah','哥斯拉\n\n哥斯拉 / 哥吉拉(台)'),(91,'ah','沉睡魔咒\n\n沉睡魔咒 / 黑魔后：沉睡魔咒(港)'),(92,'ah','分手大师\n\nThe Breakup Guru'),(93,'ah','老男孩猛龙过江\n\n老男孩之猛龙过江'),(94,'aj','无间道\n\n无间道 / Infernal Affairs'),(95,'aj','爱情呼叫转移'),(96,'aj','天使爱美丽\n\n天使爱美丽 / 艾蜜莉的异想世界(台)'),(97,'aj','星球大战3：绝地归来\n\n星球大战3：绝地归来 / 星球大战第六集：武士复仇'),(98,'aj','星球大战2：帝国反击战\n\n星球大战2：帝国反击战 / 星球大战第二集：帝国反击战'),(99,'ao','名侦探柯南：引爆摩天楼\n\n名侦探柯南：引爆摩天楼 / 名侦探柯南1997：引爆摩天楼'),(100,'ap','让子弹飞\n\n让子弹飞一会儿'),(101,'ap','大象\n\n大象'),(102,'aq','新世纪福音战士剧场版：咏叹调/真心为你\n\n新世纪福音战士剧场版：咏叹调/真心为你 / 新世纪福音战士剧场版2'),(103,'aq','娜娜\n\n娜娜 / 世上的另一个我');
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

-- Dump completed on 2015-11-17 14:00:51
