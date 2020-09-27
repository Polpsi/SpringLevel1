package Lesson7.repository;

import Lesson7.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<Client,Long> {
}