package com.seucxxy.service;

import com.seucxxy.domain.Goods;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GoodsService {

    /**
     * 保存
     * @param goods
     * @return
     */
    public boolean save(Goods goods);     //添加新的商品


    /**
     * 修改
     * @param goods
     * @return
     */
    public boolean update(Goods goods);   //修改商品信息


    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(String id);   //删除商品信息

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Goods getById(String id);     //查询商品

    /**
     * 查询所有信息
     * @return
     */
    public List<Goods> getAll();       //查询所有信息

    /**
     *
     * @param
     */
    public boolean getSell(double income,String date);

    /**
     *
     * @param id
     * @return
     */
    public int getSold(String id);

    /**
     *
     * @param sdate
     * @return
     */
    public double getIncome(String sdate);

    /**
     *
     * @param id
     * @return
     */
    public int setSold(String id,int sold);


}
