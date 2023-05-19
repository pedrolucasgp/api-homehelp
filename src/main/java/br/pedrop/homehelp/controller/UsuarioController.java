package br.pedrop.homehelp.controller;

import br.pedrop.homehelp.modelo.Usuario;
import br.pedrop.homehelp.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @GetMapping(path = "/")
    public List<Usuario> listar(){
        return usuarioRepositorio.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Usuario usuario){
        usuarioRepositorio.save(usuario);
    }

    @PutMapping
    public void alterar(@RequestBody Usuario usuario){
        usuarioRepositorio.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        usuarioRepositorio.deleteById(id);
    }
    @GetMapping("/{id}")
    public Optional<Usuario> ler(@PathVariable long id){
        return usuarioRepositorio.findById(id);
    }
}
