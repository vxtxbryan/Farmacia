package com.example.generation.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.generation.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);

	public List <Produto> findAllByPrecoContainingIgnoreCase(BigDecimal inicio, BigDecimal fim);

	public Object findByNomeOrLaboratorio(String nome, String laboratorio);

	public Object buscarProdutosEntre(BigDecimal inicio, BigDecimal fim);
}
