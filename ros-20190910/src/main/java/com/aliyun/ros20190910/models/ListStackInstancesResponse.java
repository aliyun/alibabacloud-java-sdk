// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("StackInstances")
    @Validation(required = true)
    public java.util.List<ListStackInstancesResponseStackInstances> stackInstances;

    public static ListStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesResponse self = new ListStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListStackInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackInstancesResponse setStackInstances(java.util.List<ListStackInstancesResponseStackInstances> stackInstances) {
        this.stackInstances = stackInstances;
        return this;
    }
    public java.util.List<ListStackInstancesResponseStackInstances> getStackInstances() {
        return this.stackInstances;
    }

    public static class ListStackInstancesResponseStackInstances extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        @NameInMap("StackDriftStatus")
        @Validation(required = true)
        public String stackDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        public static ListStackInstancesResponseStackInstances build(java.util.Map<String, ?> map) throws Exception {
            ListStackInstancesResponseStackInstances self = new ListStackInstancesResponseStackInstances();
            return TeaModel.build(map, self);
        }

        public ListStackInstancesResponseStackInstances setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackInstancesResponseStackInstances setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackInstancesResponseStackInstances setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackInstancesResponseStackInstances setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStackInstancesResponseStackInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStackInstancesResponseStackInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackInstancesResponseStackInstances setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackInstancesResponseStackInstances setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public ListStackInstancesResponseStackInstances setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

    }

}
