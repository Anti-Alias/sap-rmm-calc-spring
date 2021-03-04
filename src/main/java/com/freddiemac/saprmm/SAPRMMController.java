package com.freddiemac.saprmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("saprmm")
public class SAPRMMController {

    private SAPRMMService service;

    @Autowired
    public SAPRMMController(SAPRMMService service) {
        this.service = service;
    }

    @GetMapping("findAll")
    public List<SAPRMM> findAll() {
        return service.findAll();
    }
}
