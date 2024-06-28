// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnPbrRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d7d24a21-f4ba-4454-9173-b3****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the policy-based route.</p>
     * <p>The description must be 1 to 100 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The tunneling protocol. Set the value to <strong>Ipsec</strong>.</p>
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
     * <p>The priority of the policy-based route. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * <p>A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>Specifies whether to advertise the policy-based route to a virtual private cloud (VPC) route table. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublishVpc")
    public Boolean publishVpc;

    /**
     * <p>The region ID of the VPN gateway. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The VPN gateway ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1a3kqjiiq9legfx****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The weight of the policy-based route.</p>
     * <p>If you use the same VPN gateway to establish active/standby IPsec-VPN connections, you can configure route weights to specify which connection is active. A value of 100 specifies the active connection, whereas a value of 0 specifies the standby connection.</p>
     * <p>You can configure health checks to automatically check the connectivity of IPsec-VPN connections. If the active connection is down, the standby connection automatically takes over. For more information, see <a href="https://help.aliyun.com/document_detail/120391.html">CreateVpnConnection</a>.</p>
     * <ul>
     * <li><strong>100</strong>: The IPsec-VPN connection associated with the policy-based route serves as an active connection.</li>
     * <li><strong>0</strong>: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify active/standby IPsec-VPN connections, the active policy-based route and the standby policy-based route must have the same source and destination CIDR blocks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static CreateVpnPbrRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnPbrRouteEntryRequest self = new CreateVpnPbrRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpnPbrRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpnPbrRouteEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpnPbrRouteEntryRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVpnPbrRouteEntryRequest setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVpnPbrRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpnPbrRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpnPbrRouteEntryRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateVpnPbrRouteEntryRequest setPublishVpc(Boolean publishVpc) {
        this.publishVpc = publishVpc;
        return this;
    }
    public Boolean getPublishVpc() {
        return this.publishVpc;
    }

    public CreateVpnPbrRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpnPbrRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpnPbrRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpnPbrRouteEntryRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVpnPbrRouteEntryRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public CreateVpnPbrRouteEntryRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public CreateVpnPbrRouteEntryRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
