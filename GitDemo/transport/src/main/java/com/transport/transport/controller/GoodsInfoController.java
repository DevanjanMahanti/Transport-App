package com.transport.transport.controller;

import com.transport.transport.entity.GoodsInfo;
import com.transport.transport.response.ResponseHandler;
import com.transport.transport.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transport")
public class GoodsInfoController {
    @Autowired
    GoodsInfoService goodsInfoService;
    @Autowired
    ResponseHandler responseHandler;

    @GetMapping(value="/goodsInfo")
    public ResponseEntity<Object> getGoodsInfo(@RequestParam Integer id){
        try{
            GoodsInfo goodsInfo = goodsInfoService.getGoodsInfoById(id);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, goodsInfo);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }
    @PostMapping(value="/goodsInfo")
    public ResponseEntity<Object> addGoodsInfo(@RequestBody GoodsInfo goodsInfo){
        try {
            Integer id = goodsInfoService.addGoodsInfo(goodsInfo);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, goodsInfo);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }

    @PutMapping(value="/goodsInfo")
    public ResponseEntity<Object> updateGoodsInfo(@RequestBody GoodsInfo goodsInfo){
        try{
            Integer id = goodsInfoService.updateGoodsInfo(goodsInfo);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, goodsInfo);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);

        }
    }
    @DeleteMapping(value="/goodsInfo")
    public ResponseEntity<Object> deleteGoodsInfo(@RequestBody GoodsInfo goodsInfo){
        try {
            Integer id = goodsInfoService.deleteGoodsInfo(goodsInfo);
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, goodsInfo);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);

        }
    }

}
