package com.bookshop.mapper;

import com.bookshop.dto.BookingDto;
import com.bookshop.model.Booking;
import com.bookshop.model.Product;
import com.bookshop.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingMapper {

    private final UserMapper userMapper;
    private final ProductMapper productMapper;

    public BookingDto toDto(Booking booking) {
        return BookingDto.builder()
                         .id(booking.getId())
                         .user(userMapper.toDto(booking.getUser()))
                         .product(productMapper.toDto(booking.getProduct()))
                         .deliveryAddress(booking.getDeliveryAddress())
                         .deliveryDate(booking.getDeliveryDate())
                         .deliveryTime(booking.getDeliveryTime())
                         .status(booking.getStatus())
                         .quantity(booking.getQuantity())
                         .build();
    }

    public Booking toEntity(BookingDto dto, User user, Product product) {
        return Booking.builder()
                      .id(dto.getId())
                      .deliveryAddress(dto.getDeliveryAddress())
                      .deliveryDate(dto.getDeliveryDate())
                      .deliveryTime(dto.getDeliveryTime())
                      .status(dto.getStatus())
                      .quantity(dto.getQuantity())
                      .user(user)
                      .product(product)
                      .build();
    }
}


