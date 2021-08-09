package com.microsoft.edge.model.mapper.oauth2;

import com.microsoft.edge.model.example.oauth2.SubAuthority;
import com.microsoft.edge.model.example.oauth2.SubAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubAuthorityMapper {
    long countByExample(SubAuthorityExample example);

    int deleteByExample(SubAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubAuthority record);

    int insertSelective(SubAuthority record);

    List<SubAuthority> selectByExample(SubAuthorityExample example);

    SubAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubAuthority record, @Param("example") SubAuthorityExample example);

    int updateByExample(@Param("record") SubAuthority record, @Param("example") SubAuthorityExample example);

    int updateByPrimaryKeySelective(SubAuthority record);

    int updateByPrimaryKey(SubAuthority record);
}