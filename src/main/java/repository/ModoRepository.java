package repository;

import org.springframework.data.repository.CrudRepository;

import application.Model.ModoJogo;

public interface ModoRepository extends CrudRepository<ModoJogo, Long> {
    
}
