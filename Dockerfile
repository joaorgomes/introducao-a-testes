FROM maven:3.9.9-eclipse-temurin-21-jammy

EXPOSE 8080

RUN mkdir -p /home/introducaotestes

COPY ./testeunitario /home/introducaotestes

WORKDIR /home/introducaotestes