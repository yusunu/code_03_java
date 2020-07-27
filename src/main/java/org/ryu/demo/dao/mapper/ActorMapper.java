package org.ryu.demo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.ryu.demo.dao.dto.Actor;

@Mapper
public interface ActorMapper {

	List<Actor> findAll();

	@Select("select * from user where id = #{id}")
	Actor findById(@Param("id") Short id);
}