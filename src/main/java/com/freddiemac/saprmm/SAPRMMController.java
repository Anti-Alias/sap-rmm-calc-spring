package com.freddiemac.saprmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.ConstraintViolationException;

@RestController
@RequestMapping("saprmm")
public class SAPRMMController {

    private final SAPRMMService service;

    @Autowired
    public SAPRMMController(SAPRMMService service) {
        this.service = service;
    }

    @GetMapping("findAll")
    public List<SAPRMM> findAll() {
        return service.findAll();
    }

    @PostMapping("create")
    public void create(@RequestBody SAPRMM saprmm) {
        try {
            service.create(saprmm);
        }
        catch(ConstraintViolationException e) {
            throw new SAPRMMException("Format of SAPRMM object was invalid", e);
        }
    }

    @GetMapping("read/{id}")
    public SAPRMM read(@PathVariable("id") long id) {
        return service.read(id);
    }

    @PatchMapping("update/{id}")
    public void update(
        @PathVariable("id") long id,
        @RequestBody SAPRMM.UpdateParams params
    ) {
        service.update(id, params);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
        try {
            service.delete(id);
        }
        catch(EmptyResultDataAccessException e) {
            throw new SAPRMMException(String.format("SAPRMM object with id '%d' not found", id));
        }
    }
}
