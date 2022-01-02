package account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"account"})
public class CleanArchitectureServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanArchitectureServerApplication.class, args);
    }

}
