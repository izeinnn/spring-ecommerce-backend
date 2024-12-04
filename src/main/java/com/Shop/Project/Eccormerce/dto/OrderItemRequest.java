package com.Shop.Project.Eccormerce.dto;

import lombok.Data;

@Data
public class OrderItemRequest {

    private Long productId;
    private int quantity;
}
