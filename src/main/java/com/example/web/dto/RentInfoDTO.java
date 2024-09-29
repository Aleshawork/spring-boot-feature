package com.example.web.dto;

import java.util.List;

public class RentInfoDTO {

    private List<CarRentInfoDTO> carRentInfoDTOList;

    public RentInfoDTO(List<CarRentInfoDTO> carRentInfoDTOList) {
        this.carRentInfoDTOList = carRentInfoDTOList;
    }

    public List<CarRentInfoDTO> getCarRentInfoDTOList() {
        return carRentInfoDTOList;
    }

    public void setCarRentInfoDTOList(List<CarRentInfoDTO> carRentInfoDTOList) {
        this.carRentInfoDTOList = carRentInfoDTOList;
    }
}
