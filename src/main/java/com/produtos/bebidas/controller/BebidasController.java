package com.produtos.bebidas.controller;

import com.produtos.bebidas.model.Bebidas;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.produtos.bebidas.repository.BebidasRepository;

import java.util.List;

@RestController
@RequestMapping("/bebidas")
public class BebidasController {

    @Autowired
    BebidasRepository bebidasRepository;

    @GetMapping
    public ResponseEntity<List<Bebidas>> listar(){
        return ResponseEntity.ok(bebidasRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Bebidas> cadastrar(@RequestBody Bebidas bebida){
        return ResponseEntity.status(HttpStatus.CREATED).body(bebidasRepository.save(bebida));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){
        bebidasRepository.deleteById(id);
    }

    @DeleteMapping("/tudo")
    public void deletarTudo(){
        bebidasRepository.deleteAll();
    }

}
