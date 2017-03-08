package com.domain.sdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.domain.sdemo.model.User;

@Mapper
public interface UserMapper {
	User checkUserLogin(@Param("userId") String userId, @Param("userPassword") String userPassword);
}
