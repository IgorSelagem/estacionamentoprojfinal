package br.com.igormendes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormendes.model.Car;
import br.com.igormendes.repository.CarsRepository;

@Service
public class CarsService {
	@Autowired
	private CarsRepository carsRepository;
	
	public Car insertOrUpdate(Car cars) {
		return carsRepository.save(cars);
	}
	
	public List<Car> findAll(){
		List<Car> cars = new ArrayList<>();
		carsRepository.findAll().forEach(cars::add);
		return cars;
	}
	
	public  Optional<Car> findOne(int id){
		return carsRepository.findById(id);
	}
	
	public void remove(int id) {
		carsRepository.deleteById(id);
	}
}