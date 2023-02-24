# Cloud Parking

## Tecnologias Utilizadas

<li>IDE Eclipse</li>
<li>Java 11</li>
<li>Spring Boot</li>
<li>Apache Maven</li>
<li>Spring Web</li>
<li>Spring Security</li>
<li>Spring Data JPA</li>
<li>PostgreSQL</li>
<li>Docker</li>
<li>Hibernate Validator</li>
<li>Swagger</li>
<li>Postman</li>
<li>Heroku/AWS</li>
<li>WSL*</li>
*foi necessário a instalação do Subsistema Windows para Linux (WSL) no início, pois não havia instalado Linux na máquina

## Run database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

## Stop and Start database
docker stop parking-db

docker start parking-db

## Default DB User and Password
<li><strong>Login: </strong>user</li>
<li><strong>Password: </strong>Dio@123456</li>

## LinkedIn

<div>
<a href="https://www.linkedin.com/in/santosddaniel/"><img src="https://cdn.icon-icons.com/icons2/2530/PNG/512/linkedin_button_icon_151847.png" width="225" height="60"></a>   
</div>

### Observação

Caso faça o clone e tente subir a aplicação, abra utilizando a página do Swagger (localhost:8080<strong>/swagger-ui.html#/</strong>), pois o projeto não possui interface (quem sabe um dia faço o front kkkk).
