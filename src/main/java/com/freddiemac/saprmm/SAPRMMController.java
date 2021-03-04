package com.freddiemac.saprmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("saprmm")
public class SAPRMMController {

    private SAPRMMService service;

    @Autowired
    public SAPRMMController(SAPRMMService service) {
        this.service = service;
    }

    public List<SAPRMM> findAll() {
        return service.findAll();
    }
}
