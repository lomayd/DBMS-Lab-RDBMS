-- PostgreSQL은 USE 명령어 못 쓰고 반드시 해당 데이터베이스로 연결해야만 테이블 사용 가능
-- PostgreSQL은 데이터베이스 안에 public 스키마 안에 테이블 생성됌
-- 예약어는 "" 쓰기

CREATE DATABASE "LAB";

CREATE TABLE "User"
(
    id varchar(255),
    password varchar(255),
    name varchar(255),
    nickname varchar(255),
    email varchar(255),
    age int
);