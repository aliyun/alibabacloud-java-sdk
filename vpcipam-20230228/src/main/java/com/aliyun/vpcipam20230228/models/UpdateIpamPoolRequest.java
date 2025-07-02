// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolRequest extends TeaModel {
    /**
     * <p>The new default network mask for the IPAM pool.</p>
     * <p>The mask must be <strong>0 to 32</strong> bits in length.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("AllocationDefaultCidrMask")
    public Integer allocationDefaultCidrMask;

    /**
     * <p>The new maximum network mask for the IPAM pool.</p>
     * <p>The mask must be <strong>0 to 32</strong> bits in length.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("AllocationMaxCidrMask")
    public Integer allocationMaxCidrMask;

    /**
     * <p>The new minimum network mask for the IPAM pool.</p>
     * <p>The mask must be <strong>0 to 32</strong> bits in length.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("AllocationMinCidrMask")
    public Integer allocationMinCidrMask;

    /**
     * <p>Whether the pool has the auto-import feature enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoImport")
    public Boolean autoImport;

    /**
     * <p>Specifies whether to delete the default network mask for the IPAM pool. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ClearAllocationDefaultCidrMask")
    public Boolean clearAllocationDefaultCidrMask;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The new description of the IPAM pool.</p>
     * <p>It must be 2 to 268 characters in length. It must start with a letter but cannot start with a <code>http://</code> or <code>https://</code>. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamPoolDescription")
    public String ipamPoolDescription;

    /**
     * <p>The ID of the IPAM pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>The new name of the IPAM pool.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
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
     * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public UpdateIpamPoolRequest setAutoImport(Boolean autoImport) {
        this.autoImport = autoImport;
        return this;
    }
    public Boolean getAutoImport() {
        return this.autoImport;
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
