package com.fantasticdreamstarrysky.springbootmybatis.mapper;

import com.fantasticdreamstarrysky.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 🌃梦幻◎星空🌃
 */
@Mapper
public interface UserMapper {

    @Select("select * from USER where id = #{id} ")
    User findById(Integer id);

}
