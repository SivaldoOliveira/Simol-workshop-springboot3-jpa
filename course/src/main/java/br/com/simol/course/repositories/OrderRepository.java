package br.com.simol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simol.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
