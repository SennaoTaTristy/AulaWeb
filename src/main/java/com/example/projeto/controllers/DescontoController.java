package com.example.projeto.controllers;

import com.example.projeto.dtos.DescontoDTO;
import com.example.projeto.models.DescontoModel;
import com.example.projeto.service.DescontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/descontos")
public class DescontoController {

    @Autowired
    private DescontoService descontoService;

    @PostMapping
    public ResponseEntity<DescontoModel> criarDesconto(@RequestBody DescontoDTO descontoDTO) {
        DescontoModel novoDesconto = descontoService.criarDesconto(descontoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoDesconto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DescontoModel> buscarDescontoPorId(@PathVariable Long id) {
        DescontoModel desconto = descontoService.buscarDescontoPorId(id);
        if (desconto != null) {
            return ResponseEntity.ok(desconto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<DescontoModel>> buscarTodosDescontos() {
        List<DescontoModel> descontos = descontoService.buscarTodosDescontos();
        return ResponseEntity.ok(descontos);
    }


}