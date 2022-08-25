package one.digitalinnovation.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication													/*Ela engloba a @Component, @ComponentScan e mais uma chamada 
																		@EnableAutoConfiguration, que é utilizada pelo Spring Boot 
																		para tentar advinhar as configurações necessárias para rodar
																		o seu projeto*/
public class CloudParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudParkingApplication.class, args);
	}

}
