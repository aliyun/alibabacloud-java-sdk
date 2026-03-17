// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyClientUserDNSRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100.XX.XX.100</p>
     */
    @NameInMap("AppDNS")
    public java.util.List<String> appDNS;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>100.XX.XX.110</p>
     */
    @NameInMap("RecoveredDNS")
    public java.util.List<String> recoveredDNS;

    /**
     * <p>The ID of the region where the SAG app instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SAG app instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-9uyg53s6juhpxv****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static ModifyClientUserDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDNSRequest self = new ModifyClientUserDNSRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDNSRequest setAppDNS(java.util.List<String> appDNS) {
        this.appDNS = appDNS;
        return this;
    }
    public java.util.List<String> getAppDNS() {
        return this.appDNS;
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

    public ModifyClientUserDNSRequest setRecoveredDNS(java.util.List<String> recoveredDNS) {
        this.recoveredDNS = recoveredDNS;
        return this;
    }
    public java.util.List<String> getRecoveredDNS() {
        return this.recoveredDNS;
    }

    public ModifyClientUserDNSRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ModifyClientUserDNSRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
