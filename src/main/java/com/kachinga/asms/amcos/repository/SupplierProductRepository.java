package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.SupplierProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierProductRepository extends JpaRepository<SupplierProduct, Long>,
        JpaSpecificationExecutor<SupplierProduct> {

}