package com.transport.transport.controller;

import com.transport.transport.entity.CustomerDetails;
import com.transport.transport.response.ResponseHandler;
import com.transport.transport.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transport")
public class CustomerDetailsController {

    @Autowired
    CustomerDetailsService customerDetailsService;
    @Autowired
    ResponseHandler responseHandler;

    @GetMapping(value="/customer")
    public ResponseEntity<Object> getCustomerDetails(@RequestParam Integer id){
        try{
            CustomerDetails customerDetails = customerDetailsService.getCustomerDetailsById(id);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, customerDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

        }
    @PostMapping(value="/customer")
    public ResponseEntity<Object> addCustomerDetails(@RequestBody CustomerDetails customerDetails){
        try {
            Integer id = customerDetailsService.addCustomerDetails(customerDetails);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, customerDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }

    @PutMapping(value="/customer")
    public ResponseEntity<Object> updateCustomerDetails(@RequestBody CustomerDetails customerDetails){
        try{
            Integer id = customerDetailsService.updateCustomerDetails(customerDetails);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, customerDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);

        }
    }
    @DeleteMapping(value="/customer")
    public ResponseEntity<Object> deleteCustomerDetails(@RequestBody CustomerDetails customerDetails){
        try {
            Integer id = customerDetailsService.deleteCustomerDetails(customerDetails);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, customerDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);

        }
    }

}
