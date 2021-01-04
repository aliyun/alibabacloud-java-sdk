// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyClientUserDNSRequest extends TeaModel {
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

    @NameInMap("AppDNS")
    public java.util.List<String> appDNS;

    @NameInMap("RecoveredDNS")
    public java.util.List<String> recoveredDNS;

    public static ModifyClientUserDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDNSRequest self = new ModifyClientUserDNSRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDNSRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyClientUserDNSRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyClientUserDNSRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyClientUserDNSRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyClientUserDNSRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyClientUserDNSRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifyClientUserDNSRequest setAppDNS(java.util.List<String> appDNS) {
        this.appDNS = appDNS;
        return this;
    }
    public java.util.List<String> getAppDNS() {
        return this.appDNS;
    }

    public ModifyClientUserDNSRequest setRecoveredDNS(java.util.List<String> recoveredDNS) {
        this.recoveredDNS = recoveredDNS;
        return this;
    }
    public java.util.List<String> getRecoveredDNS() {
        return this.recoveredDNS;
    }

}
