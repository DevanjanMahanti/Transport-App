package com.transport.transport.controller;

import com.transport.transport.entity.BookingDetails;
import com.transport.transport.response.ResponseHandler;
import com.transport.transport.service.BookingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transport")
public class BookingDetailsController {

    @Autowired
    BookingDetailsService bookingDetailsService;
    @Autowired
    ResponseHandler responseHandler;

    @GetMapping(value="/bookings")
    public ResponseEntity<Object> getBookingDetails(@RequestParam Integer id) {
        try {
            BookingDetails bookingDetails = bookingDetailsService.getBookingDetailsById(id);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, bookingDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    @PostMapping(value="/bookings")
        public ResponseEntity<Object> addBookingDetails(@RequestBody BookingDetails bookingDetails){
            try{
               Integer id = bookingDetailsService.addBookingDetails(bookingDetails);
               return ResponseHandler.generateResponse("Successfully Created",HttpStatus.CREATED,id);
           }catch (Exception e) {
               return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
           }
    }
    @PutMapping(value="/bookings")
    public ResponseEntity<Object> updateBookingDetails(@RequestBody BookingDetails bookingDetails){
        try {
            Integer id = bookingDetailsService.updateBookingDetails(bookingDetails);
            return ResponseHandler.generateResponse("Successfully Updated", HttpStatus.OK, id);
        }catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }
    @DeleteMapping(value="/bookings")
    public ResponseEntity<Object> deleteBookingDetails(@RequestBody BookingDetails bookingDetails){
        try {
            Integer id = bookingDetailsService.deleteBookingDetails(bookingDetails);
            return ResponseHandler.generateResponse(HttpStatus.OK);
        }catch (Exception e)
        {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

}