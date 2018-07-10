.DEFAULT_GOAL := run
.PHONY: start-maven start-tomcat package repackage run

start-maven:
	docker-compose up -d maven

start-tomcat:
	docker-compose up -d tomcat
	docker-compose logs -f tomcat

package:
	docker-compose exec maven mvn clean package

repackage: package
	docker-compose restart tomcat
	docker-compose logs -f tomcat

run: start-maven package start-tomcat
