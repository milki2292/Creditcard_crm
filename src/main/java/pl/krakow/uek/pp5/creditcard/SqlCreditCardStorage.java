package pl.krakow.uek.pp5.creditcard;

import pl.krakow.uek.pp5.creditcard.model.CreditCard;
import pl.krakow.uek.pp5.creditcard.model.CreditCardStorage;

import java.util.List;

public class SqlCreditCardStorage implements CreditCardStorage {

    @Override
    public void add(CreditCard cc) {

    }

    @Override
    public CreditCard load(String creditCardNumber) {
        return null;
    }

    @Override
    public List<CreditCard> all() {
        return null;
    }
}
