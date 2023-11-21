// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class MoveVpnResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the new resource group.</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of resource.</p>
     * <br>
     * <p>*   **VpnGateway**: VPN gateway</p>
     * <br>
     * <p>    After you move a VPN gateway to a new resource group, the following associated resources are also moved to the new resource group: IPsec servers, SSL servers, SSL client certificates, and IPsec-VPN connections.</p>
     * <br>
     * <p>*   **CustomerGateway**: customer gateway</p>
     * <br>
     * <p>*   **VpnAttachment**: IPsec-VPN connection</p>
     * <br>
     * <p>    An IPsec-VPN connection associated with a transit router or not associate with a resource.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static MoveVpnResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveVpnResourceGroupRequest self = new MoveVpnResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveVpnResourceGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MoveVpnResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public MoveVpnResourceGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MoveVpnResourceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MoveVpnResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MoveVpnResourceGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MoveVpnResourceGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MoveVpnResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
