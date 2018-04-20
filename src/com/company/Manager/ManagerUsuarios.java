package com.company.Manager;

import com.company.Model.Usuario;


public class ManagerUsuarios {
    Usuario[] usuarios = new Usuario[100];

    public void crearUsuario(String username, String password) {
        Usuario usuario = new Usuario();
        usuario.nickname = username;
        usuario.password = password;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                break;
            }
        }
    }

    public boolean verificar(String username, String password){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i].nickname.equals(username) && usuarios[i].password.equals(password)){
                return true;
            }
        }

        return false;
    }
}
