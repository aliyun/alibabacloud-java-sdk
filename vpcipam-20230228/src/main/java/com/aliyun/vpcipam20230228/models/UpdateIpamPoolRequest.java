// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("AllocationDefaultCidrMask")
    public Integer allocationDefaultCidrMask;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("AllocationMaxCidrMask")
    public Integer allocationMaxCidrMask;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("AllocationMinCidrMask")
    public Integer allocationMinCidrMask;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ClearAllocationDefaultCidrMask")
    public Boolean clearAllocationDefaultCidrMask;

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
    @NameInMap("IpamPoolDescription")
    public String ipamPoolDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamPoolName")
    public String ipamPoolName;

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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateIpamPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolRequest self = new UpdateIpamPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolRequest setAllocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
        this.allocationDefaultCidrMask = allocationDefaultCidrMask;
        return this;
    }
    public Integer getAllocationDefaultCidrMask() {
        return this.allocationDefaultCidrMask;
    }

    public UpdateIpamPoolRequest setAllocationMaxCidrMask(Integer allocationMaxCidrMask) {
        this.allocationMaxCidrMask = allocationMaxCidrMask;
        return this;
    }
    public Integer getAllocationMaxCidrMask() {
        return this.allocationMaxCidrMask;
    }

    public UpdateIpamPoolRequest setAllocationMinCidrMask(Integer allocationMinCidrMask) {
        this.allocationMinCidrMask = allocationMinCidrMask;
        return this;
    }
    public Integer getAllocationMinCidrMask() {
        return this.allocationMinCidrMask;
    }

    public UpdateIpamPoolRequest setClearAllocationDefaultCidrMask(Boolean clearAllocationDefaultCidrMask) {
        this.clearAllocationDefaultCidrMask = clearAllocationDefaultCidrMask;
        return this;
    }
    public Boolean getClearAllocationDefaultCidrMask() {
        return this.clearAllocationDefaultCidrMask;
    }

    public UpdateIpamPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpamPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpamPoolRequest setIpamPoolDescription(String ipamPoolDescription) {
        this.ipamPoolDescription = ipamPoolDescription;
        return this;
    }
    public String getIpamPoolDescription() {
        return this.ipamPoolDescription;
    }

    public UpdateIpamPoolRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public UpdateIpamPoolRequest setIpamPoolName(String ipamPoolName) {
        this.ipamPoolName = ipamPoolName;
        return this;
    }
    public String getIpamPoolName() {
        return this.ipamPoolName;
    }

    public UpdateIpamPoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateIpamPoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateIpamPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIpamPoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateIpamPoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
