// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGApiUnsupportedFeatureRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("OpenApiName")
    public String openApiName;

    public static ListSmartAGApiUnsupportedFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGApiUnsupportedFeatureRequest self = new ListSmartAGApiUnsupportedFeatureRequest();
        return TeaModel.build(map, self);
    }

    public ListSmartAGApiUnsupportedFeatureRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ListSmartAGApiUnsupportedFeatureRequest setOpenApiName(String openApiName) {
        this.openApiName = openApiName;
        return this;
    }
    public String getOpenApiName() {
        return this.openApiName;
    }

}
