package com.challenge.hotel.buenasnoches.dto;

import com.challenge.hotel.buenasnoches.model.Hotel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class HotelResponse {

    private List<String> errors;
    private List<Hotel> hotels;

}
