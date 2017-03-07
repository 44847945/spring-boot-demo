package com.domain.sdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.domain.sdemo.model.City;

@Mapper
public interface CityMapper {
		@Select("select city_id as cityID,city_name as cityName from city where city_id=#{cityId} limit 1 ")
		City findCityByID(String cityId);
	
}
