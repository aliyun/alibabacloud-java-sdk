// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTableEntryAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the gateway route table.</p>
     * <p>The description must be 2 to 256 characters in length, and must start with a letter or a Chinese character. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block of the route in the gateway route table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX/16</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run and does not modify the gateway route table. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the gateway route table is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the gateway route table to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-5ts0ohchwkp3dydt2****</p>
     */
    @NameInMap("GatewayRouteTableId")
    public String gatewayRouteTableId;

    /**
     * <p>The ID of the gateway route table to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-5ts0ohchwkp3dydt2****</p>
     */
    @NameInMap("IPv4GatewayRouteTableId")
    public String IPv4GatewayRouteTableId;

    /**
     * <p>The name of the gateway route table.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance ID of the next hop to be modified.</p>
     * <ul>
     * <li>If <strong>NextHopType</strong> is set to <strong>Instance</strong>, <strong>NextHopId</strong> is the ID of the ECS instance.</li>
     * <li>If <strong>NextHopType</strong> is set to <strong>NetworkInterface</strong>, <strong>NextHopId</strong> is the ID of the elastic network interface controller (NIC).</li>
     * <li>If <strong>NextHopType</strong> is set to <strong>Local</strong>, <strong>NextHopId</strong> is empty, which indicates local.</li>
     * </ul>
     * <blockquote>
     * <p>If the next hop type of the routing entry is <strong>Instance</strong> or <strong>NetworkInterface</strong> and you want to modify the next hop, you must first change <strong>NextHopType</strong> to <strong>Local</strong>, and then change <strong>NextHopType</strong> back to <strong>Instance</strong> or <strong>NetworkInterface</strong> before modifying the specific <strong>NextHopId</strong>. You cannot directly change the next hop from an elastic network interface controller (NIC) or an ECS instance to another elastic network interface controller (NIC) or ECS instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bp18xq9yguxoxe7m****</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The next hop type of the routing entry to be modified. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong>: an ECS instance.</p>
     * </li>
     * <li><p><strong>NetworkInterface</strong>: an elastic network interface controller (NIC).</p>
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
     * <p>The region ID of the gateway route table to be modified.</p>
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
