// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTableEntryAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the gateway route table.</p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block of the route entry in the gateway route table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX/16</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the gateway route table. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the gateway route table is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the gateway route table that you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-5ts0ohchwkp3dydt2****</p>
     */
    @NameInMap("GatewayRouteTableId")
    public String gatewayRouteTableId;

    /**
     * <p>The ID of the gateway route table that you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-5ts0ohchwkp3dydt2****</p>
     */
    @NameInMap("IPv4GatewayRouteTableId")
    public String IPv4GatewayRouteTableId;

    /**
     * <p>The name of the gateway route table.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance ID of the next hop that you want to modify.</p>
     * <ul>
     * <li>If <strong>NextHopType</strong> is set to <strong>Instance</strong>, set <strong>NextHopId</strong> to the ID of the ECS instance.</li>
     * <li>If <strong>NextHopType</strong> is set to <strong>NetworkInterface</strong>, set <strong>NextHopId</strong> to the ID of the elastic network interface (ENI) instance.</li>
     * <li>If <strong>NextHopType</strong> is set to <strong>Local</strong>, leave <strong>NextHopId</strong> empty, which indicates a local next hop.</li>
     * </ul>
     * <blockquote>
     * <p>If the next hop type of the route is <strong>Instance</strong> or <strong>NetworkInterface</strong> and you want to modify the next hop, you must first change <strong>NextHopType</strong> to <strong>Local</strong>, and then change <strong>NextHopType</strong> to <strong>Instance</strong> or <strong>NetworkInterface</strong> and specify the <strong>NextHopId</strong>. You cannot directly change the next hop from one ENI or ECS instance to another ENI or ECS instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bp18xq9yguxoxe7m****</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The next hop type of the route that you want to modify. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong>: ECS instance.</p>
     * </li>
     * <li><p><strong>NetworkInterface</strong>: elastic network interface (ENI) instance.</p>
     * </li>
     * <li><p><strong>Local</strong>: local.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the gateway route table that you want to modify.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-6</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateGatewayRouteTableEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTableEntryAttributeRequest self = new UpdateGatewayRouteTableEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setGatewayRouteTableId(String gatewayRouteTableId) {
        this.gatewayRouteTableId = gatewayRouteTableId;
        return this;
    }
    public String getGatewayRouteTableId() {
        return this.gatewayRouteTableId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setIPv4GatewayRouteTableId(String IPv4GatewayRouteTableId) {
        this.IPv4GatewayRouteTableId = IPv4GatewayRouteTableId;
        return this;
    }
    public String getIPv4GatewayRouteTableId() {
        return this.IPv4GatewayRouteTableId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
