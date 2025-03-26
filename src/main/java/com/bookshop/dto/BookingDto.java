package com.bookshop.dto;

import com.bookshop.model.BookingStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingDto {

    private Integer id;
    private UserDto user;
    private ProductDto product;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private LocalDateTime deliveryTime;
    private BookingStatus status;
    private Integer quantity;
}
