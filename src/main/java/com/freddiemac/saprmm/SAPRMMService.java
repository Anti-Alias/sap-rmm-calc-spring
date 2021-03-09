package com.freddiemac.saprmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for the {@link com.freddiemac.saprmm.SAPRMM} class.
 */
@Service
public class SAPRMMService {

    private final SAPRMMRepository repository;

    @Autowired
    public SAPRMMService(SAPRMMRepository repository) {
        this.repository = repository;
    }

    public List<SAPRMM> findAll() {
        return repository.findAll();
    }

    public void create(SAPRMM saprmm) { repository.save(saprmm); }

    public SAPRMM read(long id) {
        return repository
            .findById(id)
            .orElseThrow(()-> new SAPRMMException(String.format("SAPRMM instance with id '%s' not found", id)));
    }

    public void update(long id, SAPRMM.UpdateParams updateParams) {
        SAPRMM existingRecord = repository
            .findById(id)
            .orElseThrow(() -> new SAPRMMException(String.format("SAPRMM instance with id '%s' not found", id)));
        existingRecord.update(updateParams);
        repository.save(existingRecord);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
