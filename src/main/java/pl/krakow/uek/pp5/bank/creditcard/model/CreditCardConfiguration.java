



package pl.krakow.uek.pp5.bank.creditcard.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardConfiguration {

    @Bean
    CreditCardFacade thereIsCCApi() {
        return new CreditCardFacade(new InMemoryCreditCardStorage());
    }
}
