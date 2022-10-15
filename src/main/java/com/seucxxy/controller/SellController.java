package com.seucxxy.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.seucxxy.domain.Sell;
import com.seucxxy.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/sell")
@CrossOrigin
public class SellController {

    @Autowired
    private SellService sellService;

    @PostMapping
    public Result save(@RequestBody Sell sell){
        boolean flag = sellService.save(sell);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Sell sell){
        boolean flag = sellService.update(sell);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{whichdate}")
    public Result delete(@PathVariable String whichdate){
        boolean flag = sellService.delete(whichdate);

        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{whichdate}")
    public Result getById(@PathVariable String whichdate){
        Sell sell = sellService.getById(whichdate);
        Integer code = sell !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = sell != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,sell,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Sell> sellList = sellService.getAll();
        Integer code = sellList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = sellList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,sellList,msg);
    }

}
