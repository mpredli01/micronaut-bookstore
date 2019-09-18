
# Micronaut Bookstore Example

This example implements a bookstore application with three microservices written in Java, Groovy and Kotlin.

## Start Consul

```
$ docker run -p 8500:8500 consul
```

## Run Consul

```
http://localhost:8500/ui
```

## Build

```
gradle
```

## Start the application

```
gradle -parallel run
```

## Exercise the application

Client calls GET http://localhost:8080/api/books to gateway microservice.

gateway microservice calls GET http://localhost:8082/api/books to books microservice.
books microservice responds "200 OK" to gateway microservice.

gateway microservice calls GET http://localhost:8081/api/inventory/1491950358 to inventory microservice.
inventory microservice responds "200 2” to gateway microservice.
gateway microservice calls GET http://localhost:8081/api/inventory/1680502395 to inventory microservice.
inventory microservice responds "200 3” to gateway microservice.

```
curl -X GET http://localhost:8080/api/books
[{"isbn":"1491950358","name":"Building Microservices","stock":2},{"isbn":"1680502395","name":"Release It!","stock":3}]

curl -X GET http://localhost:8082/api/books
[{"isbn":"1491950358","name":"Building Microservices"},{"isbn":"1680502395","name":"Release It!"}]
```
