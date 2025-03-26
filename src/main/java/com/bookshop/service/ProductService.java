package com.bookshop.service;

import com.bookshop.dto.ProductDto;
import com.bookshop.mapper.ProductMapper;
import com.bookshop.model.Product;
import com.bookshop.repository.ProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                                .stream()
                                .map(productMapper::toDto)
                                .toList();
    }

    public ProductDto createProduct(ProductDto dto) {
        Product product = productMapper.toEntity(dto);
        Product saved = productRepository.save(product);
        return productMapper.toDto(saved);
    }
}
