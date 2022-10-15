package com.seucxxy.service;

import com.seucxxy.domain.GoodsTime;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GoodsTimeService {

    /**
     * 保存
     * @param goodsTime
     * @return
     */
    public boolean save(GoodsTime goodsTime);     //添加新的商品


    /**
     * 修改
     * @param goodsTime
     * @return
     */
    public boolean update(GoodsTime goodsTime);   //修改商品信息


    /**
     * 按id删除
     * @param batch
     * @return
     */
    public boolean delete(String batch);   //删除商品信息

    /**
     * 按id查询
     * @param id
     * @return
     */
    public GoodsTime getById(String id);     //查询商品

    /**
     * 查询所有信息
     * @return
     */
    public List<GoodsTime> getAll();       //查询所有信息
}
