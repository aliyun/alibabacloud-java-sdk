// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolRequest extends TeaModel {
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
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamPoolDescription")
    public String ipamPoolDescription;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("IpamPoolName")
    public String ipamPoolName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-scope-glfmcyldpm8lsy****</p>
     */
    @NameInMap("IpamScopeId")
    public String ipamScopeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PoolRegionId")
    public String poolRegionId;

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

    /**
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("SourceIpamPoolId")
    public String sourceIpamPoolId;

    public static CreateIpamPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolRequest self = new CreateIpamPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolRequest setAllocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
        this.allocationDefaultCidrMask = allocationDefaultCidrMask;
        return this;
    }
    public Integer getAllocationDefaultCidrMask() {
        return this.allocationDefaultCidrMask;
    }

    public CreateIpamPoolRequest setAllocationMaxCidrMask(Integer allocationMaxCidrMask) {
        this.allocationMaxCidrMask = allocationMaxCidrMask;
        return this;
    }
    public Integer getAllocationMaxCidrMask() {
        return this.allocationMaxCidrMask;
    }

    public CreateIpamPoolRequest setAllocationMinCidrMask(Integer allocationMinCidrMask) {
        this.allocationMinCidrMask = allocationMinCidrMask;
        return this;
    }
    public Integer getAllocationMinCidrMask() {
        return this.allocationMinCidrMask;
    }

    public CreateIpamPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamPoolRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateIpamPoolRequest setIpamPoolDescription(String ipamPoolDescription) {
        this.ipamPoolDescription = ipamPoolDescription;
        return this;
    }
    public String getIpamPoolDescription() {
        return this.ipamPoolDescription;
    }

    public CreateIpamPoolRequest setIpamPoolName(String ipamPoolName) {
        this.ipamPoolName = ipamPoolName;
        return this;
    }
    public String getIpamPoolName() {
        return this.ipamPoolName;
    }

    public CreateIpamPoolRequest setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
        return this;
    }
    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    public CreateIpamPoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIpamPoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpamPoolRequest setPoolRegionId(String poolRegionId) {
        this.poolRegionId = poolRegionId;
        return this;
    }
    public String getPoolRegionId() {
        return this.poolRegionId;
    }

    public CreateIpamPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpamPoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpamPoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpamPoolRequest setSourceIpamPoolId(String sourceIpamPoolId) {
        this.sourceIpamPoolId = sourceIpamPoolId;
        return this;
    }
    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

}
