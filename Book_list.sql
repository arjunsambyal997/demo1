-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 21, 2018 at 03:58 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Book_list`
--

-- --------------------------------------------------------

--
-- Table structure for table `Book`
--

CREATE TABLE `Book` (
  `bookid` int(45) NOT NULL,
  `userid` int(45) DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `genre` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Book`
--

INSERT INTO `Book` (`bookid`, `userid`, `name`, `author`, `genre`, `state`) VALUES
(10, 11, 'sherlock', 'conan', 'mystery', 'Plan to Read'),
(29, 11, 'sherlock2', 'conan', 'mystery', 'Plan to Read'),
(30, 11, 'sherlock2', 'conan', 'mystery', 'Completed'),
(31, 11, 'sherlock3', 'conan', 'mystery', 'Dropped ');

-- --------------------------------------------------------

--
-- Table structure for table `BookStatus`
--

CREATE TABLE `BookStatus` (
  `bid` int(45) NOT NULL,
  `status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `BookStatus`
--

INSERT INTO `BookStatus` (`bid`, `status`) VALUES
(10, 'unavailable'),
(30, 'unavailable'),
(31, 'available');

-- --------------------------------------------------------

--
-- Table structure for table `Borrower`
--

CREATE TABLE `Borrower` (
  `borrowid` int(45) NOT NULL,
  `bookid` int(45) NOT NULL,
  `ownerid` int(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Contact`
--

CREATE TABLE `Contact` (
  `contactid` int(45) DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Contact`
--

INSERT INTO `Contact` (`contactid`, `name`, `email`, `phone`) VALUES
(11, 'ashGod', 'ashwin@gmail', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `User`
--

CREATE TABLE `User` (
  `uid` int(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `User`
--

INSERT INTO `User` (`uid`, `username`, `password`) VALUES
(11, 'ashwin', 'ash123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Book`
--
ALTER TABLE `Book`
  ADD PRIMARY KEY (`bookid`),
  ADD KEY `uid` (`userid`);

--
-- Indexes for table `BookStatus`
--
ALTER TABLE `BookStatus`
  ADD KEY `bookid` (`bid`);

--
-- Indexes for table `Borrower`
--
ALTER TABLE `Borrower`
  ADD KEY `borrowid` (`borrowid`),
  ADD KEY `bookid` (`bookid`),
  ADD KEY `ownerid` (`ownerid`);

--
-- Indexes for table `Contact`
--
ALTER TABLE `Contact`
  ADD KEY `contactid` (`contactid`);

--
-- Indexes for table `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Book`
--
ALTER TABLE `Book`
  MODIFY `bookid` int(45) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `User`
--
ALTER TABLE `User`
  MODIFY `uid` int(45) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Book`
--
ALTER TABLE `Book`
  ADD CONSTRAINT `Book_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `User` (`uid`);

--
-- Constraints for table `BookStatus`
--
ALTER TABLE `BookStatus`
  ADD CONSTRAINT `BookStatus_ibfk_1` FOREIGN KEY (`bid`) REFERENCES `Book` (`bookid`);

--
-- Constraints for table `Borrower`
--
ALTER TABLE `Borrower`
  ADD CONSTRAINT `Borrower_ibfk_1` FOREIGN KEY (`borrowid`) REFERENCES `User` (`uid`),
  ADD CONSTRAINT `Borrower_ibfk_2` FOREIGN KEY (`ownerid`) REFERENCES `User` (`uid`),
  ADD CONSTRAINT `Borrower_ibfk_3` FOREIGN KEY (`bookid`) REFERENCES `Book` (`bookid`);

--
-- Constraints for table `Contact`
--
ALTER TABLE `Contact`
  ADD CONSTRAINT `Contact_ibfk_1` FOREIGN KEY (`contactid`) REFERENCES `User` (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
