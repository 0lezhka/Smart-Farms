package com.softserve.farmservice.repository;

import com.softserve.farmservice.entity.GreenHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenHouseRepository extends JpaRepository<GreenHouse, Long> {
}
