// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcIpv4GatewayRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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
