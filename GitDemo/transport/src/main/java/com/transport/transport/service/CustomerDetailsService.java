package com.transport.transport.service;

import com.transport.transport.dao.CustomerDetailsDao;
import com.transport.transport.entity.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService {

    @Autowired
    CustomerDetailsDao customerDetailsDao;

    public CustomerDetails getCustomerDetailsById(Integer id){
        return customerDetailsDao.loadById(id);
    }

    public Integer addCustomerDetails(CustomerDetails customerDetails){
        return customerDetailsDao.add(customerDetails);
    }
    public Integer updateCustomerDetails(CustomerDetails customerDetails){
        return customerDetailsDao.update(customerDetails);
    }
    public Integer deleteCustomerDetails(CustomerDetails customerDetails){
        return customerDetailsDao.delete(customerDetails);
    }
}
