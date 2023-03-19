package com.transport.transport.service;

import com.transport.transport.dao.BookingDetailsDao;
import com.transport.transport.entity.BookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingDetailsService  {

    @Autowired
    BookingDetailsDao bookingDetailsDao;

    public BookingDetails getBookingDetailsById(Integer id){
        return bookingDetailsDao.loadById(id);

    }
    public Integer addBookingDetails(BookingDetails bookingDetails){
        return bookingDetailsDao.add(bookingDetails);
    }

    public Integer updateBookingDetails(BookingDetails bookingDetails){
        return bookingDetailsDao.add(bookingDetails);
    }

    public Integer deleteBookingDetails(BookingDetails bookingDetails){
        return bookingDetailsDao.add(bookingDetails);
    }
}
