package com.seucxxy.dao;

import com.seucxxy.domain.Goods;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface GoodsDao {

    @Insert("insert into goods_information values(#{id},#{name},#{price},#{band},#{discount},#{sold})")
    public int save(Goods goods);     //添加新的商品

    @Update("update goods_information set name = #{name}, price = #{price}, band = #{band}, discount = #{discount},sold=#{sold} where id = #{id}")
    public int update(Goods goods);   //修改商品信息

    @Delete("delete from goods_information where id=#{id}")
    public int delete(String id);   //删除商品信息

    @Select("select * from goods_information where id = #{id}")
    public Goods getById(String id);     //查询商品

    @Select("select * from goods_information")
    public List<Goods> getAll();       //查询所有信息

    @Update("update sell_information set income = #{income} where whichdate = #{sdate}")
    public int getSell(@Param("income")double income,@Param("sdate") String sdate);         //获取商品销量

    @Select("select sold from goods_information where id=#{id}")
    public int getSold(String id);

    @Select("select income from sell_information where whichdate=#{sdate}")
    public double getIncome(String sdate);

    @Update("update goods_information set soldnow=0,sold=#{sold} where id=#{id}")
    public int setSold(@Param("id")String id,@Param("sold")int sold);



}
