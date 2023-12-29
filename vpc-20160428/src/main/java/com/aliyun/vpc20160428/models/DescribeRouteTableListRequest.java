// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the VPC to which the route table belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the route table to be queried belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the route table that you want to query.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The name of the route table that you want to query.</p>
     */
    @NameInMap("RouteTableName")
    public String routeTableName;

    /**
     * <p>The type of the route table. Valid values:</p>
     * <p>- **System**</p>
     * <p>- **Custom**</p>
     */
    @NameInMap("RouteTableType")
    public String routeTableType;

    /**
     * <p>The ID of the router to which the route table belongs.</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The type of the router to which the route table belongs. Valid values:</p>
     * <br>
     * <p>*   **VRouter** (default)</p>
     * <p>*   **VBR**</p>
     */
    @NameInMap("RouterType")
    public String routerType;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeRouteTableListRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the route table belongs.</p>
     * <br>
     * <p>After this parameter is specified, the value of the **RouterType** parameter is automatically set to **VRouter**.</p>
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
         * <p>The key of tag N to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length. It cannot start with `aliyun` or `acs:` and cannot contain `http://` or `https://`.</p>
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
