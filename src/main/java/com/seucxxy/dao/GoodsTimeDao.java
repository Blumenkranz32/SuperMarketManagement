package com.seucxxy.dao;

import com.seucxxy.domain.GoodsTime;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsTimeDao {

    @Insert("insert into goods_time values(#{id},#{batch},#{starttime},#{endtime})")
    public int save(GoodsTime goodstims);     //添加新的商品

    @Update("update goods_time set id = #{id}, starttime = #{starttime}, endtime = #{endtime} where batch = #{batch}")
    public int update(GoodsTime goodstims);   //修改商品信息

    @Delete("delete from goods_time where batch = #{batch}")
    public int delete(String batch);   //删除商品信息

    @Select("select * from goods_time where batch = #{batch}")
    public GoodsTime getById(String batch);     //查询商品

    @Select("select * from goods_time")
    public List<GoodsTime> getAll();       //查询所有信息

}
