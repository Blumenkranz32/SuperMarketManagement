package com.seucxxy.controller;

import com.seucxxy.domain.Goods;
import com.seucxxy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping
    public Result save(@RequestBody Goods goods){
        boolean flag = goodsService.save(goods);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Goods goods){
        int isvip = goods.getIsvip();
        float discount = goods.getDiscount();
        float price = goods.getPrice();
        System.out.println("会员"+isvip);
        System.out.println("价格是"+price);
        if(discount!=0.00){
            if(isvip==1){
                price = discount;
                System.out.println("是会员");
                System.out.println("会员价格是"+price);
            }else {
                System.out.println("不是会员");
                System.out.println(price);
            }
        }
        boolean flag = goodsService.update(goods);
        int num = goods.getSoldnow();
        System.out.println(num);

        goodsService.setSold(goods.getId(),goods.getSold()+num);
        System.out.println(goods.getSold());


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String sdate = sdf.format(date);

        double income = goodsService.getIncome(sdate);      //获取当前收入

        income = price*num+income;      //之前的收入加上当前收入
        goodsService.getSell(income,sdate);

        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        boolean flag = goodsService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
        Goods goods = goodsService.getById(id);
        Integer code = goods !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = goods != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,goods,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Goods> goodsList = goodsService.getAll();
        Integer code = goodsList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = goodsList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,goodsList,msg);
    }

}
