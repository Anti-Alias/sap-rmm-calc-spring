package com.freddiemac.saprmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
            service.save(saprmm);
        }
        catch(ConstraintViolationException e) {
            throw new SAPRMMException("Format of SAPRMM object was invalid", e);
        }
    }

    @PatchMapping("update")
    public void update(@RequestBody SAPRMM.UpdateParams params) {
        service.update(params);
    }
}
