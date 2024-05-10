package br.com.mateus.lojalivro.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mateus.lojalivro.Model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Integer> {

}