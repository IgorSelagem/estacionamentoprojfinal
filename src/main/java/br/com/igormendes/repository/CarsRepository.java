package br.com.igormendes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.igormendes.model.Car;

@Repository
public interface CarsRepository extends CrudRepository<Car, Integer>{
		
	}
