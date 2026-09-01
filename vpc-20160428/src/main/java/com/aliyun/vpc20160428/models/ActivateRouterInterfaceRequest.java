// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the router interface.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
     * <p>The ID of the router interface. </p>
     * <blockquote>
     * <p>The ID of the router interface. This operation supports only interfaces in the Inactive state. If the state does not match, the IncorrectRIStatus error is returned. Newly created interfaces are not in the Inactive state and cannot be directly activated: interfaces created in express connect mode are automatically connected and in the Active state. You must first call DeactivateRouterInterface to change them to the Inactive state. Interfaces created in non-express connect mode are in the Idle state. You must first configure peer information and call ConnectRouterInterface to establish the connection to the Active state, and then call DeactivateRouterInterface. State transition: Active --DeactivateRouterInterface--&gt; Inactive --ActivateRouterInterface--&gt; Active. If the interface is in an intermediate state such as Connecting, Activating, or Deactivating, poll DescribeRouterInterfaceAttribute until the state stabilizes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-2zeo3xzyf38r4urz****</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    public static ActivateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceRequest self = new ActivateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public ActivateRouterInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ActivateRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ActivateRouterInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ActivateRouterInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ActivateRouterInterfaceRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
