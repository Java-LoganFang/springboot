package com.example.cache.mapper;

import com.example.cache.Bean.sp_type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface sp_tpeMapper {
    @Select("SELECT * FROM sp_type WHERE type_id = #{id}")
    public sp_type getTypeByid(Integer id);

    @Update("UPDATE sp_type SET type_name=#{type_name},delete_time=#{delete_time} WHERE type_id=#{type_id} ")
    public void updatetype(sp_type sp_type);

    @Insert("INSERT INTO sp_type(type_name) VALUES(#{type_name})")
    public void inseertType(sp_type sp_type);
}
