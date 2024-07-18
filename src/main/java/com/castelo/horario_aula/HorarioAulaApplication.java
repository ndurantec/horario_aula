package com.castelo.horario_aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
// Caso não estiver usando base de dados usar a linha abaixo, caso for utilizar base de dados, comentar essa linha e descomentar a de cima
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class HorarioAulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorarioAulaApplication.class, args);
	}

}
