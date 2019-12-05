package br.com.rnascimento.eurekaServer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	
	private static final Logger LOG = LogManager.getLogger();

	public static void main(String[] args) {
		LOG.info("### ...Iniciando o serviço EUREKA-SERVER... ###");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
