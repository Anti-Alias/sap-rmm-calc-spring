package com.freddiemac.saprmm;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Service for the {@link com.freddiemac.saprmm.SAPRMM} class.
 */
public class SAPRMMService {

    private SAPRMMRepository repository;

    @Autowired
    public SAPRMMService(SAPRMMRepository repository) {
        this.repository = repository;
    }

    public List<SAPRMM> findAll() {
        return repository.findAll();
    }
}
