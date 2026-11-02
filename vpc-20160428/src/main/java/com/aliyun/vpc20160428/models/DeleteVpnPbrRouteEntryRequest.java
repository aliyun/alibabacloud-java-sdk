// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnPbrRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a value for this parameter in your client to ensure that the value is unique across different requests. The client token only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The next hop of the policy-based route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-bp15oes1py4i66rmd****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunneling protocol. Valid value: <strong>Ipsec</strong> (IPsec tunnel).</p>
     * 
     * <strong>example:</strong>
     * <p>Ipsec</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Policy priority of the policy-based route.</p>
     * <ul>
     * <li><p>If the policy-based route does not have a priority configured, you can leave this parameter empty.</p>
     * </li>
     * <li><p>If the policy-based route has a priority configured, you can specify this parameter or leave it empty.</p>
     * <p>  If you specify this parameter, you must set it to policy priority that is already configured for the policy-based route. If you set it to another value, the call to this operation fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID of the VPN gateway instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The destination CIDR block of the policy-based route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <p>The source CIDR block of the policy-based route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("RouteSource")
    public String routeSource;

    /**
     * <p>The VPN gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1a3kqjiiq9legfx****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The weight of the policy-based route.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2526959.html">DescribeVpnPbrRouteEntries</a> operation to query the weight of the policy-based route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static DeleteVpnPbrRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnPbrRouteEntryRequest self = new DeleteVpnPbrRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpnPbrRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVpnPbrRouteEntryRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public DeleteVpnPbrRouteEntryRequest setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public DeleteVpnPbrRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteVpnPbrRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVpnPbrRouteEntryRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DeleteVpnPbrRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVpnPbrRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteVpnPbrRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteVpnPbrRouteEntryRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public DeleteVpnPbrRouteEntryRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public DeleteVpnPbrRouteEntryRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DeleteVpnPbrRouteEntryRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
