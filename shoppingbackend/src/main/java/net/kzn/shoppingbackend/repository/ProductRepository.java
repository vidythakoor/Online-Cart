package net.kzn.shoppingbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dto.Product;

/*  product*/ 
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query("SELECT DISTINCT p.brand  FROM Product p")
    public List<String> getName();
}
