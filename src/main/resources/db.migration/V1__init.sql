drop table if exists user;
drop table if exists user_refresh_token;

CREATE TABLE IF NOT EXISTS `TEST`.`user`
(
    'id' BIGINT NOT NULL AUTO_INCREMENT,
    'login_id' VARCHAR(100),
    'password' VARCHAR(100),
    'email' VARCHAR(100),
    'email_verified_yn' CHAR,
    'provider_type' VARCHAR(100),
    'role_type' VARCHAR(100),
    PRIMARY KEY('id')
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `TEST`.`user`
(
    'id' BIGINT NOT NULL AUTO_INCREMENT,
    'login_id' VARCHAR(100),
    'refresh_token' VARCHAR(100),
    'email' VARCHAR(100),
    'email_verified_yn' CHAR,
    'provider_type' VARCHAR(100),
    'role_type' VARCHAR(100),
    PRIMARY KEY('id')
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `TEST`.`user_refresh_token`
(
    'id' BIGINT NOT NULL AUTO_INCREMENT,
    'login_id' VARCHAR(100),
    'refresh_token' VARCHAR(100),
    PRIMARY KEY('id')
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `TEST`.`user`(login_id,
                          password,
                          email,
                          email_verified_yn,
                          provider_type,
                          role_type,
                          user_name)
VALUES ('admin',
        '$2a$10$peuWnCxeKrhb64MYFam90ebCFSTBfLEP8iSEaLPNGvN3eSckcxQai',
        'dev.ukidugi@gmail.com',
        'Y',
        'LOCAL',
        'ROLE_ADMIN',
        '김홍욱');