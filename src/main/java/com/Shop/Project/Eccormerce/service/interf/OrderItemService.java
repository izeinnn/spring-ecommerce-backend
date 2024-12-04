package com.Shop.Project.Eccormerce.service.interf;

import com.Shop.Project.Eccormerce.dto.OrderRequest;
import com.Shop.Project.Eccormerce.dto.Response;
import com.Shop.Project.Eccormerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
