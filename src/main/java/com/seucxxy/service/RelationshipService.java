package com.seucxxy.service;

import com.seucxxy.domain.Relationship;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface RelationshipService {

    /**
     * 保存
     * @param relationship
     * @return
     */
    public boolean save(Relationship relationship);     //添加新的雇员


    /**
     * 修改
     * @param relationship
     * @return
     */
    public boolean update(Relationship relationship);   //修改雇员信息


    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(String id);   //删除雇员信息

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Relationship getById(String id);     //查询名称

    /**
     * 查询所有信息
     * @return
     */
    public List<Relationship> getAll();       //查询所有信息
}
