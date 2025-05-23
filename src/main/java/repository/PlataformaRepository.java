package repository;

import org.springframework.data.repository.CrudRepository;

import application.Model.Plataforma;

public interface PlataformaRepository extends CrudRepository<Plataforma, Long> {
    
}
