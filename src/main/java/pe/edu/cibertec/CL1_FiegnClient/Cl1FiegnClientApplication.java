package pe.edu.cibertec.CL1_FiegnClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Cl1FiegnClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cl1FiegnClientApplication.class, args);
	}

}
