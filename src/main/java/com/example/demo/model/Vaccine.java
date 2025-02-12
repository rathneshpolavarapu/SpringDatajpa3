package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String vaccine;
    private String Vaccinecompany;
	private Double cost;
	
	public Vaccine() {
		super();
	}

	public Vaccine(String vaccine, String vaccinecompany, Double cost) {
		super();
		
		this.vaccine = vaccine;
		Vaccinecompany = vaccinecompany;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccine=" + vaccine + ", Vaccinecompany=" + Vaccinecompany + ", cost=" + cost
				+ "]";
	}

	
	

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getVaccinecompany() {
		return Vaccinecompany;
	}

	public void setVaccinecompany(String vaccinecompany) {
		Vaccinecompany = vaccinecompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	
	
}
