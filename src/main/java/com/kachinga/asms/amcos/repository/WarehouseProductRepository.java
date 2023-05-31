package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.WarehouseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseProductRepository extends JpaRepository<WarehouseProduct, Long>,
        JpaSpecificationExecutor<WarehouseProduct> {

}