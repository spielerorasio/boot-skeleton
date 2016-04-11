How to build the environemnt

	docker run --name hpemcRedis -d -it  -p 6379:6379 redis:latest
	docker run --name hpemcPostgres -it -p 5432:5432  -e POSTGRES_USER=hpemc -e POSTGRES_PASSWORD=password -e POSTGRES_DB=hpemc -d postgres:9.3
	docker run -d -it  -p 5672:5672   -p 15672:15672   --hostname hpemc-rabbit --name hpemcRabbit  -e RABBITMQ_ERLANG_COOKIE='ABCDABCD'  -e RABBITMQ_DEFAULT_USER=hpemc -e RABBITMQ_DEFAULT_PASS=password  rabbitmq:3-management
	docker run --name firstHPEMC -e "ddl=create-drop" -e "POSTGRES_ADDRESS=192.168.99.100"  -e "REDIS_ADDRESS=192.168.99.100" -e "RABBITMQ_ADDRESS=192.168.99.100" -e "SERVER_PORT=8888"  -p 8888:8888 -d  -it orasio/hpe-mobile-boot
	docker run --name secondHPEMC  -e "POSTGRES_ADDRESS=192.168.99.100"  -e "REDIS_ADDRESS=192.168.99.100" -e "RABBITMQ_ADDRESS=192.168.99.100" -e "SERVER_PORT=9999"  -p 9999:9999 -d  -it orasio/hpe-mobile-boot



How to run maven docker plugin

	mvn package docker:build
	docker push orasio/hpe-mobile-boot


how to run locally

	mvn clean install  
	java  -jar target\boot-skeleton-1.0-SNAPSHOT.jar --postgres.address=192.168.99.100 --redis.address=192.168.99.100 --rabbitmq.address=192.168.99.100 --ddl=create-drop
	java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=y -jar target\boot-skeleton-1.0-SNAPSHOT.jar  --postgres.address=192.168.99.100 --redis.address=192.168.99.100 --rabbitmq.address=192.168.99.100 --ddl=create-drop



we did we build
spring boot project
		
		jetty
		postgres 9.3
		rest spring mvc
		jpa 
		amqp
		redis
		session replication on top of redis
		Logback logging
		testng+hsql
 
we need more
add spring-boot-starter-mail
improve tests => spring-boot-starter-test




Installation On Windows
	1. install docker toolbox https://docs.docker.com/windows/step_one/
	2. open command and run docker-machine create -d virtualbox --engine-env HTTP_PROXY=http://proxy:8080 --engine-env HTTPS_PROXY=http://proxy:8080 --engine-env NO_PROXY=192.168.99.100   default
	3. add the following windows environemnt system properties

		DOCKER_TLS_VERIFY=1
		DOCKER_HOST=tcp://192.168.99.100:2376
		DOCKER_CERT_PATH=C:\Users\<user>\.docker\machine\machines\default
		DOCKER_MACHINE_NAME=default

		HTTP_PROXY=http://proxy:8080
		HTTPS_PROXY=http://proxy:8080
		NO_PROXY=192.168.99.100

