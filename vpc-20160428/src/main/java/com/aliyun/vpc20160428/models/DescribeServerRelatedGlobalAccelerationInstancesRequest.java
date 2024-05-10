// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeServerRelatedGlobalAccelerationInstancesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the GA instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the backend service instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The type of the backend service instance. Valid values:</p>
     * <br>
     * <p>*   **EcsInstance** (default): Elastic Compute Service (ECS)</p>
     * <p>*   **SlbInstance**: Server Load Balancer (SLB)</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    public static DescribeServerRelatedGlobalAccelerationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRelatedGlobalAccelerationInstancesRequest self = new DescribeServerRelatedGlobalAccelerationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

}
