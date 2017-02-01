package cn.van.kuang.trading.booking.model;

import cn.van.kuang.trading.booking.utils.Guard;

import java.math.BigDecimal;
import java.util.Date;

public final class RawDealBuilder {

    final long id;
    final Date transactionTime;

    String product;
    Date valueDate;

    String primaryCcy;
    String secondaryCcy;

    BigDecimal primaryAmt;
    BigDecimal secondaryAmt;

    BigDecimal wholesaleSpotRate;
    BigDecimal contractSpotRate;
    BigDecimal wholesaleSwapPoint = BigDecimal.ZERO;
    BigDecimal contractSwapPoint = BigDecimal.ZERO;

    public RawDealBuilder(long id) {
        this.id = id;
        this.transactionTime = new Date();
    }

    public RawDealBuilder product(String product) {
        Guard.notEmpty(product, "product");

        this.product = product;
        return this;
    }

    public RawDealBuilder valueDate(Date valueDate) {
        Guard.notNull(valueDate, "value date");

        this.valueDate = valueDate;
        return this;
    }

    public RawDealBuilder ccy(String primaryCcy, String secondaryCcy) {
        Guard.notEmpty(primaryCcy, "primary currency");
        Guard.notEmpty(secondaryCcy, "secondary currency");

        this.primaryCcy = primaryCcy;
        this.secondaryCcy = secondaryCcy;
        return this;
    }

    public RawDealBuilder amount(BigDecimal primaryAmt, BigDecimal secondaryAmt) {
        Guard.notNull(primaryAmt, "primary amount");
        Guard.notNull(secondaryAmt, "secondary amount");

        this.primaryAmt = primaryAmt;
        this.secondaryAmt = secondaryAmt;
        return this;
    }

    public RawDealBuilder spotRate(BigDecimal wholesaleSpotRate, BigDecimal contractSpotRate) {
        Guard.notNull(wholesaleSpotRate, "wholesale spot rate");
        Guard.notNull(contractSpotRate, "contract spot rate");

        this.wholesaleSpotRate = wholesaleSpotRate;
        this.contractSpotRate = contractSpotRate;
        return this;
    }

    public RawDealBuilder swapPoint(BigDecimal wholesaleSwapPoint, BigDecimal contractSwapPoint) {
        Guard.notNull(wholesaleSwapPoint, "wholesale swap point");
        Guard.notNull(contractSwapPoint, "contract swap point");

        this.wholesaleSwapPoint = wholesaleSwapPoint;
        this.contractSwapPoint = contractSwapPoint;
        return this;
    }

    void validate() {
        Guard.notEmpty(product, "product");
        Guard.notNull(valueDate, "value date");
        Guard.notEmpty(primaryCcy, "primary currency");
        Guard.notEmpty(secondaryCcy, "secondary currency");
        Guard.notNull(primaryAmt, "primary amount");
        Guard.notNull(secondaryAmt, "secondary amount");
        Guard.notNull(wholesaleSpotRate, "wholesale spot rate");
        Guard.notNull(contractSpotRate, "contract spot rate");

        if (!Product.SPT.name().equals(product)) {
            Guard.notNull(wholesaleSwapPoint, "wholesale swap point");
            Guard.notNull(contractSwapPoint, "contract swap point");
        }
    }

}
