package br.com.simol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simol.course.entities.Category;
import br.com.simol.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
