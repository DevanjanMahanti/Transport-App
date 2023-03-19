package com.transport.transport.dao;



import com.transport.transport.entity.GoodsInfo;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsInfoDao extends JpaCrudDao<Integer, GoodsInfo> {
    public GoodsInfoDao() {
        super(GoodsInfo.class);
    }
}
