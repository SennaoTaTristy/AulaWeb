package com.example.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.projeto.models.OfertaModel;

@Repository
public interface OfertaRepository extends JpaRepository<OfertaModel, Long> {

    @Query("SELECT o FROM OfertaModel o WHERE o.desconto IS NOT NULL")
    List<OfertaModel> findAllWithDesconto();
}
