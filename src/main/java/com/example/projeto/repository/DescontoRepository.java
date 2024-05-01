package com.example.projeto.repositories;

import com.example.projeto.models.DescontoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DescontoRepository extends JpaRepository<DescontoModel, Long> {
    List<DescontoModel> findByValor(Double valor);
    List<DescontoModel> findByPorcentagem(Double porcentagem);
    List<DescontoModel> findByDataExpiracaoBefore(Date dataExpiracao);
    List<DescontoModel> findByDataExpiracaoAfter(Date dataExpiracao);
    List<DescontoModel> findByDataExpiracaoBetween(Date dataInicio, Date dataFim);
}
