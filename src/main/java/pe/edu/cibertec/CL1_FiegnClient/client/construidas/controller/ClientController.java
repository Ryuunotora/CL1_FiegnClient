package pe.edu.cibertec.CL1_FiegnClient.client.construidas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.model.Client;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.service.ClientService;


import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/cliente/{id}")
    public Client obtenerClienteXid(@PathVariable("id") Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/cliente")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/cliente")
    public Client crearCliente(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PutMapping("/cliente/{id}")
    public Client actualizarCliente(@PathVariable("id") Long id, @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }
}
