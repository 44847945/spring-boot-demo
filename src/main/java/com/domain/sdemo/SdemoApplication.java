package com.domain.sdemo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.sdemo.dao.CityMapper;
import com.domain.sdemo.model.City;




@SpringBootApplication
public class SdemoApplication implements CommandLineRunner{
	@Autowired
	private CityMapper cityMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(SdemoApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		City city = cityMapper.findCityByID("2");
        Logger.getInstance(this.getClass()).info(city.getCityName());
    }
}
