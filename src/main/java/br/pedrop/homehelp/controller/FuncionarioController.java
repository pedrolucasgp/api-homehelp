package br.pedrop.homehelp.controller;

import br.pedrop.homehelp.modelo.Funcionario;
import br.pedrop.homehelp.modelo.Usuario;
import br.pedrop.homehelp.repositorio.FuncionarioRepositorio;
import br.pedrop.homehelp.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;
    @GetMapping(path = "/")
    public List<Funcionario> listar(){
        return funcionarioRepositorio.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Funcionario funcionario){ funcionarioRepositorio.save(funcionario); }

    @PutMapping
    public void alterar(@RequestBody Funcionario funcionario){
        funcionarioRepositorio.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        funcionarioRepositorio.deleteById(id);
    }
    @GetMapping("/{id}")
    public Optional<Funcionario> ler(@PathVariable long id){
        return funcionarioRepositorio.findById(id);
    }
}
