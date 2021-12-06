DROP TABLE IF EXISTS loan;

CREATE TABLE `loan` (
    `loan_number` int NOT NULL AUTO_INCREMENT,
    `customer_id` int NOT NULL,
    `start_date` date NOT NULL,
    `loan_duration` int NOT NULL,
    `loan_type` varchar(128) NOT NULL,
    `total_loan` int NOT NULL,
    `amount_paid` int NOT NULL,
    `amount_outstanding` int NOT NULL,
    `creation_date` date DEFAULT NULL,
    PRIMARY KEY (`loan_number`)
);

INSERT INTO `loan` ( `customer_id`, `start_date`, `loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 1, '2020-06-10', 72, 'Home', 200000, 50000, 150000, '2020-06-10');

INSERT INTO `loan` ( `customer_id`, `start_date`,`loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 1, '2020-06-06', 48, 'Vehicle', 40000, 10000, 30000, '2020-06-06');

INSERT INTO `loan` ( `customer_id`, `start_date`, `loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 1, '2021-02-14', 60, 'Home', 50000, 10000, 40000, '2018-02-14');

INSERT INTO `loan` ( `customer_id`, `start_date`, `loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 1, '2018-02-14', 24, 'Personal', 10000, 3500, 6500, '2018-02-14');

INSERT INTO `loan` ( `customer_id`, `start_date`,`loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 2, '2020-06-06', 48, 'Vehicle', 40000, 10000, 30000, '2020-06-06');

INSERT INTO `loan` ( `customer_id`, `start_date`, `loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 2, '2021-02-14', 60, 'Home', 50000, 10000, 40000, '2018-02-14');

INSERT INTO `loan` ( `customer_id`, `start_date`, `loan_duration`, `loan_type`, `total_loan`, `amount_paid`, `amount_outstanding`, `creation_date`)
VALUES ( 2, '2018-02-14', 24, 'Personal', 10000, 3500, 6500, '2018-02-14');