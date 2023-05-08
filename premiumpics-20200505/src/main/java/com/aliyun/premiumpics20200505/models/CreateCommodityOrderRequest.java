// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateCommodityOrderRequest extends TeaModel {
    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Components")
    public java.util.Map<String, ?> components;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderParams")
    public java.util.Map<String, ?> orderParams;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("SpecCode")
    public String specCode;

    public static CreateCommodityOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommodityOrderRequest self = new CreateCommodityOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommodityOrderRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateCommodityOrderRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCommodityOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommodityOrderRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateCommodityOrderRequest setComponents(java.util.Map<String, ?> components) {
        this.components = components;
        return this;
    }
    public java.util.Map<String, ?> getComponents() {
        return this.components;
    }

    public CreateCommodityOrderRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateCommodityOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCommodityOrderRequest setOrderParams(java.util.Map<String, ?> orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public java.util.Map<String, ?> getOrderParams() {
        return this.orderParams;
    }

    public CreateCommodityOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateCommodityOrderRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateCommodityOrderRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateCommodityOrderRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

}
