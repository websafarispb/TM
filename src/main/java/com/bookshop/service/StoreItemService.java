package com.bookshop.service;

import com.bookshop.dto.StoreItemDto;
import com.bookshop.mapper.StoreItemMapper;
import com.bookshop.model.Product;
import com.bookshop.model.StoreItem;
import com.bookshop.repository.ProductRepository;
import com.bookshop.repository.StoreItemRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreItemService {

    private final StoreItemRepository storeItemRepository;
    private final ProductRepository productRepository;
    private final StoreItemMapper storeItemMapper;

    public List<StoreItemDto> getAllStoreItems() {
        return storeItemRepository.findAll().stream()
                                  .map(storeItemMapper::toDto)
                                  .collect(Collectors.toList());
    }

    public StoreItemDto createStoreItem(StoreItemDto dto) {
        Product product = productRepository.findById(dto.getProduct().getId())
                                           .orElseThrow(() -> new RuntimeException("Product not found"));

        StoreItem entity = storeItemMapper.toEntity(dto, product);
        return storeItemMapper.toDto(storeItemRepository.save(entity));
    }
}
