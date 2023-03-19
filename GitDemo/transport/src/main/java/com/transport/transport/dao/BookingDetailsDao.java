package com.transport.transport.dao;

import com.transport.transport.entity.BookingDetails;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDetailsDao extends JpaCrudDao<Integer, BookingDetails>{
    public BookingDetailsDao() {
        super(BookingDetails.class);
    }
}
