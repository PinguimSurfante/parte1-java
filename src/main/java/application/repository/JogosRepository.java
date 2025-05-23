package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.Model.Jogo;

public interface JogosRepository extends CrudRepository<Jogo, Long> {
    
}
