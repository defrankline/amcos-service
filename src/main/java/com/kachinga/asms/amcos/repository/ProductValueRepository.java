package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.ProductValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductValueRepository extends JpaRepository<ProductValue, Long>, JpaSpecificationExecutor<ProductValue> {

}