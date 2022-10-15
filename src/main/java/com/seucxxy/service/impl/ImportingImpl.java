package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.GoodsDao;
import com.seucxxy.dao.ImportingDao;
import com.seucxxy.domain.Goods;
import com.seucxxy.domain.Importing;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.GoodsService;
import com.seucxxy.service.ImportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportingImpl implements ImportingService {
    @Autowired
    private ImportingDao importingDao;

    @Override
    public boolean save(Importing importing) {
        return importingDao.save(importing)>0;
    }

    @Override
    public boolean update(Importing importing) {
        return importingDao.update(importing)>0;
    }

    @Override
    public boolean delete(String id) {
        return importingDao.delete(id)>0;
    }

    @Override
    public Importing getById(String id) {
        if(Integer.parseInt(id)<0){
            throw new BusinessException(Code.BUSSINESS_ERR,"请输入正确的id！");
        }
        return importingDao.getById(id);
    }

    @Override
    public List<Importing> getAll() {
        return importingDao.getAll();
    }
}
