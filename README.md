# cloud-parking

## Tecnologias Utilizadas

<li>IDE Eclipse</li>
<li>Java 11</li>
<li>Apache Maven</li>
<li>Spring Web</li>
<li>Spring Security</li>
<li>Spring Data JPA</li>
<li>Swagger</li>
<li>PostgreSQL</li>
<li>Hibernate Validator</li>
<li>Postman</li>
<li>Docker</li>
<li>Heroku/AWS</li>
<li>WSL*</li>
*foi necessário a instalação do Subsistema Windows para Linux (WSL) no início, pois não havia instalado Linux na máquina

## Run database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

## Stop database
docker stop parking-db

## Start database
docker start parking-db

## Default DB User and Password
<li>user</li>
<li>Dio@123456</li>

## LinkedIn

https://www.linkedin.com/in/santosddaniel/
