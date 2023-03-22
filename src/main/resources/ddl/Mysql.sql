-- MySQL은 스키마 만들어지고 그 안에 테이블 생성됌

CREATE DATABASE LAB;

USE LAB;

CREATE TABLE User
(
    id varchar(255),
    password varchar(255),
    name varchar(255),
    nickname varchar(255),
    email varchar(255),
    age int
);