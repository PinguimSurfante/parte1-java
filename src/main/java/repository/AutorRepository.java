package repository;

import org.springframework.data.repository.CrudRepository;

import application.Model.Genero;

public interface AutorRepository extends CrudRepository<Genero, Long> {
    
}
