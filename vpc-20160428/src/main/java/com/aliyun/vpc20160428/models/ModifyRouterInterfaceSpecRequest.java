// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the router interface is deployed.</p>
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
     * <p>The ID of the router interface.</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    /**
     * <p>The specification of the router interface. Valid specifications and bandwidth values:</p>
     * <br>
     * <p>*   **Mini.2**: 2 Mbit/s</p>
     * <p>*   **Mini.5**: 5 Mbit/s</p>
     * <p>*   **Small.1**: 10 Mbit/s</p>
     * <p>*   **Small.2**: 20 Mbit/s</p>
     * <p>*   **Small.5**: 50 Mbit/s</p>
     * <p>*   **Middle.1**: 100 Mbit/s</p>
     * <p>*   **Middle.2**: 200 Mbit/s</p>
     * <p>*   **Middle.5**: 500 Mbit/s</p>
     * <p>*   **Large.1**: 1,000 Mbit/s</p>
     * <p>*   **Large.2**: 2,000 Mbit/s</p>
     * <p>*   **Large.5**: 5,000 Mbit/s</p>
     * <p>*   **Xlarge.1**: 10,000 Mbit/s</p>
     * <br>
     * <p>>  When **Role** is set to **AcceptingSide** (acceptor), **Spec** is set to **Negative**.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ModifyRouterInterfaceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecRequest self = new ModifyRouterInterfaceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyRouterInterfaceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRouterInterfaceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouterInterfaceSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRouterInterfaceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouterInterfaceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouterInterfaceSpecRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public ModifyRouterInterfaceSpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
