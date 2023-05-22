// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateGlobalAccelerationInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backend server.</p>
     */
    @NameInMap("BackendServerId")
    public String backendServerId;

    /**
     * <p>The region of the backend server. The region must belong to the service area of the GA instance.</p>
     */
    @NameInMap("BackendServerRegionId")
    public String backendServerRegionId;

    /**
     * <p>The backend server type. Valid values:</p>
     * <br>
     * <p>*   **EcsInstance** (default): ECS instance</p>
     * <p>*   **SlbInstance**: SLB instance</p>
     */
    @NameInMap("BackendServerType")
    public String backendServerType;

    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the GA instance. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AssociateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateGlobalAccelerationInstanceRequest self = new AssociateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AssociateGlobalAccelerationInstanceRequest setBackendServerId(String backendServerId) {
        this.backendServerId = backendServerId;
        return this;
    }
    public String getBackendServerId() {
        return this.backendServerId;
    }

    public AssociateGlobalAccelerationInstanceRequest setBackendServerRegionId(String backendServerRegionId) {
        this.backendServerRegionId = backendServerRegionId;
        return this;
    }
    public String getBackendServerRegionId() {
        return this.backendServerRegionId;
    }

    public AssociateGlobalAccelerationInstanceRequest setBackendServerType(String backendServerType) {
        this.backendServerType = backendServerType;
        return this;
    }
    public String getBackendServerType() {
        return this.backendServerType;
    }

    public AssociateGlobalAccelerationInstanceRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public AssociateGlobalAccelerationInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociateGlobalAccelerationInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateGlobalAccelerationInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateGlobalAccelerationInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateGlobalAccelerationInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
