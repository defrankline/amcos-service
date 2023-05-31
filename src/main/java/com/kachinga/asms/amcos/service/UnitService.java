package com.kachinga.asms.amcos.service;

import com.kachinga.asms.amcos.domain.Unit;
import com.kachinga.asms.amcos.repository.specs.SearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UnitService {
    Unit save(Unit unit);

    void delete(Long id);

    Optional<Unit> findById(Long id);

    Page<Unit> findAllPage(SearchRequest request);
    List<Unit> findAllList(SearchRequest request);
}
