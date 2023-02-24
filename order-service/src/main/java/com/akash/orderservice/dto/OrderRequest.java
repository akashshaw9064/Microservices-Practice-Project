package com.akash.orderservice.dto;

import java.util.List;

public record OrderRequest(List<OrderLineItemsDto> orderLineItemsDtoList) {
}
