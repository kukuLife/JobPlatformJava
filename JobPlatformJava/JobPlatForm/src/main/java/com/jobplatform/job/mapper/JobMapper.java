package com.jobplatform.job.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jobplatform.job.entity.Job;

@Mapper
@Repository
public interface JobMapper {

	public List<Job> select( @Param("jobKeyWord")String jobKeyWord);

}
