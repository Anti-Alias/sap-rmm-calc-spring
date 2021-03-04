package com.freddiemac.saprmm;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * SAPRMM POJO.
 */
@Entity(name = "saprmm")
class SAPRMM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double poolPercent;
    private double fmParticipationPercent;
    private double upbInvestorPriorAmount;
    private double mortgageUpbPriorAmount;
    private double upbCurrentAmount;
    private double piPaymentAmount;
    private double noteRate;
    private double poolTerm;
    private double productCode;
    private double maturityDate;
    private double noteMaturityDate;
    private double principalAmortizationCode;
    private double ddlpi;
    private double activeInactiveEditCode;
    private double upbAdjustmentAmountCurrent;
    private double loanStatus;

    /**
     * Default constructor.
     */
    public SAPRMM() {}

    public SAPRMM(
        double poolPercent,
        double fmParticipationPercent,
        double upbInvestorPriorAmount,
        double mortgageUpbPriorAmount,
        double upbCurrentAmount,
        double piPaymentAmount,
        double noteRate,
        double poolTerm,
        double productCode,
        double maturityDate,
        double noteMaturityDate,
        double principalAmortizationCode,
        double ddlpi,
        double activeInactiveEditCode,
        double upbAdjustmentAmountCurrent,
        double loanStatus
    ) {
        this.poolPercent = poolPercent;
        this.fmParticipationPercent = fmParticipationPercent;
        this.upbInvestorPriorAmount = upbInvestorPriorAmount;
        this.mortgageUpbPriorAmount = mortgageUpbPriorAmount;
        this.upbCurrentAmount = upbCurrentAmount;
        this.piPaymentAmount = piPaymentAmount;
        this.noteRate = noteRate;
        this.poolTerm = poolTerm;
        this.productCode = productCode;
        this.maturityDate = maturityDate;
        this.noteMaturityDate = noteMaturityDate;
        this.principalAmortizationCode = principalAmortizationCode;
        this.ddlpi = ddlpi;
        this.activeInactiveEditCode = activeInactiveEditCode;
        this.upbAdjustmentAmountCurrent = upbAdjustmentAmountCurrent;
        this.loanStatus = loanStatus;
    }

    public double getPoolPercent() {
        return poolPercent;
    }

    public double getFmParticipationPercent() {
        return fmParticipationPercent;
    }

    public double getUpbInvestorPriorAmount() {
        return upbInvestorPriorAmount;
    }

    public double getMortgageUpbPriorAmount() {
        return mortgageUpbPriorAmount;
    }

    public double getUpbCurrentAmount() {
        return upbCurrentAmount;
    }

    public double getPiPaymentAmount() {
        return piPaymentAmount;
    }

    public double getNoteRate() {
        return noteRate;
    }

    public double getPoolTerm() {
        return poolTerm;
    }

    public double getProductCode() {
        return productCode;
    }

    public double getMaturityDate() {
        return maturityDate;
    }

    public double getNoteMaturityDate() {
        return noteMaturityDate;
    }

    public double getPrincipalAmortizationCode() {
        return principalAmortizationCode;
    }

    public double getDdlpi() {
        return ddlpi;
    }

    public double getActiveInactiveEditCode() {
        return activeInactiveEditCode;
    }

    public double getUpbAdjustmentAmountCurrent() {
        return upbAdjustmentAmountCurrent;
    }

    public double getLoanStatus() {
        return loanStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SAPRMM saprmm = (SAPRMM) o;
        return Double.compare(saprmm.poolPercent, poolPercent) == 0 &&
            Double.compare(saprmm.fmParticipationPercent, fmParticipationPercent) == 0 &&
            Double.compare(saprmm.upbInvestorPriorAmount, upbInvestorPriorAmount) == 0 &&
            Double.compare(saprmm.mortgageUpbPriorAmount, mortgageUpbPriorAmount) == 0 &&
            Double.compare(saprmm.upbCurrentAmount, upbCurrentAmount) == 0 &&
            Double.compare(saprmm.piPaymentAmount, piPaymentAmount) == 0 &&
            Double.compare(saprmm.noteRate, noteRate) == 0 &&
            Double.compare(saprmm.poolTerm, poolTerm) == 0 &&
            Double.compare(saprmm.productCode, productCode) == 0 &&
            Double.compare(saprmm.maturityDate, maturityDate) == 0 &&
            Double.compare(saprmm.noteMaturityDate, noteMaturityDate) == 0 &&
            Double.compare(saprmm.principalAmortizationCode, principalAmortizationCode) == 0 &&
            Double.compare(saprmm.ddlpi, ddlpi) == 0 &&
            Double.compare(saprmm.activeInactiveEditCode, activeInactiveEditCode) == 0 &&
            Double.compare(saprmm.upbAdjustmentAmountCurrent, upbAdjustmentAmountCurrent) == 0 &&
            Double.compare(saprmm.loanStatus, loanStatus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            poolPercent,
            fmParticipationPercent,
            upbInvestorPriorAmount,
            mortgageUpbPriorAmount,
            upbCurrentAmount,
            piPaymentAmount,
            noteRate,
            poolTerm,
            productCode,
            maturityDate,
            noteMaturityDate,
            principalAmortizationCode,
            ddlpi,
            activeInactiveEditCode,
            upbAdjustmentAmountCurrent,
            loanStatus
        );
    }
}
