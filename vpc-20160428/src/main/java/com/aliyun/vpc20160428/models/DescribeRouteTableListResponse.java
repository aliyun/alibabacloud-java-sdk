// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("RouterTableList")
    @Validation(required = true)
    public DescribeRouteTableListResponseRouterTableList routerTableList;

    public static DescribeRouteTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListResponse self = new DescribeRouteTableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTableListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRouteTableListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRouteTableListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRouteTableListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTableListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTableListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteTableListResponse setRouterTableList(DescribeRouteTableListResponseRouterTableList routerTableList) {
        this.routerTableList = routerTableList;
        return this;
    }
    public DescribeRouteTableListResponseRouterTableList getRouterTableList() {
        return this.routerTableList;
    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag self = new DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag> tag;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags self = new DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags setTag(java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListTypeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds self = new DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeRouteTableListResponseRouterTableListRouterTableListType extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RouterType")
        @Validation(required = true)
        public String routerType;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableName")
        @Validation(required = true)
        public String routeTableName;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags tags;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds vSwitchIds;

        public static DescribeRouteTableListResponseRouterTableListRouterTableListType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableListRouterTableListType self = new DescribeRouteTableListResponseRouterTableListRouterTableListType();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setRouteTableName(String routeTableName) {
            this.routeTableName = routeTableName;
            return this;
        }
        public String getRouteTableName() {
            return this.routeTableName;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setTags(DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeTags getTags() {
            return this.tags;
        }

        public DescribeRouteTableListResponseRouterTableListRouterTableListType setVSwitchIds(DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeRouteTableListResponseRouterTableListRouterTableListTypeVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class DescribeRouteTableListResponseRouterTableList extends TeaModel {
        @NameInMap("RouterTableListType")
        @Validation(required = true)
        public java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListType> routerTableListType;

        public static DescribeRouteTableListResponseRouterTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseRouterTableList self = new DescribeRouteTableListResponseRouterTableList();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseRouterTableList setRouterTableListType(java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListType> routerTableListType) {
            this.routerTableListType = routerTableListType;
            return this;
        }
        public java.util.List<DescribeRouteTableListResponseRouterTableListRouterTableListType> getRouterTableListType() {
            return this.routerTableListType;
        }

    }

}
