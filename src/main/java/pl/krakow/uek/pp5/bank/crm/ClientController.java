package pl.krakow.uek.pp5.bank.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/crm/clients")
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @PostMapping("/")
    public String add(@RequestBody ClientData clientData) {

        clientData.setIdentifier(UUID.randomUUID().toString());
        clientRepository.save(clientData);

        return clientData.getIdentifier();
    }

    @GetMapping("/{id}")
    public ClientData get(@PathVariable String id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException());
    }

    @GetMapping("/")
    public Iterable<ClientData> all() {
        return clientRepository.findAll();
    }
}








