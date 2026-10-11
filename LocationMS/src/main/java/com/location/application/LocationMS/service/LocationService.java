package com.location.application.LocationMS.service;

import java.util.List;

import com.location.application.LocationMS.model.LocationDto;

public interface LocationService {

	LocationDto getLocationById(String id);

	LocationDto saveLocation(LocationDto locationDto);

	List<LocationDto> getAllLocations();

}
