// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateImageOrderRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("BuyerType")
    public String buyerType;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("GoodsId")
    public String goodsId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("Token")
    public String token;

    /**
     * <p>type</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateImageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageOrderRequest self = new CreateImageOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageOrderRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateImageOrderRequest setBuyerType(String buyerType) {
        this.buyerType = buyerType;
        return this;
    }
    public String getBuyerType() {
        return this.buyerType;
    }

    public CreateImageOrderRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateImageOrderRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateImageOrderRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public CreateImageOrderRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public CreateImageOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateImageOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateImageOrderRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public CreateImageOrderRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateImageOrderRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
