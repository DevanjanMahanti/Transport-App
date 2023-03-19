package com.transport.transport.service;

import com.transport.transport.dao.SupplierDetailsDao;
import com.transport.transport.entity.SupplierDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierDetailsService {
    @Autowired
    SupplierDetailsDao supplierDetailsDao;

    public SupplierDetails getSupplierDetailsById(Integer id){
        return supplierDetailsDao.loadById(id);
    }

    public Integer addSupplierDetails(SupplierDetails supplierDetails){
        return supplierDetailsDao.add(supplierDetails);
    }
    public Integer updateSupplierDetails(SupplierDetails supplierDetails){
        return supplierDetailsDao.update(supplierDetails);
    }
    public Integer deleteSupplierDetails(SupplierDetails supplierDetails){
        return supplierDetailsDao.delete(supplierDetails);
    }


}
