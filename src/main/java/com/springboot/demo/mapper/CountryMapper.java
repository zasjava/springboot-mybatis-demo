package com.springboot.demo.mapper;

import com.springboot.demo.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CountryMapper
 * @Description TODO
 * @Author zhaoasong
 * @Date 2020-2-26 17:37
 **/
@Mapper
public interface CountryMapper {
	List<Country> selectAll();
}
