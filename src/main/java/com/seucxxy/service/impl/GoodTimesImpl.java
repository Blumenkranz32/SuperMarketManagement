package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.GoodsTimeDao;
import com.seucxxy.domain.GoodsTime;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.GoodsTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodTimesImpl implements GoodsTimeService {
    @Autowired
    private GoodsTimeDao goodsTimeDao;

    @Override
    public boolean save(GoodsTime goodsTime) {
        return goodsTimeDao.save(goodsTime)>0;
    }

    @Override
    public boolean update(GoodsTime goodsTime) {
        return goodsTimeDao.update(goodsTime)>0;
    }

    @Override
    public boolean delete(String batch) {
        return goodsTimeDao.delete(batch)>0;
    }

    @Override
    public GoodsTime getById(String batch) {
        if(Integer.parseInt(batch)<0){
            throw new BusinessException(Code.BUSSINESS_ERR,"请输入正确的id！");
        }else if(batch == null){
            throw new BusinessException(Code.BUSSINESS_ERR,"请正确操作！");
        }
        return goodsTimeDao.getById(batch);
    }

    @Override
    public List<GoodsTime> getAll() {
        return goodsTimeDao.getAll();
    }
}
