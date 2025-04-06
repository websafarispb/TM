package com.bookshop.controller;

import com.bookshop.dto.StoreItemDto;
import com.bookshop.service.StoreItemService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store-items")
@RequiredArgsConstructor
public class StoreItemController {

    private final StoreItemService storeItemService;

    @GetMapping
    public List<StoreItemDto> getAllStoreItems() {
        return storeItemService.getAllStoreItems();
    }

    @PostMapping
    public StoreItemDto createStoreItem(@RequestBody StoreItemDto dto) {
        return storeItemService.createStoreItem(dto);
    }
}

