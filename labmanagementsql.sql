-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2018 at 07:10 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `labmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(3) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `depreciation` int(11) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `deskripsi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga`, `depreciation`, `tgl_masuk`, `deskripsi`) VALUES
(101, 'Monitor Acer', 500000, 50000, '2018-04-26', ''),
(102, 'Mouse Razer', 250000, 25000, '2018-04-26', '');

-- --------------------------------------------------------

--
-- Table structure for table `laboran`
--

CREATE TABLE `laboran` (
  `id_laboran` int(3) NOT NULL,
  `nama_laboran` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laboran`
--

INSERT INTO `laboran` (`id_laboran`, `nama_laboran`, `tgl_lahir`, `username`, `password`, `address`) VALUES
(201, 'Ahmad Ghozali', '1992-04-19', 'aghozali', 'itera123', 'Jl Kampung Sumur No.14 Bandar Lampung'),
(202, 'Jane Nurhanifah', '1997-04-12', 'jane', 'itera123', 'Jl Kesuma Bangsa No. 12 Bandar Lampung ');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` int(3) NOT NULL,
  `nama_member` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `tgl_lahir`, `username`, `password`, `address`) VALUES
(301, 'Parveen Putra', '1996-08-31', 'parveen', 'lab123', 'Jl Puja Puja Blok C'),
(302, 'Robert Jr', '1992-02-24', '', '', 'Jl Jalan Ku Jaga No.12');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(3) NOT NULL,
  `id_barang` int(3) NOT NULL,
  `id_laboran` int(3) NOT NULL,
  `id_member` int(3) NOT NULL,
  `tgl_peminjaman` date NOT NULL,
  `lama_peminjaman` int(2) NOT NULL,
  `status_peminjaman` set('borrowed','returned','','') NOT NULL,
  `tgl_pengembalian` date DEFAULT NULL,
  `fee` int(11) DEFAULT NULL,
  `kondisi` set('Good','Broken','','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `id_barang`, `id_laboran`, `id_member`, `tgl_peminjaman`, `lama_peminjaman`, `status_peminjaman`, `tgl_pengembalian`, `fee`, `kondisi`) VALUES
(401, 101, 201, 301, '2018-04-26', 2, 'borrowed', NULL, NULL, 'Good');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `laboran`
--
ALTER TABLE `laboran`
  ADD PRIMARY KEY (`id_laboran`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `peminjaman_ibfk1` (`id_barang`),
  ADD KEY `peminjaman_ibfk2` (`id_laboran`),
  ADD KEY `peminjaman_ibfk3` (`id_member`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `laboran`
--
ALTER TABLE `laboran`
  MODIFY `id_laboran` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=203;

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id_member` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=303;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_peminjaman` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=402;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`) ON UPDATE CASCADE,
  ADD CONSTRAINT `peminjaman_ibfk2` FOREIGN KEY (`id_laboran`) REFERENCES `laboran` (`id_laboran`) ON UPDATE CASCADE,
  ADD CONSTRAINT `peminjaman_ibfk3` FOREIGN KEY (`id_member`) REFERENCES `member` (`id_member`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
