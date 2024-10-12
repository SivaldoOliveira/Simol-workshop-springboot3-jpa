package br.com.simol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simol.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
