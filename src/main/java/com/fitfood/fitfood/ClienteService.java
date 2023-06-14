package com.fitfood.fitfood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitfood.fitfood.entity.ClienteEntity;
import com.fitfood.fitfood.repository.ClienteRepository;

@Service
public class ClienteService {

@Autowired
private ClienteRepository repository;


public String cadastrar(ClienteDTO dto){
        ClienteEntity entity = new ClienteEntity();
        entity.setCodigo(dto.getCodigo());
        entity.setEmail(dto.getEmail());
        entity.setNome(dto.getNome());
        entity.setSenha(dto.getSenha());
        entity.setRua(dto.getRua());
        entity.setNumero(dto.getNumero());
        entity.setBairro(dto.getBairro());       
        repository.save(entity);
        return "Cliente cadastrado com sucesso!!";
     }


}