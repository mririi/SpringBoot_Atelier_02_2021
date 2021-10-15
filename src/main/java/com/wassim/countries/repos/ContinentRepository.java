package com.wassim.countries.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wassim.countries.entities.Continent;

public interface ContinentRepository extends JpaRepository<Continent, Long> {

}