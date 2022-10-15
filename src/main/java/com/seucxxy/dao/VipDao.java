package com.seucxxy.dao;

import com.seucxxy.domain.Vip;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface VipDao {

    @Insert("insert into vip_information values(#{name},#{phone},#{cardid})")
    public int save(Vip vip);     //添加新的客户

   @Update("update vip_information set name = #{name}, phone = #{phone} where cardid = #{cardid}")
   public int update(Vip vip);   //修改客户信息

    @Delete("delete from vip_information where cardid = #{cardid}")
    public int delete(String cardid);   //删除雇员信息

    @Select("select * from vip_information where cardid = #{cardid}")
    public Vip getById(String carfid);     //查询名称

    @Select("select * from vip_information")
    public List<Vip> getAll();       //查询所有信息

}
