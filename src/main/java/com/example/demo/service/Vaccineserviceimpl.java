package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vaccine;
import com.example.demo.repo.Vaccinerepo;

@Service
public class Vaccineserviceimpl implements Vaccineservice {

	@Autowired
	private Vaccinerepo repo;

	@Override
	public Iterable<Vaccine> fetchdetails(Boolean status, String... properties) {
		// TODO Auto-generated method stub
		
	Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
		
	}

	@Override
	public List<Vaccine> fetchVaccinebyPagination(int pageNumber, int pageSize, Boolean status, String... properties) {
		
		PageRequest Pagable = PageRequest.of(pageNumber, pageSize, status?Direction.ASC:Direction.DESC, properties);
		
		Page<Vaccine> page = repo.findAll(Pagable);
		
		return page.getContent();
	}

	@Override
	public void fetchVaccinesByPages(int pageSize) {
		// TODO Auto-generated method stub
		long count=6l;
		long pageCount=count/pageSize;
		pageCount=count%pageSize==0?pageCount:pageCount++;
		
		for(int i=0;i<pageCount;i++) {
			
			PageRequest Pageble = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(Pageble);
			System.out.println("Page number ---"+i);
			page.getContent().forEach(v->System.out.print(v));
			
		}
		
	}
	

	

}
