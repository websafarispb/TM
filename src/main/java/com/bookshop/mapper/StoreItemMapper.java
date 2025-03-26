package com.bookshop.mapper;

import com.bookshop.dto.StoreItemDto;
import com.bookshop.model.Product;
import com.bookshop.model.StoreItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StoreItemMapper {

    private final ProductMapper productMapper;

    public StoreItemDto toDto(StoreItem storeItem) {
        return StoreItemDto.builder()
                           .id(storeItem.getId())
                           .product(productMapper.toDto(storeItem.getProduct()))
                           .availableQty(storeItem.getAvailableQty())
                           .bookedQty(storeItem.getBookedQty())
                           .soldQty(storeItem.getSoldQty())
                           .build();
    }

    public StoreItem toEntity(StoreItemDto dto, Product product) {
        StoreItem storeItem = new StoreItem();
        storeItem.setId(dto.getId());
        storeItem.setProduct(product);
        storeItem.setAvailableQty(dto.getAvailableQty());
        storeItem.setBookedQty(dto.getBookedQty());
        storeItem.setSoldQty(dto.getSoldQty());
        return storeItem;
    }
}



