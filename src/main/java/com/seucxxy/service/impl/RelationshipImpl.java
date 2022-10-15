package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.RelationshipDao;
import com.seucxxy.domain.Relationship;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipImpl implements RelationshipService {
    @Autowired
    private RelationshipDao relationshipDao;

    @Override
    public boolean save(Relationship relationship) {
        return relationshipDao.save(relationship)>0;
    }

    @Override
    public boolean update(Relationship relationship) {
        return relationshipDao.update(relationship)>0;
    }

    @Override
    public boolean delete(String id) {
        return relationshipDao.delete(id)>0;
    }

    @Override
    public Relationship getById(String id) {
        if(Integer.parseInt(id)<0){
            throw new BusinessException(Code.BUSSINESS_ERR,"请输入正确的id！");
        }
        return relationshipDao.getById(id);
    }

    @Override
    public List<Relationship> getAll() {
        return relationshipDao.getAll();
    }
}
