// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateCommodityOrderShrinkRequest extends TeaModel {
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
    public String componentsShrink;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderParams")
    public String orderParamsShrink;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("SpecCode")
    public String specCode;

    public static CreateCommodityOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommodityOrderShrinkRequest self = new CreateCommodityOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommodityOrderShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateCommodityOrderShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCommodityOrderShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommodityOrderShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateCommodityOrderShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public CreateCommodityOrderShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateCommodityOrderShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCommodityOrderShrinkRequest setOrderParamsShrink(String orderParamsShrink) {
        this.orderParamsShrink = orderParamsShrink;
        return this;
    }
    public String getOrderParamsShrink() {
        return this.orderParamsShrink;
    }

    public CreateCommodityOrderShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateCommodityOrderShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateCommodityOrderShrinkRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateCommodityOrderShrinkRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

}
