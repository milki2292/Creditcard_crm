package pl.krakow.uek.pp5.bank.crm;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class ClientData {
    @Id
    private String identifier;

    private String firstname;
    private String lastname;
    private Instant birthDate;

    public ClientData() {
        this.identifier = identifier;
    }

    public ClientData(String identifier, String firstname, String lastname, Instant birthDate) {
        this.identifier = identifier;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }
}
