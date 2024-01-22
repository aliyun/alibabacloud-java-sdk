// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information about the route tables.</p>
     */
    @NameInMap("RouterTableList")
    public DescribeRouteTableListResponseBodyRouterTableList routerTableList;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The key of tag N added to the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
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
         * <p>The type of the cloud resource with which the route table is associated. Valid values:</p>
         * <br>
         * <p>*   **VSwitch**: a vSwitch</p>
         * <p>*   **Gateway**: an IPv4 gateway</p>
         */
        @NameInMap("AssociateType")
        public String associateType;

        /**
         * <p>The time when the route table was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the route table.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The detailed information about the IPv4 gateway.</p>
         */
        @NameInMap("GatewayIds")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeGatewayIds gatewayIds;

        /**
         * <p>The ID of the Alibaba Cloud account to which the route table belongs.</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the resource group to which the route table belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RoutePropagationEnable")
        public Boolean routePropagationEnable;

        /**
         * <p>The ID of the route table.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The name of the route table.</p>
         */
        @NameInMap("RouteTableName")
        public String routeTableName;

        /**
         * <p>The type of the route table. Valid values:</p>
         * <br>
         * <p>*   **Custom**</p>
         * <p>*   **System**</p>
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
         * <p>*   **VRouter**</p>
         * <p>*   **VBR**</p>
         */
        @NameInMap("RouterType")
        public String routerType;

        /**
         * <p>The status of the route table. Valid values:</p>
         * <br>
         * <p>*   **Pending**</p>
         * <p>*   **Available**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag added to the route table.</p>
         */
        @NameInMap("Tags")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags tags;

        /**
         * <p>The information about the vSwitches.</p>
         */
        @NameInMap("VSwitchIds")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds vSwitchIds;

        /**
         * <p>The ID of the VPC to which the route table belongs.</p>
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
