package org.ulrich.test.springboot.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ulrich.test.springboot.app.models.Banco;

import java.util.List;

public interface BancoRepository extends JpaRepository<Banco, Long> {
    //Banco findById(Long id);
    //List<Banco> findAll();
    //void update (Banco banco);
}
