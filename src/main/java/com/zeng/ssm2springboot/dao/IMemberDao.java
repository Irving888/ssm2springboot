package com.zeng.ssm2springboot.dao;

import com.zeng.ssm2springboot.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IMemberDao {
    @Select("select * from member where id = #{id}")
    public Member findById(String id);
}
