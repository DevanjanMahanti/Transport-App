package com.transport.transport.dao;


import com.transport.transport.entity.SupplierDetails;
import org.springframework.stereotype.Repository;

@Repository
public class SupplierDetailsDao extends JpaCrudDao<Integer, SupplierDetails>{
    public SupplierDetailsDao() {
        super(SupplierDetails.class);
    }
}
