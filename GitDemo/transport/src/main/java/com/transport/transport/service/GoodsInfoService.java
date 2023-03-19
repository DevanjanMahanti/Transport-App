package com.transport.transport.service;

import com.transport.transport.dao.GoodsInfoDao;
import com.transport.transport.entity.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsInfoService {

    @Autowired
    GoodsInfoDao goodsInfoDao;

    public GoodsInfo getGoodsInfoById(Integer id){
        return goodsInfoDao.loadById(id);
    }

    public Integer addGoodsInfo(GoodsInfo goodsInfo){
        return goodsInfoDao.add(goodsInfo);
    }
    public Integer updateGoodsInfo(GoodsInfo goodsInfo){
        return goodsInfoDao.update(goodsInfo);
    }
    public Integer deleteGoodsInfo(GoodsInfo goodsInfo){
        return goodsInfoDao.delete(goodsInfo);
    }

}
