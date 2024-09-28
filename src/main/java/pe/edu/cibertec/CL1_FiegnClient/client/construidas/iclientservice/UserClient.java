package pe.edu.cibertec.CL1_FiegnClient.client.construidas.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.model.User;

import java.util.List;

@FeignClient(name = "userClient", url = "http://localhost:8080")
public interface UserClient {

    @GetMapping("/users")
    List<User> getUsers();

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);

    @PostMapping("/users")
    User createUser(@RequestBody User usuario);

    @PutMapping("/users/{id}")
    User updateUser(@PathVariable("id") Long id, @RequestBody User usuario);

}
