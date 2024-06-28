// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponseBody extends TeaModel {
    /**
     * <p>The ID of the route table.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The type of the cloud resource with which the route table is associated. Valid values:</p>
     * <ul>
     * <li><strong>VSwitch</strong>: vSwitch</li>
     * <li><strong>Gateway</strong>: IPv4 gateway</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the vRouter to which the route table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>DC668356-BCB4-42FD-9BC3-FA2B2E04B634</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the route table.</p>
     */
    @NameInMap("RouterTableList")
    public DescribeRouteTableListResponseBodyRouterTableList routerTableList;

    /**
     * <p>The ID of the Alibaba Cloud account to which the route table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRouteTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListResponseBody self = new DescribeRouteTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTableListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTableListResponseBody setRouterTableList(DescribeRouteTableListResponseBodyRouterTableList routerTableList) {
        this.routerTableList = routerTableList;
        return this;
    }
    public DescribeRouteTableListResponseBodyRouterTableList getRouterTableList() {
        return this.routerTableList;
    }

    public DescribeRouteTableListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds extends TeaModel {
        @NameInMap("GatewayIds")
        public java.util.List<String> gatewayIds;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds setGatewayIds(java.util.List<String> gatewayIds) {
            this.gatewayIds = gatewayIds;
            return this;
        }
        public java.util.List<String> getGatewayIds() {
            return this.gatewayIds;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag> tag;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags setTag(java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListType extends TeaModel {
        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("AssociateType")
        public String associateType;

        /**
         * <p>The type of the router to which the route table belongs. Valid values:</p>
         * <ul>
         * <li><strong>VRouter</strong></li>
         * <li><strong>VBR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-08-22T10:40:25Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about the vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>This is Route Table.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The detailed information about the IPv4 gateway.</p>
         */
        @NameInMap("GatewayIds")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds gatewayIds;

        /**
         * <p>The value of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The detailed information about the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Whether to receive the propagation routes. Valid Values:</p>
         * <ul>
         * <li><p><strong>True</strong>: The propagation route is received.</p>
         * </li>
         * <li><p><strong>False</strong>: The propagation route is not received.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RoutePropagationEnable")
        public Boolean routePropagationEnable;

        /**
         * <p>The key of tag N added to the resource.</p>
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
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("RouteTableType")
        public String routeTableType;

        /**
         * <p>The tag added to the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1lhl0taikrteen8****</p>
         */
        @NameInMap("RouterId")
        public String routerId;

        /**
         * <p>The detailed information about the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>VRouter</p>
         */
        @NameInMap("RouterType")
        public String routerType;

        /**
         * <p>The name of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags tags;

        /**
         * <p>The vSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds vSwitchIds;

        /**
         * <p>The ID of the resource group to which the route table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListType self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListType();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setAssociateType(String associateType) {
            this.associateType = associateType;
            return this;
        }
        public String getAssociateType() {
            return this.associateType;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setGatewayIds(DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds gatewayIds) {
            this.gatewayIds = gatewayIds;
            return this;
        }
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds getGatewayIds() {
            return this.gatewayIds;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRoutePropagationEnable(Boolean routePropagationEnable) {
            this.routePropagationEnable = routePropagationEnable;
            return this;
        }
        public Boolean getRoutePropagationEnable() {
            return this.routePropagationEnable;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouteTableName(String routeTableName) {
            this.routeTableName = routeTableName;
            return this;
        }
        public String getRouteTableName() {
            return this.routeTableName;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setTags(DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags getTags() {
            return this.tags;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setVSwitchIds(DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableList extends TeaModel {
        @NameInMap("RouterTableListType")
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListType> routerTableListType;

        public static DescribeRouteTableListResponseBodyRouterTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableList self = new DescribeRouteTableListResponseBodyRouterTableList();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableList setRouterTableListType(java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListType> routerTableListType) {
            this.routerTableListType = routerTableListType;
            return this;
        }
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListType> getRouterTableListType() {
            return this.routerTableListType;
        }

    }

}
