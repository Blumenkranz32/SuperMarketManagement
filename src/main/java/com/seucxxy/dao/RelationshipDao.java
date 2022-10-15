package com.seucxxy.dao;

import com.seucxxy.domain.Relationship;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface RelationshipDao {

    @Insert("insert into relationship_information values(#{id},#{name},#{department},#{leader},#{salary})")
    public int save(Relationship relationship);     //添加新的雇员

    @Update("update relationship_information set name = #{name}, department = #{department}, leader = #{leader}, salary = #{salary} where id = #{id}")
    public int update(Relationship relationship);   //修改雇员信息

    @Delete("delete from relationship_information where id=#{id}")
    public int delete(String id);   //删除雇员信息

    @Select("select * from relationship_information where id = #{id}")
    public Relationship getById(String id);     //查询名称

    @Select("select * from relationship_information")
    public List<Relationship> getAll();       //查询所有信息

}
