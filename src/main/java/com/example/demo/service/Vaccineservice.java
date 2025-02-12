package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Vaccine;

public interface Vaccineservice {
	
	public Iterable<Vaccine> fetchdetails(Boolean status,String... properties);
	public List<Vaccine> fetchVaccinebyPagination(int pageNumber,int pageSize,Boolean status,String... properties);
	
	public void fetchVaccinesByPages(int pageSize);

}
