package com.challenge.hotel.buenasnoches.dto;

import com.challenge.hotel.buenasnoches.model.Guest;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class GuestResponse {

    private List<String> errors;
    private List<Guest> guests;

}
