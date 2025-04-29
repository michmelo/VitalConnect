package com.VitalConnect.VitalConnect.Controller;


import com.VitalConnect.VitalConnect.Model.Usuario;
import com.VitalConnect.VitalConnect.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listaUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public Usuario agregarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("{id")
    public Usuario buscarUsuario(@PathVariable int id) {
        return usuarioService.getUsuarioId(id);
    }

    @PutMapping("{id")
    public Usuario actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("{id")
    public String eliminarUsuario(@PathVariable int id) {
        return usuarioService.deleteUsuario(id);
    }
}
