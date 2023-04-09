# DBMS-Lab-RDBMS

## Execution
```
git clone https://github.com/lomayd/DBMS-Lab-RDBMS.git

cd ./DBMS-Lab-RDBMS

[Write down "MYSQL_ROOT_PASSWORD", "SA_PASSWORD", "POSTGRES_PASSWORD" in docker-compose.yml]

docker-compose up -d

[Execute Oracle.sql, Mysql.sql, Mssql.sql, Postgresql.sql in /src/main/resources/ddl]

[Write down "spring.mysql.password", "spring.mssql.password", "spring.postgresql.password" in /src/main/resources/application.yml]

sudo chmod 777 ./gradlew

./gradlew build

java -jar build/libs/DBMS-Lab-RDBMS-0.0.1-SNAPSHOT.jar 
```

## Contents
- RDBMS Installation Using Docker Image
- Springboot Application - RDBMS Connection
- Springboot Multi-DataSource Configuration
- Springboot CRUD API Implementation Using JPA Repository
