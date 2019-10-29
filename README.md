# real-time

A real-time web system with kafka/mongo/spring boot.

## tech stack 

- WebSocket
- Kafka
- Spring boot
- MongoDB

## TODO

- Persis message to MongoDB
- Write architecture diagram


## How to run it

Run docker to start kafka

> docker-compose -f docker-compose.yml up -d

Run spring boot application

> ./gradlew bootrun

Visit Url  http://localhost:8080 

## References

- http://www.paper.edu.cn/releasepaper/content/4619472

## Client Design principles

- Every command should be idempotent
- Data structure should be one layer

## Application Examples

- Instance Chat Room
- Real Time Todo List
- BrainStorm Wall
- Share Editing

