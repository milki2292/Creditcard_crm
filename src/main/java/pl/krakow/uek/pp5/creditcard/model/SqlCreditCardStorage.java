package pl.krakow.uek.pp5.creditcard;

import org.springframework.jdbc.core.JdbcTemplate;
import pl.krakow.uek.pp5.creditcard.model.CreditCard;
import pl.krakow.uek.pp5.creditcard.model.CreditCardStorage;

import java.util.List;

public class SqlCreditCardStorage implements CreditCardStorage {


    private final JdbcTemplate jdbcTemplate;

    public SqlCreditCardStorage(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public void add(CreditCard cc) {
        jdbcTemplate.update(
                "INSERT INTO `cards` (`number`, `limit`, `balance`)" + "VALUES " + "(?,?,?)", cc.getNumber(), cc.getLimit(), cc.getCurrentBalance()
        );
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
