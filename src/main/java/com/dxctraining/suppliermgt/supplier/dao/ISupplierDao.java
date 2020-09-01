package com.dxctraining.suppliermgt.supplier.dao;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface ISupplierDao<Supplier> extends MongoRepository<Supplier, String> {	
	
List<Supplier> findByName(String name);
}