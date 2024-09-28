package pe.edu.cibertec.CL1_FiegnClient.client.construidas.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.CL1_FiegnClient.client.construidas.iclientservice.UserClient;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.model.User;


import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserClient userClient;

    public List<User> getAllUsers() {
        return userClient.getUsers();
    }

    public User getUserById(Long id) {
        return userClient.getUserById(id);
    }

    public User createUser(User usuario) {
        return userClient.createUser(usuario);
    }

    public User updateUser(Long id, User usuario) {
        return userClient.updateUser(id, usuario);
    }

}
