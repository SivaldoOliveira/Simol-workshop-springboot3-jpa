package br.com.simol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simol.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
