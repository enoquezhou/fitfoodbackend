package com.fitfood.fitfood.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

@Table(name ="produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String tituloGeral;
    private String descricao;
    private String ingredientes;
    private String descricaoIngredientes;
    private String tituloIngrediente2;
    private String descricaoIngrediente2;
    private double preco;
    private double peso;
}
