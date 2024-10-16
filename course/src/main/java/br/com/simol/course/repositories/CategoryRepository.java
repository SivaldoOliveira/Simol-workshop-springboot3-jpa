package br.com.simol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simol.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
