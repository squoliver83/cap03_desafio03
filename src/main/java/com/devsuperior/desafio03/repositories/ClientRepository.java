package com.devsuperior.desafio03.repositories;

import com.devsuperior.desafio03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
