package com.bookshop.service;

import com.bookshop.dto.BookingDto;
import com.bookshop.mapper.BookingMapper;
import com.bookshop.model.Booking;
import com.bookshop.model.Product;
import com.bookshop.model.User;
import com.bookshop.repository.BookingRepository;
import com.bookshop.repository.ProductRepository;
import com.bookshop.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final BookingMapper bookingMapper;

    public List<BookingDto> getAllBookings() {
        return bookingRepository.findAll()
                                .stream()
                                .map(bookingMapper::toDto)
                                .collect(Collectors.toList());
    }

    public BookingDto createBooking(BookingDto dto) {
        User user = userRepository.findById(dto.getUser().getId())
                                  .orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepository.findById(dto.getProduct().getId())
                                           .orElseThrow(() -> new RuntimeException("Product not found"));

        Booking booking = bookingMapper.toEntity(dto, user, product);
        var saved = bookingRepository.save(booking);
        return bookingMapper.toDto(saved);
    }
}

