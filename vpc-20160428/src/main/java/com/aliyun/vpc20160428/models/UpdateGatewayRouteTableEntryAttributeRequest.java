// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTableEntryAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the gateway route table.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block of the route entry in the gateway route table.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to precheck only this request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without modifying the gateway route table. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. This is the default value. If the request passes the precheck, a 2xx HTTP status code is returned and the gateway route table is modified.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the gateway route table that you want to modify.</p>
     */
    @NameInMap("IPv4GatewayRouteTableId")
    public String IPv4GatewayRouteTableId;

    /**
     * <p>The name of the gateway route table.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letter, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The new next hop ID of the route entry.</p>
     * <br>
     * <p>*   If you set **NextHopType** to **Instance**, specify an ECS instance ID for **NextHopId**.</p>
     * <p>*   If you set **NextHopType** to **NetworkInterface**, specify an ENI ID for **NextHopId**.</p>
     * <p>*   If you set **NextHopType** to **Local**, leave **NextHopId** empty. This indicates a local next hop.</p>
     * <br>
     * <p>>  If the value of NextHopType is **Instance** or **NetworkInterface**, and you want to modify the next hop, you must set **NextHopType** to **Local** first. Then, set **NextHopType** to **Instance** or **NetworkInterface** and specify **NextHopId** based on your requirements. If the next hop type of a route entry is Instance or NetworkInterface, you cannot directly specify a different ENI ID or ECS instance ID for the NextHopId parameter.</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The new next hop type of the route entry. Valid values:</p>
     * <br>
     * <p>*   **EcsInstance**: an Elastic Compute Service (ECS) instance.</p>
     * <p>*   **NetworkInterface**: an elastic network interface (ENI).</p>
     * <p>*   **Local**: a local next hop.</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the gateway route table that you want to modify belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
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
