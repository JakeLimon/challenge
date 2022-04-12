package com.challenge.hotel.buenasnoches.model;

import com.challenge.hotel.buenasnoches.enums.EGuestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table( name = "guest_type" )
@AllArgsConstructor
@NoArgsConstructor
public class GuestType implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated( EnumType.STRING )
    private EGuestType name;

}
