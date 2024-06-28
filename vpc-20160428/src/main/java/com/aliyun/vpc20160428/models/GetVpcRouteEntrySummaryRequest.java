// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcRouteEntrySummaryRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the route table.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The type of the route. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all route types</li>
     * <li><strong>Custom</strong>: a custom route</li>
     * <li><strong>System</strong>: a system route</li>
     * <li><strong>BGP</strong>: a BGP route</li>
     * <li><strong>CEN</strong>: a Cloud Enterprise Network (CEN) route</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("RouteEntryType")
    public String routeEntryType;

    /**
     * <p>The ID of the route table that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp145q7glnuzdvzu2****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the route table belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetVpcRouteEntrySummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpcRouteEntrySummaryRequest self = new GetVpcRouteEntrySummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetVpcRouteEntrySummaryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetVpcRouteEntrySummaryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetVpcRouteEntrySummaryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpcRouteEntrySummaryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetVpcRouteEntrySummaryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetVpcRouteEntrySummaryRequest setRouteEntryType(String routeEntryType) {
        this.routeEntryType = routeEntryType;
        return this;
    }
    public String getRouteEntryType() {
        return this.routeEntryType;
    }

    public GetVpcRouteEntrySummaryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public GetVpcRouteEntrySummaryRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
