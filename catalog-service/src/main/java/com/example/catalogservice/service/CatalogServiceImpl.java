package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import com.example.catalogservice.jpa.CatlogRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService{

    CatlogRepository catlogRepository;

    @Autowired
    public CatalogServiceImpl(CatlogRepository catlogRepository) {
        this.catlogRepository = catlogRepository;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catlogRepository.findAll();
    }
}
