package com.example.orders.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDTO {
    private Long id;
    private Long customerId;
    private String status;
    private LocalDate dob;
    private Long addressId;
    private Collection<OfferOrderCardDTO> offerOrderCards=new HashSet<>();
}
