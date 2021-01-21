// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Stacks")
    @Validation(required = true)
    public java.util.List<ListStacksResponseStacks> stacks;

    public static ListStacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStacksResponse self = new ListStacksResponse();
        return TeaModel.build(map, self);
    }

    public ListStacksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStacksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStacksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStacksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStacksResponse setStacks(java.util.List<ListStacksResponseStacks> stacks) {
        this.stacks = stacks;
        return this;
    }
    public java.util.List<ListStacksResponseStacks> getStacks() {
        return this.stacks;
    }

    public static class ListStacksResponseStacksTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListStacksResponseStacksTags build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseStacksTags self = new ListStacksResponseStacksTags();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseStacksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListStacksResponseStacksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStacksResponseStacks extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("DisableRollback")
        @Validation(required = true)
        public Boolean disableRollback;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        @NameInMap("TimeoutInMinutes")
        @Validation(required = true)
        public Integer timeoutInMinutes;

        @NameInMap("ParentStackId")
        @Validation(required = true)
        public String parentStackId;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("StackDriftStatus")
        @Validation(required = true)
        public String stackDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        @NameInMap("StackType")
        @Validation(required = true)
        public String stackType;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<ListStacksResponseStacksTags> tags;

        public static ListStacksResponseStacks build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseStacks self = new ListStacksResponseStacks();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseStacks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStacksResponseStacks setDisableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        public ListStacksResponseStacks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStacksResponseStacks setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStacksResponseStacks setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStacksResponseStacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStacksResponseStacks setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStacksResponseStacks setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public ListStacksResponseStacks setParentStackId(String parentStackId) {
            this.parentStackId = parentStackId;
            return this;
        }
        public String getParentStackId() {
            return this.parentStackId;
        }

        public ListStacksResponseStacks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListStacksResponseStacks setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public ListStacksResponseStacks setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStacksResponseStacks setStackType(String stackType) {
            this.stackType = stackType;
            return this;
        }
        public String getStackType() {
            return this.stackType;
        }

        public ListStacksResponseStacks setTags(java.util.List<ListStacksResponseStacksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListStacksResponseStacksTags> getTags() {
            return this.tags;
        }

    }

}
