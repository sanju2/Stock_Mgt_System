-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2019 at 11:48 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `catid` int(100) DEFAULT NULL,
  `catname` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cusid` int(100) NOT NULL,
  `cusname` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `grn`
--

CREATE TABLE `grn` (
  `grnno` int(100) DEFAULT NULL,
  `itemid` int(100) DEFAULT NULL,
  `itemname` varchar(100) DEFAULT NULL,
  `catname` varchar(30) DEFAULT NULL,
  `sup` varchar(100) DEFAULT NULL,
  `pup` varchar(100) DEFAULT NULL,
  `qty` varchar(100) DEFAULT NULL,
  `total` varchar(100) DEFAULT NULL,
  `supid` int(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `invoiceno` int(100) DEFAULT NULL,
  `itemid` int(100) DEFAULT NULL,
  `itemname` varchar(100) DEFAULT NULL,
  `catname` varchar(30) DEFAULT NULL,
  `sup` varchar(100) DEFAULT NULL,
  `pup` varchar(100) DEFAULT NULL,
  `qty` varchar(100) DEFAULT NULL,
  `total` varchar(100) DEFAULT NULL,
  `cusid` int(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `itemid` int(100) NOT NULL,
  `itemname` varchar(100) DEFAULT NULL,
  `catname` varchar(30) DEFAULT NULL,
  `sup` varchar(100) DEFAULT NULL,
  `pup` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `supid` int(100) NOT NULL,
  `supfname` varchar(100) DEFAULT NULL,
  `suplname` varchar(100) DEFAULT NULL,
  `supnic` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`catname`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cusid`);

--
-- Indexes for table `grn`
--
ALTER TABLE `grn`
  ADD KEY `catname` (`catname`),
  ADD KEY `itemname` (`itemname`),
  ADD KEY `itemid` (`itemid`),
  ADD KEY `supid` (`supid`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD KEY `catname` (`catname`),
  ADD KEY `itemname` (`itemname`),
  ADD KEY `itemid` (`itemid`),
  ADD KEY `cusid` (`cusid`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`itemid`),
  ADD KEY `catname` (`catname`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`supid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
