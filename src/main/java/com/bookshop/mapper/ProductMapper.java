package com.bookshop.mapper;

import com.bookshop.dto.ProductDto;
import com.bookshop.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductMapper {

    public ProductDto toDto(Product entity) {
        return ProductDto.builder()
                         .id(entity.getId())
                         .name(entity.getName())
                         .description(entity.getDescription())
                         .author(entity.getAuthor())
                         .price(entity.getPrice())
                         .imagePath(entity.getImagePath())
                         .build();
    }

    public Product toEntity(ProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setAuthor(dto.getAuthor());
        product.setPrice(dto.getPrice());
        product.setImagePath(dto.getImagePath());
        return product;
    }
}


