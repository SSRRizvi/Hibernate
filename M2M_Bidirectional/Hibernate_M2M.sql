CREATE TABLE users (
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  username varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  email varchar(45) NOT NULL
);

CREATE TABLE groups (
  group_id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(45) NOT NULL
);


CREATE TABLE IF NOT EXISTS `users_groups` (
  `user_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`group_id`),
  KEY `GROUP_FK` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `users_groups`
  ADD CONSTRAINT `GROUP_FK` FOREIGN KEY (`group_id`) REFERENCES `groups` (`group_id`),
  ADD CONSTRAINT `USER_FK` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);