package pe.edu.cibertec.CL1_FiegnClient.client.construidas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.model.User;
import pe.edu.cibertec.CL1_FiegnClient.client.construidas.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/usuario/{id}")
    public User obtenerUsuarioXid(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/usuario")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/usuario")
    public User crearUsuario(@RequestBody User usuario) {
        return userService.createUser(usuario);
    }

    @PutMapping("/usuario/{id}")
    public User actualizarUsuario(@PathVariable("id") Long id, @RequestBody User usuario) {
        return userService.updateUser(id, usuario);
    }


}
