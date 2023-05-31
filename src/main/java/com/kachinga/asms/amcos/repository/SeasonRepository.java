package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Long>, JpaSpecificationExecutor<Season> {

}