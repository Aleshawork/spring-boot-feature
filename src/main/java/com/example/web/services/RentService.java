package com.example.web.services;

import com.example.web.dto.CarRentInfoDTO;
import com.example.web.dto.RentInfoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentService {


    public RentInfoDTO getRentInfos(int limit, int offset) {
        return new RentInfoDTO(generate(limit-offset));
    }


    private List<CarRentInfoDTO> generate(int count) {
        List<CarRentInfoDTO> carRentInfoDTOList = new ArrayList<>(count);
        for(int i =0; i<count; i++) {
            carRentInfoDTOList.add(new CarRentInfoDTO(String.valueOf(System.nanoTime()), Math.random()));
        }
        return carRentInfoDTOList;
    }
}
