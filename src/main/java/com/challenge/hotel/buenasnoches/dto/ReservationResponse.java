package com.challenge.hotel.buenasnoches.dto;

import com.challenge.hotel.buenasnoches.model.Guest;
import com.challenge.hotel.buenasnoches.model.Reservation;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class ReservationResponse {

    private List<Reservation> reservation;
    private List<String> errors;


}
