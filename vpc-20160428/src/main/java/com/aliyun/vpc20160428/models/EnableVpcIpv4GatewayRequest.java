// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcIpv4GatewayRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of route tables. The system adds a 0.0.0.0/0 route that points to the IPv4 gateway to the route tables. The system supports at most 10 route tables.</p>
     * <br>
     * <p>>  The route table and the IPv4 gateway must belong to the same virtual private cloud (VPC).</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the API request. After the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouteTableList")
    public java.util.List<String> routeTableList;

    public static EnableVpcIpv4GatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcIpv4GatewayRequest self = new EnableVpcIpv4GatewayRequest();
        return TeaModel.build(map, self);
    }

    public EnableVpcIpv4GatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableVpcIpv4GatewayRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableVpcIpv4GatewayRequest setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    public EnableVpcIpv4GatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableVpcIpv4GatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableVpcIpv4GatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableVpcIpv4GatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableVpcIpv4GatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableVpcIpv4GatewayRequest setRouteTableList(java.util.List<String> routeTableList) {
        this.routeTableList = routeTableList;
        return this;
    }
    public java.util.List<String> getRouteTableList() {
        return this.routeTableList;
    }

}
