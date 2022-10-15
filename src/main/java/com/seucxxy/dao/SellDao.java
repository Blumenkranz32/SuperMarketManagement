package com.seucxxy.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.seucxxy.domain.Sell;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SellDao {

    @Insert("insert into sell_information values(#{whichdate},#{income},#{remarks})")
    public int save(Sell sell);     //添加新的销售记录

    @Update("update sell_information set income = #{income}, remarks = #{remarks} where whichdate = #{whichdate}")
    public int update(Sell sell);   //修改销售记录

    @Delete("delete from sell_information where whichdate = #{whichdate}")
    public int delete(String whichdate);   //删除销售记录

    @Select("select * from sell_information where whichdate = #{whichdate}")
    public Sell getById(String whichdate);     //查询销售记录

    @Select("select * from sell_information")
    public List<Sell> getAll();       //查询所有销售记录

}
