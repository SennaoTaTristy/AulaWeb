package com.example.projeto.mapper;

import com.example.projeto.dtos.OfertaDTOResposta;
import com.example.projeto.models.OfertaModel;

public class OfertaMapper {

    public OfertaModel toOfertaModel(OfertaDTOResposta ofertaDTOResposta) {
        OfertaModel ofertaModel = new OfertaModel();
        ofertaModel.setId(ofertaDTOResposta.getId());
        ofertaModel.setValor(ofertaDTOResposta.getValor());
        return ofertaModel;
    }

    public OfertaDTOResposta toOfertaDTOResposta(OfertaModel ofertaModel) {
        OfertaDTOResposta ofertaDTOResposta = new OfertaDTOResposta();
        ofertaDTOResposta.setId(ofertaModel.getId());
        ofertaDTOResposta.setValor(ofertaModel.getValor());
        return ofertaDTOResposta;
    }
}
