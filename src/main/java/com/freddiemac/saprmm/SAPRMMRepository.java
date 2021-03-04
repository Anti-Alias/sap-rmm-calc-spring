package com.freddiemac.saprmm;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@com.freddiemac.saprmm.SAPRMM} class.
 */
@Repository
public interface SAPRMMRepository extends JpaRepository<SAPRMM, Long> {
    List<SAPRMM> findAll();
}
