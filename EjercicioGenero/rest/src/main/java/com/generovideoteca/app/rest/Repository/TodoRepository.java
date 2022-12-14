package com.generovideoteca.app.rest.Repository;

import com.generovideoteca.app.rest.Model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Genero, Long> {
}
