package com.seucxxy.dao;

import com.seucxxy.domain.Importing;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ImportingDao {

    @Insert("insert into import_information values(#{id},#{name},#{price},#{band},#{importtime})")
    public int save(Importing importing);     //添加新的商品

    @Update("update import_information set name = #{name}, price = #{price}, band = #{band}, importtime = #{importtime} where id = #{id}")
    public int update(Importing importing);   //修改商品信息

    @Delete("delete from import_information where id=#{id}")
    public int delete(String id);   //删除商品信息

    @Select("select * from import_information where id = #{id}")
    public Importing getById(String id);     //查询商品

    @Select("select * from import_information")
    public List<Importing> getAll();       //查询所有信息

}
