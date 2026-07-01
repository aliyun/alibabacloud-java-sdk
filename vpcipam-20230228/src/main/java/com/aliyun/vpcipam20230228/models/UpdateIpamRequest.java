// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamRequest extends TeaModel {
    @NameInMap("AddOperatingRegion")
    public java.util.List<String> addOperatingRegion;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IpamDescription")
    public String ipamDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    @NameInMap("IpamName")
    public String ipamName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveOperatingRegion")
    public java.util.List<String> removeOperatingRegion;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateIpamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamRequest self = new UpdateIpamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpamRequest setAddOperatingRegion(java.util.List<String> addOperatingRegion) {
        this.addOperatingRegion = addOperatingRegion;
        return this;
    }
    public java.util.List<String> getAddOperatingRegion() {
        return this.addOperatingRegion;
    }

    public UpdateIpamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpamRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpamRequest setIpamDescription(String ipamDescription) {
        this.ipamDescription = ipamDescription;
        return this;
    }
    public String getIpamDescription() {
        return this.ipamDescription;
    }

    public UpdateIpamRequest setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public UpdateIpamRequest setIpamName(String ipamName) {
        this.ipamName = ipamName;
        return this;
    }
    public String getIpamName() {
        return this.ipamName;
    }

    public UpdateIpamRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateIpamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateIpamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIpamRequest setRemoveOperatingRegion(java.util.List<String> removeOperatingRegion) {
        this.removeOperatingRegion = removeOperatingRegion;
        return this;
    }
    public java.util.List<String> getRemoveOperatingRegion() {
        return this.removeOperatingRegion;
    }

    public UpdateIpamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateIpamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
