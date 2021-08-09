package com.microsoft.edge.model.mapper.oauth2;

import com.microsoft.edge.model.example.oauth2.Sub2Authority;
import com.microsoft.edge.model.example.oauth2.Sub2AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Sub2AuthorityMapper {
    long countByExample(Sub2AuthorityExample example);

    int deleteByExample(Sub2AuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sub2Authority record);

    int insertSelective(Sub2Authority record);

    List<Sub2Authority> selectByExample(Sub2AuthorityExample example);

    Sub2Authority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sub2Authority record, @Param("example") Sub2AuthorityExample example);

    int updateByExample(@Param("record") Sub2Authority record, @Param("example") Sub2AuthorityExample example);

    int updateByPrimaryKeySelective(Sub2Authority record);

    int updateByPrimaryKey(Sub2Authority record);
}