package com.seucxxy.service;

import com.seucxxy.domain.Vip;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface VipService {

    /**
     * 保存
     * @param vip
     * @return
     */
    public boolean save(Vip vip);     //添加新的用户


    /**
     * 修改
     * @param vip
     * @return
     */
    public boolean update(Vip vip);   //修改用户信息


    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(String id);   //删除用户信息

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Vip getById(String id);     //查询名称

    /**
     * 查询所有信息
     * @return
     */
    public List<Vip> getAll();       //查询所有信息
}
