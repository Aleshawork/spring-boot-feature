package com.example.web.controller;

import com.example.web.dto.CarRentInfoDTO;
import com.example.web.dto.RentInfoDTO;
import com.example.web.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentInfoController {

    @Autowired
    private RentService rentService;

    @GetMapping("/rentInfo")
    public ResponseEntity<RentInfoDTO> getRentInfo(@RequestParam int limit, @RequestParam int offset) {
        return ResponseEntity.ok(rentService.getRentInfos(limit, offset));
    }
}
