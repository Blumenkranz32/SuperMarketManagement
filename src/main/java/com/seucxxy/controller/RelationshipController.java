package com.seucxxy.controller;
import com.seucxxy.domain.Relationship;
import com.seucxxy.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/relationship")
public class RelationshipController {

    @Autowired
    private RelationshipService relationshipService;

    @PostMapping
    public Result save(@RequestBody Relationship relationship){
        boolean flag = relationshipService.save(relationship);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Relationship relationship){
        boolean flag = relationshipService.update(relationship);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        boolean flag = relationshipService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
        Relationship relationship = relationshipService.getById(id);
        Integer code = relationship !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = relationship != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,relationship,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Relationship> relationshipList = relationshipService.getAll();
        Integer code = relationshipList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = relationshipList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,relationshipList,msg);
    }

}
