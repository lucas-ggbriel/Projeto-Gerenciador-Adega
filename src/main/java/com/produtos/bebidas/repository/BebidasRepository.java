package com.produtos.bebidas.repository;

import com.produtos.bebidas.model.Bebidas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BebidasRepository extends MongoRepository<Bebidas, String> {

}
