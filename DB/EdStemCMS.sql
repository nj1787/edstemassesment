CREATE database CMS;

use CMS;

CREATE TABLE Users(
    user_contact_number bigint primary key not null,
    user_name varchar(50) not null,
    user_address varchar(100),
    user_email varchar(75)
);

SHOW TABLES;

SELECT * FROM Users;