package com.transport.transport.dao;


import com.transport.transport.entity.CustomerDetails;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDetailsDao extends JpaCrudDao<Integer, CustomerDetails>{
    public CustomerDetailsDao() {
        super(CustomerDetails.class);
    }
}
