// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushTradeDetailRequest extends TeaModel {
    @NameInMap("AlipayOrderId")
    public String alipayOrderId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CommodityId")
    public String commodityId;

    @NameInMap("CommodityName")
    public String commodityName;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OuterTradeId")
    public String outerTradeId;

    @NameInMap("SalePrice")
    public Float salePrice;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TradeOrderId")
    public String tradeOrderId;

    @NameInMap("TradePrice")
    public Float tradePrice;

    @NameInMap("TradeStatus")
    public Integer tradeStatus;

    @NameInMap("TradeTime")
    public Long tradeTime;

    @NameInMap("VerificationStatus")
    public Integer verificationStatus;

    public static PushTradeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTradeDetailRequest self = new PushTradeDetailRequest();
        return TeaModel.build(map, self);
    }

    public PushTradeDetailRequest setAlipayOrderId(String alipayOrderId) {
        this.alipayOrderId = alipayOrderId;
        return this;
    }
    public String getAlipayOrderId() {
        return this.alipayOrderId;
    }

    public PushTradeDetailRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushTradeDetailRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

    public PushTradeDetailRequest setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public PushTradeDetailRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PushTradeDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public PushTradeDetailRequest setOuterTradeId(String outerTradeId) {
        this.outerTradeId = outerTradeId;
        return this;
    }
    public String getOuterTradeId() {
        return this.outerTradeId;
    }

    public PushTradeDetailRequest setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
        return this;
    }
    public Float getSalePrice() {
        return this.salePrice;
    }

    public PushTradeDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public PushTradeDetailRequest setTradeOrderId(String tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
        return this;
    }
    public String getTradeOrderId() {
        return this.tradeOrderId;
    }

    public PushTradeDetailRequest setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public PushTradeDetailRequest setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public Integer getTradeStatus() {
        return this.tradeStatus;
    }

    public PushTradeDetailRequest setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public Long getTradeTime() {
        return this.tradeTime;
    }

    public PushTradeDetailRequest setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }
    public Integer getVerificationStatus() {
        return this.verificationStatus;
    }

}
