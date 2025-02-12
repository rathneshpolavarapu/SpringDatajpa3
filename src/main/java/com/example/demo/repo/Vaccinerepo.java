package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Vaccine;

public interface Vaccinerepo extends PagingAndSortingRepository<Vaccine, Integer> {

}
