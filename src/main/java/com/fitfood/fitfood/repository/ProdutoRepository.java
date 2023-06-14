package com.fitfood.fitfood.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.fitfood.fitfood.entity.ProdutoEntity;

public interface ProdutoRepository extends 
JpaRepository<ProdutoEntity,Integer>,
JpaSpecificationExecutor<ProdutoEntity>{
Optional<ProdutoEntity> findByCodigo(int codigo);






}


