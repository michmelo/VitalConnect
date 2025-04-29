package com.VitalConnect.VitalConnect.Repository;

import com.VitalConnect.VitalConnect.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UsuarioRepository {

    // Arreglo para guardar usuarios
    private List<Usuario> listaUsuarios = new ArrayList<>();

    // Metodo que retorna los usuarios
    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    // Metodo que busca usuario por id
    public Usuario buscarUsuarioId(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;

    }

    // Metodo que busca usuario por especialidad
    public Usuario buscarUsuarioEspecialidad(String especialidad) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEspecialidad().equals(especialidad)) {
                return usuario;
            }
        }

        return null;

    }

    // Metodo para guardar
    public Usuario guardarUsuario(Usuario usu) {
        listaUsuarios.add(usu);
        return usu;
    }

    // Metodo para actualizar usuario
    public Usuario actualizarUsuario(Usuario usu) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i<listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getId() == usu.getId()) {
                id = usu.getId();
                idPosicion = i;
            }
        }

        Usuario usuario1 = new Usuario();
        usuario1.setId(id);
        usuario1.setNombre(usu.getNombre());
        usuario1.setApPaterno(usu.getApPaterno());
        usuario1.setApMaterno(usu.getApMaterno());
        usuario1.setEmail(usu.getEmail());
        usuario1.setPassword(usu.getPassword());
        usuario1.setRol(usu.getRol());
        usuario1.setEspecialidad(usu.getEspecialidad());

        listaUsuarios.set(idPosicion, usuario1);
        return usuario1;
    }

    // Metodo para eliminar usuario por id
    public void eliminarUsuario(int id) {
        Usuario usuario = buscarUsuarioId(id);
        if (usuario != null) {
            listaUsuarios.remove(usuario);
        }
    }



}
