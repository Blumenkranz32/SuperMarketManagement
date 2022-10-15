package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.VipDao;
import com.seucxxy.domain.Employee;
import com.seucxxy.domain.Vip;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipImpl implements VipService {
    @Autowired
    private VipDao vipDao;

    @Override
    public boolean save(Vip vip) {
        return vipDao.save(vip)>0;
    }

    @Override
    public boolean update(Vip vip) {
        return vipDao.update(vip)>0;
    }

    @Override
    public boolean delete(String id) {
        return vipDao.delete(id)>0;
    }

    @Override
    public Vip getById(String id) {
        if(Integer.parseInt(id)<0){
            throw new BusinessException(Code.BUSSINESS_ERR,"请输入正确的id！");
        }
        return vipDao.getById(id);
    }

    @Override
    public List<Vip> getAll() {
        return vipDao.getAll();
    }
}
