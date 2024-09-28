package pe.edu.cibertec.CL1_FiegnClient.client.construidas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.iclientservice.ClientClient;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.model.Client;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {


        private final ClientClient clientClient;

        public List<Client> getAllClients() {
        return clientClient.getClients();
    }

        public Client getClientById(Long id) {
        return clientClient.getClientById(id);
    }

        public Client createClient(Client cliente) {
        return clientClient.createClient(cliente);
    }

        public Client updateClient(Long id, Client cliente) {
        return clientClient.updateClient(id, cliente);
    }


}
