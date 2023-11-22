// src/main/java/com/example/crudspringboot/controller/PratoController.java

package com.example.crudspringboot.controller;

import com.example.crudspringboot.model.Prato;
import com.example.crudspringboot.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pratos")
public class PratoController {

    @Autowired
    private PratoRepository pratoRepository;

    @GetMapping
    public List<Prato> listarPratos() {
        return pratoRepository.findAll();
    }

    @PostMapping
    public Prato criarPrato(@RequestBody Prato prato) {
        return pratoRepository.save(prato);
    }

    // Adicione métodos para atualização e remoção se necessário
}
