package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.GoodsDao;
import com.seucxxy.domain.Employee;
import com.seucxxy.domain.Goods;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.EmployeeService;
import com.seucxxy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public boolean save(Goods goods) {
        return goodsDao.save(goods)>0;
    }

    @Override
    public boolean update(Goods goods) {
        return goodsDao.update(goods)>0;
    }

    @Override
    public boolean delete(String id) {
        return goodsDao.delete(id)>0;
    }

    @Override
    public Goods getById(String id) {
        if(Integer.parseInt(id)<0){
            throw new BusinessException(Code.BUSSINESS_ERR,"请输入正确的id！");
        }
        return goodsDao.getById(id);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public boolean getSell(double income,String sdate){
        return goodsDao.getSell(income,sdate)>0;
    }

    @Override
    public int getSold(String id) {
        return goodsDao.getSold(id);
    }

    @Override
    public double getIncome(String sdate) {
        return  goodsDao.getIncome(sdate);
    }

    @Override
    public int setSold(String id,int sold) {
        return goodsDao.setSold(id,sold);
    }
}
