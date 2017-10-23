--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `deptId` INT NOT NULL AUTO_INCREMENT,
  `deptName` varchar(200) DEFAULT NULL,
  `deptLocation` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`deptId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`deptId`, `deptName`, `deptLocation`) VALUES
('1', 'Admin', 'Noida India'),
('2', 'Finance', 'Noida India'),
('3', 'HR', 'Banglore India'),
('4', 'ITSD', 'Banglore India'),
('5', 'IT', 'Delhi India'),
('6', 'MyDepartmetTest', 'MyLocation');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

	CREATE TABLE IF NOT EXISTS `employee` (
	  `empId` INT PRIMARY KEY  AUTO_INCREMENT,
	  `empDeptId` INT DEFAULT NOT NULL,
	  `empName` varchar(200) DEFAULT NULL,
	  `empAddress` varchar(500) DEFAULT NULL,
	  `empAge` decimal(3,0) DEFAULT NULL,
	  `empSalary` decimal(18,2) DEFAULT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=latin1;


alter table employee
add foreign key (empDeptId) references department(deptId)
--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empId`, `empDeptId`, `empName`, `empAddress`, `empAge`, `empSalary`) VALUES
('1', '1', 'baljeet singh', 'bhangale noida', '37', '28000.00'),
('2', '1', 'Rana badeep', 'Noida sec-22', '40', '20000.00'),
('3', '1', 'Prashant Singh', 'Noida sec-99', '39', '32000.00'),
('4', '2', 'Ashish', 'Delhi', '37', '80000.00'),
('5', '2', 'Roopesh', 'Noida-62', '37', '70000.00'),
('6', '2', 'Syed Baquar', 'Noida sec-82', '30', '50000.00'),
('7', '3', 'Depica', 'Delhi', '37', '70000.00'),
('8', '3', 'Shilpa singh', 'Noida sec-61', '34', '46000.00'),
('9', '3', 'Shalini Singh', 'Noida sec-99', '28', '40000.00'),
('10', '4', 'Amit Sharma', 'Delhi', '37', '48000.00'),
('11', '4', 'Bldeep Singh', 'Noida Sec-110', '37', '56000.00'),
('12', '4', 'Fazil', 'Greater Noida', '28', '40000.00'),
('13', '5', 'Sajid Rizvi', 'Noida Sec-56', '27', '45000.00'),
('14', '5', 'Amit sharma', 'Noida Sec-29', '27', '46000.00'),
('15', '5', 'Abhishek Singh', 'Noida sec-56', '27', '65000.00'),
('16', '6', 'MyName', 'Noida', '80', '40000.00'),
('17', '6', 'MyName123', 'Noida 123', '81', '50000.00')



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
