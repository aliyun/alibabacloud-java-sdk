// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushExtraTradeDetailRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CommodityId")
    public String commodityId;

    @NameInMap("CommodityName")
    public String commodityName;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("SalePrice")
    public Float salePrice;

    @NameInMap("TradePrice")
    public Float tradePrice;

    @NameInMap("TradeStatus")
    public Integer tradeStatus;

    @NameInMap("TradeTime")
    public Long tradeTime;

    public static PushExtraTradeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PushExtraTradeDetailRequest self = new PushExtraTradeDetailRequest();
        return TeaModel.build(map, self);
    }

    public PushExtraTradeDetailRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushExtraTradeDetailRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

    public PushExtraTradeDetailRequest setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public PushExtraTradeDetailRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PushExtraTradeDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PushExtraTradeDetailRequest setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
        return this;
    }
    public Float getSalePrice() {
        return this.salePrice;
    }

    public PushExtraTradeDetailRequest setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public PushExtraTradeDetailRequest setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public Integer getTradeStatus() {
        return this.tradeStatus;
    }

    public PushExtraTradeDetailRequest setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public Long getTradeTime() {
        return this.tradeTime;
    }

}
