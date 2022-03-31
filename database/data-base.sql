CREATE DATABASE simple - store;

CREATE TABLE `simple-store`.`products` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(100) NOT NULL,
    `description` VARCHAR(120) NOT NULL,
    `cost` DECIMAL(10, 2) NOT NULL,
    `price` DECIMAL(10, 2) NOT NULL,
    `stock` INT NOT NULL,
    `category` INT NOT NULL,
    `supplier` INT NOT NULL,
    `status` BOOLEAN NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE `simple-store`.`users` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `user` VARCHAR(50) NOT NULL,
    `pass` VARCHAR(255) NOT NULL,
    `status` BOOLEAN NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE `simple-store`.`sales` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `date` DATE NOT NULL,
    `total` DECIMAL(14, 2) NOT NULL,
    `status` BOOLEAN NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE `simple-store`.`sales_detail` (
    `id` INT NOT NULL,
    `sales_id` INT NOT NULL,
    `product_id` INT NOT NULL,
    `cant` INT NOT NULL,
    `total` DECIMAL(14, 2) NOT NULL
) ENGINE = InnoDB;


-- INSERT USERS
INSERT INTO `users` (`id`, `user`, `pass`, `status`) VALUES (NULL, 'admin', 'admin', '1');