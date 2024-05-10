// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVcoRouteEntryWeightRequest extends TeaModel {
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
     * <p>The new weight of the destination-based route that you want to modify. Valid values:</p>
     * <br>
     * <p>*   **0**: a low priority</p>
     * <p>*   **100**: a high priority</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewWeight")
    public Integer newWeight;

    /**
     * <p>The next hop of the destination-based route that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunneling protocol. Set the value to **Ipsec**, which specifies the IPsec tunneling protocol.</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    /**
     * <p>The ID of the region where the IPsec-VPN connection is established.</p>
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
     * <p>The destination CIDR block of the destination-based route that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <p>The current weight of the destination-based route that you want to modify. Valid values:</p>
     * <br>
     * <p>*   **0**: a low priority</p>
     * <p>*   **100**: a high priority</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static ModifyVcoRouteEntryWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVcoRouteEntryWeightRequest self = new ModifyVcoRouteEntryWeightRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVcoRouteEntryWeightRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVcoRouteEntryWeightRequest setNewWeight(Integer newWeight) {
        this.newWeight = newWeight;
        return this;
    }
    public Integer getNewWeight() {
        return this.newWeight;
    }

    public ModifyVcoRouteEntryWeightRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ModifyVcoRouteEntryWeightRequest setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public ModifyVcoRouteEntryWeightRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVcoRouteEntryWeightRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVcoRouteEntryWeightRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVcoRouteEntryWeightRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVcoRouteEntryWeightRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public ModifyVcoRouteEntryWeightRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVcoRouteEntryWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
