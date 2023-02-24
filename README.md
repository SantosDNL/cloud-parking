# Cloud Parking

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

## Stop and Start database
docker stop parking-db

docker start parking-db

## Default DB User and Password
<li>user</li>
<li>Dio@123456</li>

Link para acesso: http://ec2-18-228-30-233.sa-east-1.compute.amazonaws.com:8080/swagger-ui.html

O redirecionamento está direto para o Swagger, pois este projeto foi totalmente focado em back (talvez, quem sabe, um front em breve kkkk)

## LinkedIn

<div>
<a href="https://www.linkedin.com/in/santosddaniel/"><img src="https://cdn.icon-icons.com/icons2/2530/PNG/512/linkedin_button_icon_151847.png" width="225" height="60"></a>   
</div>
