package it.progetto.FIndJobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.progetto.FIndJobs.model.*;

@SpringBootApplication
public class FIndJobsApplication {

	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(FIndJobsApplication.class, args);
		CollegamentoApiKey.link();
	}

}
