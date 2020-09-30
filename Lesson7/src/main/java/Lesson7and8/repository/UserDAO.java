package Lesson7and8.repository;

import Lesson7and8.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long> {
    User findFirstByName(String name);
}
