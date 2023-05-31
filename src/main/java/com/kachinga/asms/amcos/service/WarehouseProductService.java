package com.kachinga.asms.amcos.service;

import com.kachinga.asms.amcos.domain.Unit;
import com.kachinga.asms.amcos.domain.User;
import com.kachinga.asms.amcos.domain.WarehouseProduct;
import com.kachinga.asms.amcos.domain.dto.UserDto;
import com.kachinga.asms.amcos.repository.specs.SearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
public interface WarehouseProductService {
    WarehouseProduct save(WarehouseProduct warehouseProduct);

    void delete(Long id);

    Optional<WarehouseProduct> findById(Long id);

    Page<WarehouseProduct> findAllPage(SearchRequest request);
    List<WarehouseProduct> findAllList(SearchRequest request);
}
