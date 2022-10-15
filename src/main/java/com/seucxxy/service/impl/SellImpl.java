package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.SellDao;
import com.seucxxy.domain.GoodsTime;
import com.seucxxy.domain.Sell;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.GoodsTimeService;
import com.seucxxy.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SellImpl implements SellService {
    @Autowired
    private SellDao sellDao;

    @Override
    public boolean save(Sell sell) {
        return sellDao.save(sell)>0;
    }

    @Override
    public boolean update(Sell sell) {

        return sellDao.update(sell)>0;
    }

    @Override
    public boolean delete(String whichdate) {
        return sellDao.delete(whichdate)>0;
    }

    @Override
    public Sell getById(String whichdate) {
        return sellDao.getById(whichdate);
    }

    @Override
    public List<Sell> getAll() {
        return sellDao.getAll();
    }
}
