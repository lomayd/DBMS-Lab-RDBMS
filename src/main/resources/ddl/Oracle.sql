-- Oracle은 SYSTEM 스키마 안에서 Table 생성됌
-- 예약어는 "" 쓰기

CREATE TABLE "User"
(
    id varchar(255),
    password varchar(255),
    name varchar(255),
    nickname varchar(255),
    email varchar(255),
    age int
);