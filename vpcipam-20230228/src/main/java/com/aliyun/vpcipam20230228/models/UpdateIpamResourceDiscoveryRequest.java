// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamResourceDiscoveryRequest extends TeaModel {
    @NameInMap("AddOperatingRegion")
    public java.util.List<String> addOperatingRegion;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamResourceDiscoveryDescription")
    public String ipamResourceDiscoveryDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
     */
    @NameInMap("IpamResourceDiscoveryId")
    public String ipamResourceDiscoveryId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamResourceDiscoveryName")
    public String ipamResourceDiscoveryName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveOperatingRegion")
    public java.util.List<String> removeOperatingRegion;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateIpamResourceDiscoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamResourceDiscoveryRequest self = new UpdateIpamResourceDiscoveryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpamResourceDiscoveryRequest setAddOperatingRegion(java.util.List<String> addOperatingRegion) {
        this.addOperatingRegion = addOperatingRegion;
        return this;
    }
    public java.util.List<String> getAddOperatingRegion() {
        return this.addOperatingRegion;
    }

    public UpdateIpamResourceDiscoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpamResourceDiscoveryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpamResourceDiscoveryRequest setIpamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
        this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
        return this;
    }
    public String getIpamResourceDiscoveryDescription() {
        return this.ipamResourceDiscoveryDescription;
    }

    public UpdateIpamResourceDiscoveryRequest setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
        return this;
    }
    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    public UpdateIpamResourceDiscoveryRequest setIpamResourceDiscoveryName(String ipamResourceDiscoveryName) {
        this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
        return this;
    }
    public String getIpamResourceDiscoveryName() {
        return this.ipamResourceDiscoveryName;
    }

    public UpdateIpamResourceDiscoveryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateIpamResourceDiscoveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateIpamResourceDiscoveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIpamResourceDiscoveryRequest setRemoveOperatingRegion(java.util.List<String> removeOperatingRegion) {
        this.removeOperatingRegion = removeOperatingRegion;
        return this;
    }
    public java.util.List<String> getRemoveOperatingRegion() {
        return this.removeOperatingRegion;
    }

    public UpdateIpamResourceDiscoveryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateIpamResourceDiscoveryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
