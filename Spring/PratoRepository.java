// src/main/java/com/example/crudspringboot/repository/PratoRepository.java

package com.example.crudspringboot.repository;

import com.example.crudspringboot.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Prato, Long> {
}
