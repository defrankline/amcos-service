package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.BuyerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerProductRepository extends JpaRepository<BuyerProduct, Long>, JpaSpecificationExecutor<BuyerProduct> {

}