FROM ubuntu:latest

WORKDIR /spring-app

RUN apt update && apt install openjdk-17-jdk -y

COPY . .

CMD java -jar target/demo-for-docker-0.0.1-SNAPSHOT.jar

EXPOSE 8080


