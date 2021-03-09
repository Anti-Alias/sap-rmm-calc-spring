package com.freddiemac.saprmm;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * SAPRMM entity.
 */
@Entity(name = "saprmm")
class SAPRMM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double poolPercent;
    private double fmParticipationPercent;
    private double upbInvestorPriorAmount;
    private double mortgageUpbPriorAmount;
    private double upbCurrentAmount;
    private double piPaymentAmount;
    private double noteRate;
    private int poolTerm;
    private String productCode;
    private Instant maturityDate;
    private Instant noteMaturityDate;
    private String principalAmortizationCode;
    private Instant ddlpi;
    private String activeInactiveEditCode;
    private double upbAdjustmentAmountCurrent;
    private String loanStatus;

    public SAPRMM() {}

    public SAPRMM(
        double poolPercent,
        double fmParticipationPercent,
        double upbInvestorPriorAmount,
        double mortgageUpbPriorAmount,
        double upbCurrentAmount,
        double piPaymentAmount,
        double noteRate,
        int poolTerm,
        String productCode,
        Instant maturityDate,
        Instant noteMaturityDate,
        String principalAmortizationCode,
        Instant ddlpi,
        String activeInactiveEditCode,
        double upbAdjustmentAmountCurrent,
        String loanStatus
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

    public Long getId() { return id; }

    public double getPoolPercent() { return poolPercent; }

    public double getFmParticipationPercent() { return fmParticipationPercent; }

    public double getUpbInvestorPriorAmount() { return upbInvestorPriorAmount; }

    public double getMortgageUpbPriorAmount() { return mortgageUpbPriorAmount; }

    public double getUpbCurrentAmount() { return upbCurrentAmount; }

    public double getPiPaymentAmount() { return piPaymentAmount; }

    public double getNoteRate() { return noteRate; }

    public int getPoolTerm() { return poolTerm; }

    public String getProductCode() { return productCode; }

    public Instant getMaturityDate() { return maturityDate; }

    public Instant getNoteMaturityDate() { return noteMaturityDate; }

    public String getPrincipalAmortizationCode() { return principalAmortizationCode; }

    public Instant getDdlpi() { return ddlpi; }

    public String getActiveInactiveEditCode() { return activeInactiveEditCode; }

    public double getUpbAdjustmentAmountCurrent() { return upbAdjustmentAmountCurrent; }

    public String getLoanStatus() { return loanStatus; }

    /**
     * Updates specific parameters.
     * @param params Parameters to update.
     */
    public void update(UpdateParams params) {
        upbCurrentAmount = params.getUpbCurrentAmount();
        loanStatus = params.getLoanStatus();
        maturityDate = params.getMaturityDate();
        poolTerm = params.getPoolTerm();
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
            Double.compare(saprmm.upbAdjustmentAmountCurrent, upbAdjustmentAmountCurrent) == 0 &&
            Objects.equals(id, saprmm.id) &&
            Objects.equals(productCode, saprmm.productCode) &&
            Objects.equals(maturityDate, saprmm.maturityDate) &&
            Objects.equals(noteMaturityDate, saprmm.noteMaturityDate) &&
            Objects.equals(principalAmortizationCode, saprmm.principalAmortizationCode) &&
            Objects.equals(ddlpi, saprmm.ddlpi) &&
            Objects.equals(activeInactiveEditCode, saprmm.activeInactiveEditCode) &&
            Objects.equals(loanStatus, saprmm.loanStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
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

    /**
     * Represents the parameters that are be passed into a controller
     * for updating a {@link SAPRMM} instance.
     */
    static class UpdateParams {

        private final double upbCurrentAmount;
        @NotNull private final String loanStatus;
        @NotNull private final Instant maturityDate;
        private final int poolTerm;

        public UpdateParams(double upbCurrentAmount, String loanStatus, Instant maturityDate, int poolTerm) {
            this.upbCurrentAmount = upbCurrentAmount;
            this.loanStatus = loanStatus;
            this.maturityDate = maturityDate;
            this.poolTerm = poolTerm;
        }

        public double getUpbCurrentAmount() { return upbCurrentAmount; }

        public String getLoanStatus() { return loanStatus; }

        public Instant getMaturityDate() { return maturityDate; }

        public int getPoolTerm() { return poolTerm; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UpdateParams that = (UpdateParams) o;
            return Double.compare(that.upbCurrentAmount, upbCurrentAmount) == 0 &&
                poolTerm == that.poolTerm &&
                Objects.equals(loanStatus, that.loanStatus) &&
                Objects.equals(maturityDate, that.maturityDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(upbCurrentAmount, loanStatus, maturityDate, poolTerm);
        }
    }
}
