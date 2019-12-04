package pl.krakow.uek.pp5.creditcard;

import org.junit.Test;
import pl.krakow.uek.pp5.creditcard.model.CreditCard;

import static org.junit.Assert.assertThat;

public class SqlCreditCardStorageTest {
    @Test
    public void itallowToStoreCC(){
        SqlCreditCardStorage sqlCreditCardStorage = new SqlCreditCardStorage();

        CreditCard creditCard = new CreditCard("1234");
        sqlCreditCardStorage.add(creditCard);

        CreditCard loader = sqlCreditCardStorage.load("1234");

        assertThat(creditCard.getNumber()).isEqualTo(loader.getNumber());
    }

}
