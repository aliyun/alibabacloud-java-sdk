// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddGlobalAccelerationInstanceIpRequest extends TeaModel {
    /**
     * <p>The instance ID of the Internet Shared Bandwidth instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-Ldefrgbttnyyf****</p>
     */
    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    /**
     * <p>The ID of the EIP instance. You can call <a href="https://help.aliyun.com/document_detail/36018.html">DescribeEipAddresses</a> to query the EIP instance ID. </p>
     * <blockquote>
     * <p>Make sure that the billing method of the EIP is pay-as-you-go and the EIP resides in the same region as the Internet Shared Bandwidth instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-rw434rwfdeaf****</p>
     */
    @NameInMap("IpInstanceId")
    public String ipInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the Internet Shared Bandwidth instance resides. </p>
     * <p>You can call <strong>DescribeRegions</strong> to query the region ID.</p>
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

    public static AddGlobalAccelerationInstanceIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGlobalAccelerationInstanceIpRequest self = new AddGlobalAccelerationInstanceIpRequest();
        return TeaModel.build(map, self);
    }

    public AddGlobalAccelerationInstanceIpRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public AddGlobalAccelerationInstanceIpRequest setIpInstanceId(String ipInstanceId) {
        this.ipInstanceId = ipInstanceId;
        return this;
    }
    public String getIpInstanceId() {
        return this.ipInstanceId;
    }

    public AddGlobalAccelerationInstanceIpRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddGlobalAccelerationInstanceIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddGlobalAccelerationInstanceIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddGlobalAccelerationInstanceIpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddGlobalAccelerationInstanceIpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
