CREATE TABLE "saprmm" (
    id SERIAL PRIMARY KEY NOT NULL,
    pool_percent DOUBLE PRECISION NOT NULL,
    fm_participation_percent DOUBLE PRECISION NOT NULL,
    upb_investor_prior_amount DOUBLE PRECISION NOT NULL,
    mortgage_upb_prior_amount DOUBLE PRECISION NOT NULL,
    upb_current_amount DOUBLE PRECISION NOT NULL,
    pi_payment_amount DOUBLE PRECISION NOT NULL,
    note_rate DOUBLE PRECISION NOT NULL,
    pool_term DOUBLE PRECISION NOT NULL,
    product_code TEXT NOT NULL,
    maturity_date TIMESTAMPTZ NOT NULL,
    note_maturity_date TIMESTAMPTZ NOT NULL,
    principal_amortization_code TEXT NOT NULL,
    ddlpi TIMESTAMPTZ NOT NULL,
    active_inactive_edit_code TEXT NOT NULL,
    upb_adjustment_amount_current DOUBLE PRECISION NOT NULL,
    loan_status TEXT NOT NULL
);