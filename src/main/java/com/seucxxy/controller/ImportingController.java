package com.seucxxy.controller;

import com.seucxxy.domain.Importing;
import com.seucxxy.service.ImportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/importing")
public class ImportingController {

    @Autowired
    private ImportingService importingService;

    @PostMapping
    public Result save(@RequestBody Importing importing){
        boolean flag = importingService.save(importing);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Importing importing){
        boolean flag = importingService.update(importing);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        boolean flag = importingService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
        Importing importing = importingService.getById(id);
        Integer code = importing !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = importing != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,importing,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Importing> importingList = importingService.getAll();
        Integer code = importingList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = importingList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,importingList,msg);
    }

}
