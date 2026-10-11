package com.location.application.LocationMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.location.application.LocationMS.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {

}
