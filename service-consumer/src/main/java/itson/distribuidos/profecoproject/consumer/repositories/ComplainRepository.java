package itson.distribuidos.profecoproject.consumer.repositories;

import itson.distribuidos.profecoproject.consumer.entities.Complain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplainRepository extends JpaRepository<Complain, Long> {
    public List<Complain> findAll();
}
