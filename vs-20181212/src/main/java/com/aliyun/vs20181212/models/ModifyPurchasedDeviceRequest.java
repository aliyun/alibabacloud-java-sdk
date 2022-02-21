// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyPurchasedDeviceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegisterCode")
    public String registerCode;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("Vendor")
    public String vendor;

    public static ModifyPurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPurchasedDeviceRequest self = new ModifyPurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPurchasedDeviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPurchasedDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPurchasedDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPurchasedDeviceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyPurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPurchasedDeviceRequest setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public ModifyPurchasedDeviceRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ModifyPurchasedDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
