package com.kachinga.asms.amcos.service;

import com.kachinga.asms.amcos.domain.Warehouse;
import com.kachinga.asms.amcos.domain.WarehouseProduct;
import com.kachinga.asms.amcos.repository.specs.SearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface WarehouseService {
    Warehouse save(Warehouse warehouse);

    void delete(Long id);

    Optional<Warehouse> findById(Long id);

    Page<Warehouse> findAllPage(SearchRequest request);
    List<Warehouse> findAllList(SearchRequest request);
}
