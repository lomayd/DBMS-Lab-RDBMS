-- MSSQL은 데이터베이스 안에 dbo 스키마 안에 테이블 생성됌
-- 예약어는 [] 쓰기

CREATE DATABASE [LAB];

USE [LAB];

CREATE TABLE [User]
(
    id varchar(255),
    password varchar(255),
    name varchar(255),
    nickname varchar(255),
    email varchar(255),
    age int
);