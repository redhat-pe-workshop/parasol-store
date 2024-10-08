package org.parasol.retail.store.order.service;

import io.smallrye.common.annotation.Blocking;
import org.parasol.retail.store.order.model.dto.OrderDto;
import org.parasol.retail.store.order.model.dto.OrderMapper;
import org.parasol.retail.store.order.model.entity.Order;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class OrderService {

    @Transactional
    // @Blocking
    public OrderDto storeOrder(OrderDto orderDto) {
        Order order = OrderMapper.toEntity(orderDto);
        order.persist();
        return OrderMapper.toDto(order);
    }

}
