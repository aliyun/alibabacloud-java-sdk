// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterPriceDTO extends TeaModel {
    // code
    @NameInMap("code")
    public String code;

    // currency
    @NameInMap("currency")
    public String currency;

    // discountAmount
    @NameInMap("discountAmount")
    public Double discountAmount;

    // handlingFeeAmount
    @NameInMap("handlingFeeAmount")
    public Double handlingFeeAmount;

    // message
    @NameInMap("message")
    public String message;

    // originalAmount
    @NameInMap("originalAmount")
    public Double originalAmount;

    // product
    @NameInMap("product")
    public String product;

    // riCycleAmount
    @NameInMap("riCycleAmount")
    public Double riCycleAmount;

    // ruleIds
    @NameInMap("ruleIds")
    public java.util.List<Long> ruleIds;

    // taxAmount
    @NameInMap("taxAmount")
    public Double taxAmount;

    // tradeAmount
    @NameInMap("tradeAmount")
    public Double tradeAmount;

    public static ClusterPriceDTO build(java.util.Map<String, ?> map) throws Exception {
        ClusterPriceDTO self = new ClusterPriceDTO();
        return TeaModel.build(map, self);
    }

    public ClusterPriceDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClusterPriceDTO setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ClusterPriceDTO setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public Double getDiscountAmount() {
        return this.discountAmount;
    }

    public ClusterPriceDTO setHandlingFeeAmount(Double handlingFeeAmount) {
        this.handlingFeeAmount = handlingFeeAmount;
        return this;
    }
    public Double getHandlingFeeAmount() {
        return this.handlingFeeAmount;
    }

    public ClusterPriceDTO setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClusterPriceDTO setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public Double getOriginalAmount() {
        return this.originalAmount;
    }

    public ClusterPriceDTO setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ClusterPriceDTO setRiCycleAmount(Double riCycleAmount) {
        this.riCycleAmount = riCycleAmount;
        return this;
    }
    public Double getRiCycleAmount() {
        return this.riCycleAmount;
    }

    public ClusterPriceDTO setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    public ClusterPriceDTO setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public ClusterPriceDTO setTradeAmount(Double tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public Double getTradeAmount() {
        return this.tradeAmount;
    }

}
