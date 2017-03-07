package com.domain.sdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.domain.sdemo.model.City;

@Mapper
public interface CityMapper {
	City findCityByID(@Param("cityId") String cityId);

}
