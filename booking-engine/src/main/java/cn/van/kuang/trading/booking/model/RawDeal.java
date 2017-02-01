package cn.van.kuang.trading.booking.model;

import cn.van.kuang.trading.booking.utils.Guard;

import java.math.BigDecimal;
import java.util.Date;

public class RawDeal {

    private final long id;
    private final Date transactionTime;

    private final String product;
    private final Date valueDate;

    private final String primaryCcy;
    private final String secondaryCcy;

    private final BigDecimal primaryAmt;
    private final BigDecimal secondaryAmt;

    private final BigDecimal wholesaleSpotRate;
    private final BigDecimal contractSpotRate;
    private final BigDecimal wholesaleSwapPoint;
    private final BigDecimal contractSwapPoint;


    public RawDeal(RawDealBuilder builder) {
        Guard.notNull(builder, "Deal Builder");

        builder.validate();

        this.id = builder.id;
        this.transactionTime = builder.transactionTime;
        this.product = builder.product;
        this.valueDate = builder.valueDate;
        this.primaryCcy = builder.primaryCcy;
        this.secondaryCcy = builder.secondaryCcy;
        this.primaryAmt = builder.primaryAmt;
        this.secondaryAmt = builder.secondaryAmt;
        this.wholesaleSpotRate = builder.wholesaleSpotRate;
        this.contractSpotRate = builder.contractSpotRate;
        this.wholesaleSwapPoint = builder.wholesaleSwapPoint;
        this.contractSwapPoint = builder.contractSwapPoint;
    }

    public long getId() {
        return id;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public String getProduct() {
        return product;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public String getPrimaryCcy() {
        return primaryCcy;
    }

    public String getSecondaryCcy() {
        return secondaryCcy;
    }

    public BigDecimal getPrimaryAmt() {
        return primaryAmt;
    }

    public BigDecimal getSecondaryAmt() {
        return secondaryAmt;
    }

    public BigDecimal getWholesaleSpotRate() {
        return wholesaleSpotRate;
    }

    public BigDecimal getContractSpotRate() {
        return contractSpotRate;
    }

    public BigDecimal getWholesaleSwapPoint() {
        return wholesaleSwapPoint;
    }

    public BigDecimal getContractSwapPoint() {
        return contractSwapPoint;
    }

    @Override
    public String toString() {
        return "RawDeal{" +
                "id=" + id +
                ", transactionTime=" + transactionTime +
                ", product='" + product + '\'' +
                ", valueDate=" + valueDate +
                ", primaryCcy='" + primaryCcy + '\'' +
                ", secondaryCcy='" + secondaryCcy + '\'' +
                ", primaryAmt=" + primaryAmt +
                ", secondaryAmt=" + secondaryAmt +
                ", wholesaleSpotRate=" + wholesaleSpotRate +
                ", contractSpotRate=" + contractSpotRate +
                ", wholesaleSwapPoint=" + wholesaleSwapPoint +
                ", contractSwapPoint=" + contractSwapPoint +
                '}';
    }
}
