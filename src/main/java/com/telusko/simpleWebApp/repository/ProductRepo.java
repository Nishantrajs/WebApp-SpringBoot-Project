package com.telusko.simpleWebApp.repository;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>
{
   /* http://localhost:8080/h2-console for accessing H2 Database*/
}
