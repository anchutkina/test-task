package com.anchutkina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CurrencyRepository
        extends JpaRepository<Currency, Integer> {

}
