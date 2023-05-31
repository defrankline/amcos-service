package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.StorageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRequestRepository extends JpaRepository<StorageRequest, Long>, JpaSpecificationExecutor<StorageRequest> {

}