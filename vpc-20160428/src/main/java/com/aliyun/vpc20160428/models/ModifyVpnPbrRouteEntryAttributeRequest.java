// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new priority of the policy-based route. Valid values: **1** to **100**.</p>
     * <br>
     * <p>A smaller value indicates a higher priority.</p>
     * <br>
     * <p>If you do not specify this parameter, the priority of the policy-based route is not modified.</p>
     * <br>
     * <p>>  You must specify at least one of **NewPriority** and **NewWeight**.</p>
     */
    @NameInMap("NewPriority")
    public Integer newPriority;

    /**
     * <p>The new weight of the policy-based route. Valid values:</p>
     * <br>
     * <p>*   **100**: The IPsec-VPN connection associated with the policy-based route serves as the active connection.</p>
     * <p>*   **0**: The IPsec-VPN connection associated with the policy-based route serves as the standby connection.</p>
     * <br>
     * <p>If you do not specify this parameter, the weight of the policy-based route is not modified.</p>
     * <br>
     * <p>>  You must specify at least one of **NewPriority** and **NewWeight**.</p>
     */
    @NameInMap("NewWeight")
    public Integer newWeight;

    /**
     * <p>The next hop of the policy-based route.</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The original priority of the policy-based route. Valid values: **1** to **100**.</p>
     * <br>
     * <p>A smaller value indicates a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID of the VPN gateway.</p>
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
     * <p>The destination CIDR block of the policy-based route.</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <p>The source CIDR block of the policy-based route.</p>
     */
    @NameInMap("RouteSource")
    public String routeSource;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The original weight of the policy-based route. Valid values:</p>
     * <br>
     * <p>*   **100**: The IPsec-VPN connection associated with the policy-based route serves as an active connection.</p>
     * <p>*   **0**: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static ModifyVpnPbrRouteEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryAttributeRequest self = new ModifyVpnPbrRouteEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setNewPriority(Integer newPriority) {
        this.newPriority = newPriority;
        return this;
    }
    public Integer getNewPriority() {
        return this.newPriority;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setNewWeight(Integer newWeight) {
        this.newWeight = newWeight;
        return this;
    }
    public Integer getNewWeight() {
        return this.newWeight;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
