// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page during paging. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the VPC to which the route table belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-6</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the route table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the route table to query.</p>
     * <blockquote>
     * <p>You must specify at least one of the following parameters: VRouterId, RouteTableId, RouterId, and RouteTableName. You cannot specify both VRouterId and RouterId at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp145q7glnuzdvzu2****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The name of the route table to query.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>You must specify at least one of the following parameters: VRouterId, RouteTableId, RouterId, and RouteTableName. You cannot specify both VRouterId and RouterId at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("RouteTableName")
    public String routeTableName;

    /**
     * <p>The ID of the router to which the route table belongs.</p>
     * <blockquote>
     * <p>You must specify at least one of the following parameters: VRouterId, RouteTableId, RouterId, and RouteTableName. You cannot specify both VRouterId and RouterId at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1lhl0taikrteen8****</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The type of the router to which the route table belongs. Valid values:</p>
     * <ul>
     * <li><strong>VRouter</strong> (default): vRouter.</li>
     * <li><strong>VBR</strong>: Virtual Border Router.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VRouter</p>
     */
    @NameInMap("RouterType")
    public String routerType;

    /**
     * <p>The destination type of the route to query. Valid values:</p>
     * <ul>
     * <li><strong>Custom</strong>: custom route.</li>
     * <li><strong>System</strong>: system route.</li>
     * <li><strong>BGP</strong>: BGP route.</li>
     * <li><strong>CEN</strong>: Cloud Enterprise Network (CEN) route.</li>
     * <li><strong>ECR</strong>: Express Connect Router (ECR) route.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the vRouter to query.</p>
     * <blockquote>
     * <p>You must specify at least one of the following parameters: VRouterId, RouteTableId, RouterId, and RouteTableName. You cannot specify both VRouterId and RouterId at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1lhl0taikrteen****</p>
     */
    @NameInMap("VRouterId")
    public String VRouterId;

    public static DescribeRouteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesRequest self = new DescribeRouteTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRouteTablesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRouteTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRouteTablesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRouteTablesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRouteTablesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRouteTablesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DescribeRouteTablesRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public DescribeRouteTablesRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeRouteTablesRequest setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public DescribeRouteTablesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeRouteTablesRequest setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

}
