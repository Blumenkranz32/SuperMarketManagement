package com.seucxxy.controller;

import com.seucxxy.domain.Vip;
import com.seucxxy.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vip")
@CrossOrigin
public class VipController {

    @Autowired
    private VipService vipService;

    @PostMapping
    public Result save(@RequestBody Vip vip){
        boolean flag = vipService.save(vip);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Vip vip){
        boolean flag = vipService.update(vip);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        boolean flag = vipService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
        Vip vip = vipService.getById(id);
        Integer code = vip !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = vip != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,vip,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Vip> vipList = vipService.getAll();
        Integer code = vipList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = vipList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,vipList,msg);
    }

}
