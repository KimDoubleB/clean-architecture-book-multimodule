package account.application.config;

import account.application.service.MoneyTransferProperties;
import account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BuckPalConfigurationProperties.class)
public class BuckPalConfiguration {

  /**
   * Adds a use-case-specific {@link MoneyTransferProperties} object to the application context. The properties
   * are read from the Spring-Boot-specific {@link BuckPalConfigurationProperties} object.
   */
  @Bean
  public MoneyTransferProperties moneyTransferProperties(BuckPalConfigurationProperties buckPalConfigurationProperties){
    return new MoneyTransferProperties(Money.of(buckPalConfigurationProperties.getTransferThreshold()));
  }

}
