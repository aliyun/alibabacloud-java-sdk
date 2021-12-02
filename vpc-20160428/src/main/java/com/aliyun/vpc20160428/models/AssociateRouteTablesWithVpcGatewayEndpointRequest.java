// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTablesWithVpcGatewayEndpointRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // VPC网关实例ID
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // 路由表列表
    @NameInMap("RouteTableIds")
    public java.util.List<String> routeTableIds;

    public static AssociateRouteTablesWithVpcGatewayEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTablesWithVpcGatewayEndpointRequest self = new AssociateRouteTablesWithVpcGatewayEndpointRequest();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointRequest setRouteTableIds(java.util.List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
        return this;
    }
    public java.util.List<String> getRouteTableIds() {
        return this.routeTableIds;
    }

}
