package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellidos("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }
    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios=new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Lucas");
        usuario.setApellidos("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        usuarios.add(usuario);

        usuario=new Usuario();
        usuario.setId(2L);
        usuario.setNombre("Lucas2");
        usuario.setApellidos("Moy2");
        usuario.setEmail("lucasmoy2@hotmail.com");
        usuario.setTelefono("12");
        usuarios.add(usuario);

        usuario=new Usuario();
        usuario.setId(3L);
        usuario.setNombre("Lucas3");
        usuario.setApellidos("Moy3");
        usuario.setEmail("lucasmoy3@hotmail.com");
        usuario.setTelefono("23");
        usuarios.add(usuario);

        return usuarios;
    }
}
