// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stacks")
    public java.util.List<ListStacksResponseBodyStacks> stacks;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStacksResponseBody self = new ListStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStacksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStacksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStacksResponseBody setStacks(java.util.List<ListStacksResponseBodyStacks> stacks) {
        this.stacks = stacks;
        return this;
    }
    public java.util.List<ListStacksResponseBodyStacks> getStacks() {
        return this.stacks;
    }

    public ListStacksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStacksResponseBodyStacksOperationInfo extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Code")
        public String code;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ListStacksResponseBodyStacksOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacksOperationInfo self = new ListStacksResponseBodyStacksOperationInfo();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacksOperationInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListStacksResponseBodyStacksOperationInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStacksResponseBodyStacksOperationInfo setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStacksResponseBodyStacksOperationInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListStacksResponseBodyStacksOperationInfo setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListStacksResponseBodyStacksOperationInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListStacksResponseBodyStacksTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListStacksResponseBodyStacksTags build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacksTags self = new ListStacksResponseBodyStacksTags();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListStacksResponseBodyStacksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStacksResponseBodyStacks extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("OperationInfo")
        public ListStacksResponseBodyStacksOperationInfo operationInfo;

        @NameInMap("ParentStackId")
        public String parentStackId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("StackType")
        public String stackType;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("Tags")
        public java.util.List<ListStacksResponseBodyStacksTags> tags;

        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListStacksResponseBodyStacks build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacks self = new ListStacksResponseBodyStacks();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStacksResponseBodyStacks setDisableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        public ListStacksResponseBodyStacks setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStacksResponseBodyStacks setOperationInfo(ListStacksResponseBodyStacksOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public ListStacksResponseBodyStacksOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        public ListStacksResponseBodyStacks setParentStackId(String parentStackId) {
            this.parentStackId = parentStackId;
            return this;
        }
        public String getParentStackId() {
            return this.parentStackId;
        }

        public ListStacksResponseBodyStacks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStacksResponseBodyStacks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListStacksResponseBodyStacks setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListStacksResponseBodyStacks setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListStacksResponseBodyStacks setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public ListStacksResponseBodyStacks setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStacksResponseBodyStacks setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStacksResponseBodyStacks setStackType(String stackType) {
            this.stackType = stackType;
            return this;
        }
        public String getStackType() {
            return this.stackType;
        }

        public ListStacksResponseBodyStacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStacksResponseBodyStacks setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStacksResponseBodyStacks setTags(java.util.List<ListStacksResponseBodyStacksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListStacksResponseBodyStacksTags> getTags() {
            return this.tags;
        }

        public ListStacksResponseBodyStacks setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public ListStacksResponseBodyStacks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
