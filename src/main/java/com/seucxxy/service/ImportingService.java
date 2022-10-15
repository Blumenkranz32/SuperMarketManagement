package com.seucxxy.service;

import com.seucxxy.domain.Goods;
import com.seucxxy.domain.Importing;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ImportingService {

    /**
     * 保存
     * @param importing
     * @return
     */
    public boolean save(Importing importing);     //添加新的订单


    /**
     * 修改
     * @param importing
     * @return
     */
    public boolean update(Importing importing);   //修改订单信息


    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(String id);   //删除订单信息

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Importing getById(String id);     //查询订单

    /**
     * 查询所有信息
     * @return
     */
    public List<Importing> getAll();       //查询所有信息
}
