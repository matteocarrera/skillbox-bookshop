DROP TABLE IF EXISTS books, authors;

CREATE TABLE books(
id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(250) NOT NULL,
authorId INT NOT NULL,
priceOld  VARCHAR(250) DEFAULT NULL,
price VARCHAR(250) DEFAULT NULL
);

CREATE TABLE authors(
id INT AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR(250) NOT NULL,
secondName VARCHAR(250) NOT NULL
);