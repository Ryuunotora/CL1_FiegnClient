package pe.edu.cibertec.CL1_FiegnClient.client.construidas.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.model.Client;

import java.util.List;

@FeignClient(name = "clientClient", url = "http://localhost:8080")
public interface ClientClient {

    @GetMapping("/clients")
    List<Client> getClients();

    @GetMapping("/clients/{id}")
    Client getClientById(@PathVariable("id") Long id);

    @PostMapping("/clients")
    Client createClient(@RequestBody Client cliente);

    @PutMapping("/clients/{id}")
    Client updateClient(@PathVariable("id") Long id, @RequestBody Client cliente);

}
