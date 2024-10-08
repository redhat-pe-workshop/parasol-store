package org.parasol.retail.store.inventory.service;

import org.parasol.retail.store.inventory.model.dto.InventoryDto;
import org.parasol.retail.store.inventory.model.dto.InventoryMapper;
import org.parasol.retail.store.inventory.model.entity.Inventory;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class InventoryService {

    public List<InventoryDto> findAll() {
        return Inventory.listAll().stream().map(i -> InventoryMapper.toDto((Inventory) i)).collect(Collectors.toList());
    }

    public List<InventoryDto> findByItemId(String itemId) {
        return Inventory.findByItemId(itemId).stream().map(InventoryMapper::toDto).collect(Collectors.toList());
    }

}
