/**
 * 
 */
package com.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.entity.Product;

/**
 * @author Aqeel
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

}
