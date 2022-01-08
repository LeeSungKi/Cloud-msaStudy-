package com.example.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface CatlogRepository extends CrudRepository<CatalogEntity,Long> {
    CatalogEntity findByProductId(String productId);
}
