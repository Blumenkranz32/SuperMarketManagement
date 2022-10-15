package com.seucxxy.service;

import com.seucxxy.domain.Sell;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public interface SellService {

    /**
     * 保存
     * @param sell
     * @return
     */
    public boolean save(Sell sell);     //添加新的记录


    /**
     * 修改
     * @param sell
     * @return
     */
    public boolean update(Sell sell);   //修改记录


    /**
     * 按id删除
     * @param whichdate
     * @return
     */
    public boolean delete(String whichdate);   //删除记录

    /**
     * 按id查询
     * @param whichdate
     * @return
     */
    public Sell getById(String whichdate);     //查询记录

    /**
     * 查询所有信息
     * @return
     */
    public List<Sell> getAll();       //查询所有信息
}
