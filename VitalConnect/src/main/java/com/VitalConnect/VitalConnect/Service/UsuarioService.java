package com.VitalConnect.VitalConnect.Service;


import com.VitalConnect.VitalConnect.Model.Usuario;
import com.VitalConnect.VitalConnect.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios(){
        return usuarioRepository.obtenerUsuarios();
    }

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.guardarUsuario(usuario);
    }

    public Usuario getUsuarioId (int id) {
        return usuarioRepository.buscarUsuarioId(id);
    }

    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.actualizarUsuario(usuario);
    }

    public String deleteUsuario(int id){
        usuarioRepository.eliminarUsuario(id);
        return "Usuario eliminado con exito";
    }

}
