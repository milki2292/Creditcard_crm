package pl.krakow.uek.pp5.creditcard.e2e;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import pl.krakow.uek.pp5.creditcard.model.CreditCardFacade;
import pl.krakow.uek.pp5.creditcard.model.dto.CardBlanceDto;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class Foo {

    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    CreditCardFacade creditCardFacade;

    @LocalServerPort
    private int port;

    @Test
    public void itListCardBalances(){
        String URI = "/api/cards/balances";
        String url = String.format("http://localhost:%s/%s", port, URI);

        ResponseEntity re = restTemplate.getForEntity(url, CardBlanceDto[].class);
        assertThat(re.getStatusCode()).isEqualTo(HttpStatus.OK);


    }
}
