package com.bookshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreItemDto {

    private Integer id;
    private ProductDto product;
    private Integer availableQty;
    private Integer bookedQty;
    private Integer soldQty;
}