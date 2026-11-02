// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTablesWithVpcGatewayEndpointRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a check request and does not associate route tables. The check items include whether the AccessKey pair is valid, whether the RAM user has the required authorization, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the check succeeds, a 2xx HTTP status code is returned and the system associates the route tables.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the gateway endpoint instance with which you want to associate route tables.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpce-m5e371h5clm3uadih****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the gateway endpoint with which you want to associate route tables.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain region IDs.</p>
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
     * <p>The IDs of the route tables that you want to associate. Valid values of <strong>N</strong>: <strong>1</strong> to <strong>20</strong>. You can associate up to 20 route tables at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-m5elgtm3aj586iitr****</p>
     */
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
