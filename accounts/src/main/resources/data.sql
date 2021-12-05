DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS account;


CREATE TABLE `customer` (
    `customer_id` int AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(128) NOT NULL,
    `email` varchar(128) NOT NULL,
    `mobile_number` varchar(20) NOT NULL,
    `creation_date` date DEFAULT NULL
);

CREATE TABLE `account` (
    `customer_id` int NOT NULL,
    `account_number` int AUTO_INCREMENT PRIMARY KEY,
    `account_type` varchar(128) NOT NULL,
    `branch_address` varchar(255) NOT NULL,
    `creation_date` date DEFAULT NULL
);

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`creation_date`)
VALUES ('Peter Soriano','timsoriano3@gmail.com','1234567890',CURDATE());

INSERT INTO `account` (`customer_id`, `account_number`, `account_type`, `branch_address`, `creation_date`)
VALUES (1, 987654321, 'Cheguing', '123 Main Street, Toronto', CURDATE());