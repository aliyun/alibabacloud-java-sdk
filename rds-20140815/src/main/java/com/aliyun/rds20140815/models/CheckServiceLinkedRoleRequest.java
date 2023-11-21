// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>>  You can specify any region for this parameter, which does not affect your query results. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The SLR name.</p>
     * <br>
     * <p>>  For more information about the SLRs supported by ApsaraDB RDS, see [Service-linked roles](~~342840~~).</p>
     */
    @NameInMap("ServiceLinkedRole")
    public String serviceLinkedRole;

    public static CheckServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleRequest self = new CheckServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckServiceLinkedRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckServiceLinkedRoleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CheckServiceLinkedRoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckServiceLinkedRoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckServiceLinkedRoleRequest setServiceLinkedRole(String serviceLinkedRole) {
        this.serviceLinkedRole = serviceLinkedRole;
        return this;
    }
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

}
