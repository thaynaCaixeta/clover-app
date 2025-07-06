# Makefile for Clover Spring Boot Gradle app

APP_NAME=clover
JAR_FILE=$(shell ls build/libs/*SNAPSHOT.jar | grep -v plain | head -n 1)
.PHONY: up migrate build run restart stop clean local-start

up:
	docker compose up -d

migrate:
	docker compose run --rm flyway

build:
	./gradlew clean build -x test

run:
	java -jar $(JAR_FILE)

restart: clean up migrate build run

stop:
	docker compose down -v

clean:
	./gradlew clean

# Start local development
local-start: clean stop up build run
