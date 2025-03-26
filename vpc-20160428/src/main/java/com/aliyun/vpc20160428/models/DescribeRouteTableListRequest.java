// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the returned page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the VPC to which the route table belongs.</p>
     * <p>You can call <a href="https://www.alibabacloud.com/help/vpc/developer-reference/api-vpc-2016-04-28-describeregions">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
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
     * <p>The ID of the route table.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp145q7glnuzdvzu2****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The name of the route table.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("RouteTableName")
    public String routeTableName;

    /**
     * <p>The type of the route table.</p>
     * <ul>
     * <li><strong>System</strong></li>
     * <li><strong>Custom</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("RouteTableType")
    public String routeTableType;

    /**
     * <p>The ID of vRouter to which the route table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1lhl0taikrteen8****</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The type of the router to which the route table belongs. Valid value:</p>
     * <ul>
     * <li><strong>VRouter</strong> (default): a vRouter</li>
     * <li><strong>VBR</strong>: a VBR</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VRouter</p>
     */
    @NameInMap("RouterType")
    public String routerType;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeRouteTableListRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the route table belongs. </p>
     * <p>When this parameter is set, the value of <strong>RouterType</strong> is automatically assigned to <strong>VRouter</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRouteTableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListRequest self = new DescribeRouteTableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRouteTableListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRouteTableListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTableListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTableListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRouteTableListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRouteTableListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRouteTableListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRouteTableListRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DescribeRouteTableListRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public DescribeRouteTableListRequest setRouteTableType(String routeTableType) {
        this.routeTableType = routeTableType;
        return this;
    }
    public String getRouteTableType() {
        return this.routeTableType;
    }

    public DescribeRouteTableListRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeRouteTableListRequest setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public DescribeRouteTableListRequest setTag(java.util.List<DescribeRouteTableListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeRouteTableListRequestTag> getTag() {
        return this.tag;
    }

    public DescribeRouteTableListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeRouteTableListRequestTag extends TeaModel {
        /**
         * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRouteTableListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListRequestTag self = new DescribeRouteTableListRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouteTableListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
