package account.adapter.out.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"account.adapter.out.persistence"})
@EntityScan(basePackages = {"account.adapter.out.persistence"})
@Configuration
public class JpaConfiguration {
}