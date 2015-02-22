package controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import java.net.*;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	@Autowired
	private SiniestroRepository repositorySini;

	public void run(String... args) throws Exception {

		repositorySini.deleteAll();
		repositorySini.save(new Siniestro("4720BNL", "0000001",
				"VF1DA050525512550", "RENAULT",
				"RENAULT MEGANE DYNAMIQUE 1900 DCI COUPE", "01/01/2014",
				"A42 KM 30", "Siniestro total"));

		// fetch all siniestros
		System.out.println("Siniestros found with findAll():");
		System.out.println("-------------------------------");
		for (Siniestro sini : repositorySini.findAll()) {
			System.out.println(sini);
		}
		System.out.println();

	}
}
