package com.fitfood.fitfood.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.fitfood.fitfood.entity.ClienteEntity;

public interface ClienteRepository extends 
JpaRepository<ClienteEntity,Integer>,
JpaSpecificationExecutor<ClienteEntity>{
    @Query(value = "select * from cliente where email=?1 and senha=md5(?2) ", nativeQuery = true)
    Optional<ClienteEntity> fazerLogin(String email, String senha);

}
