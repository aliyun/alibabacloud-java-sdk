// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayUpBandwidthRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpBandwidthWan")
    public Integer upBandwidthWan;

    @NameInMap("UpBandwidth4G")
    public Integer upBandwidth4G;

    public static ModifySmartAccessGatewayUpBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayUpBandwidthRequest self = new ModifySmartAccessGatewayUpBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setUpBandwidthWan(Integer upBandwidthWan) {
        this.upBandwidthWan = upBandwidthWan;
        return this;
    }
    public Integer getUpBandwidthWan() {
        return this.upBandwidthWan;
    }

    public ModifySmartAccessGatewayUpBandwidthRequest setUpBandwidth4G(Integer upBandwidth4G) {
        this.upBandwidth4G = upBandwidth4G;
        return this;
    }
    public Integer getUpBandwidth4G() {
        return this.upBandwidth4G;
    }

}
