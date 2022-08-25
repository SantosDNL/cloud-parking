package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")													/*Geralmente utilizada em cima dos métodos de uma classe anotada 
																		  com @Controller ou @RestController. Serve para você colocar os 
																		  endereços da sua aplicação que, quando acessados por algum cliente, 
																		  deverão ser direcionados para o determinado método.*/

@ApiIgnore																/*A  anotação @ApiIgnore nos permite ocultar um endpoint.*/
public class HelloController {

    @GetMapping															/*Anotação para mapear GETsolicitações HTTP em métodos de manipulador específicos.
																		  Especificamente, @GetMappingé uma anotação composta que funciona 
																		  como um atalho para arquivos @RequestMapping(method = RequestMethod.GET).*/
    public String hello(){
        return "Hello DIO. Java devs";
    }

}
