package com.kachinga.asms.amcos.service;

import com.kachinga.asms.amcos.domain.SupplierProduct;
import com.kachinga.asms.amcos.repository.specs.SearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SupplierProductService {
    SupplierProduct save(SupplierProduct supplierProduct);

    void delete(Long id);

    Optional<SupplierProduct> findById(Long id);

    Page<SupplierProduct> findAllPage(SearchRequest request);

    List<SupplierProduct> findAllList(SearchRequest request);
}
