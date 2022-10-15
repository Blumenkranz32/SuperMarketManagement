package com.seucxxy.controller;

import com.seucxxy.domain.Goods;
import com.seucxxy.domain.GoodsTime;
import com.seucxxy.domain.Vip;
import com.seucxxy.service.GoodsTimeService;
import com.seucxxy.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/goodsTime")
public class GoodsTimeController {

    @Autowired
    private GoodsTimeService goodsTimeService;

    @PostMapping
    public Result save(@RequestBody GoodsTime goodsTime){
        boolean flag = goodsTimeService.save(goodsTime);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody GoodsTime goodsTime){
        boolean flag = goodsTimeService.update(goodsTime);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{batch}")
    public Result delete(@PathVariable String batch){
        boolean flag = goodsTimeService.delete(batch);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{batch}")
    public Result getById(@PathVariable String batch){
        GoodsTime goodsTime = goodsTimeService.getById(batch);
        Integer code = goodsTime !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = goodsTime != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,goodsTime,msg);
    }

    @GetMapping
    public Result getAll(){
        List<GoodsTime> goodsTimesList = goodsTimeService.getAll();
        Integer code = goodsTimesList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = goodsTimesList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,goodsTimesList,msg);
    }

}
