package com.fitfood.fitfood;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;
    private String rua;
    private int numero;
    private String bairro;
}
