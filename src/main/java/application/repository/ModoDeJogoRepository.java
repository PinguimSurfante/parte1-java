package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.Model.ModoJogo;

public interface ModoDeJogoRepository extends CrudRepository<ModoJogo, Long> {
    
}
