package br.pedrop.homehelp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFuncionario;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank
    private String cidade;
    @NotNull
    private float valor ;
    @NotBlank
    private String telefone;
    @NotBlank
    private String areaDesejada;
    @NotNull
    private long cpf;
    @NotBlank
    private String descricao;

}
