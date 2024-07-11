package com.cloudbees.TickatApp.datamodel;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Setter
@Getter
public class UserModel {
	private String firstName;
    private String lastName;
    private String email;
    private BigDecimal price;
    private String seatNo;
    private String departureFrom;
    private String destinationTo;
    private Long userId;
}
