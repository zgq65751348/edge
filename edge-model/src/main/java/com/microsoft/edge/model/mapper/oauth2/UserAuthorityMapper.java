package com.microsoft.edge.model.mapper.oauth2;

import com.microsoft.edge.model.example.oauth2.UserAuthority;
import com.microsoft.edge.model.example.oauth2.UserAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserAuthorityMapper {
    long countByExample(UserAuthorityExample example);

    int deleteByExample(UserAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAuthority record);

    int insertSelective(UserAuthority record);

    List<UserAuthority> selectByExample(UserAuthorityExample example);

    UserAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);

    int updateByExample(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);

    int updateByPrimaryKeySelective(UserAuthority record);

    int updateByPrimaryKey(UserAuthority record);
}