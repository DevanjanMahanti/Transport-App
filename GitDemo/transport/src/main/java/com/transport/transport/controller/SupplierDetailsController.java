package com.transport.transport.controller;

import com.transport.transport.entity.SupplierDetails;
import com.transport.transport.response.ResponseHandler;
import com.transport.transport.service.SupplierDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transport")
public class SupplierDetailsController {
    @Autowired
    SupplierDetailsService supplierDetailsService;
    @Autowired
    ResponseHandler responseHandler;

    @GetMapping(value="/supplier")
    public ResponseEntity<Object> getSupplierDetails(@RequestParam Integer id){
        try{
            SupplierDetails supplierDetails = supplierDetailsService.getSupplierDetailsById(id);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, supplierDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }
    @PostMapping(value="/supplier")
    public ResponseEntity<Object> addSupplierDetails(@RequestBody SupplierDetails supplierDetails){
        try {
            Integer id = supplierDetailsService.addSupplierDetails(supplierDetails);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, supplierDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }

    @PutMapping(value="/supplier")
    public ResponseEntity<Object> updateSupplierDetails(@RequestBody SupplierDetails supplierDetails){
        try{
            Integer id = supplierDetailsService.updateSupplierDetails(supplierDetails);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, supplierDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);

        }
    }
    @DeleteMapping(value="/supplier")
    public ResponseEntity<Object> deleteSupplierDetails(@RequestBody SupplierDetails supplierDetails){
        try {
            Integer id = supplierDetailsService.deleteSupplierDetails(supplierDetails);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, supplierDetails);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);

        }
    }
}
