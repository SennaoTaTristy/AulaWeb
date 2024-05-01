package com.example.projeto.service;

import com.example.projeto.dtos.DescontoDTO;
import com.example.projeto.models.DescontoModel;
import com.example.projeto.repository.DescontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescontoService {

    @Autowired
    private DescontoRepository descontoRepository;

    public DescontoModel criarDesconto(DescontoDTO descontoDTO) {
        DescontoModel desconto = new DescontoModel();
        desconto.setValor(descontoDTO.getValor());
        desconto.setPorcentagem(descontoDTO.getPorcentagem());
        desconto.setDataExpiracao(descontoDTO.getDataExpiracao());

        return descontoRepository.save(desconto);
    }

    public DescontoModel buscarDescontoPorId(Long id) {
        Optional<DescontoModel> optionalDesconto = descontoRepository.findById(id);
        return optionalDesconto.orElse(null);
    }

    public List<DescontoModel> buscarTodosDescontos() {
        return descontoRepository.findAll();
    }
}
