package com.jobplatform.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jobplatform.project.entity.Project;

@Mapper
@Repository
public interface ProjectMapper {

	public List<Project> select( @Param("projectKeyWord")String projectKeyWord, @Param("userId")String userId);

}
