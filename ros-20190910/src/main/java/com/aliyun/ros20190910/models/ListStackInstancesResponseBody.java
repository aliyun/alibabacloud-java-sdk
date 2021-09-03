// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("StackInstances")
    public java.util.List<ListStackInstancesResponseBodyStackInstances> stackInstances;

    public static ListStackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesResponseBody self = new ListStackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackInstancesResponseBody setStackInstances(java.util.List<ListStackInstancesResponseBodyStackInstances> stackInstances) {
        this.stackInstances = stackInstances;
        return this;
    }
    public java.util.List<ListStackInstancesResponseBodyStackInstances> getStackInstances() {
        return this.stackInstances;
    }

    public static class ListStackInstancesResponseBodyStackInstances extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RdFolderId")
        public String rdFolderId;

        public static ListStackInstancesResponseBodyStackInstances build(java.util.Map<String, ?> map) throws Exception {
            ListStackInstancesResponseBodyStackInstances self = new ListStackInstancesResponseBodyStackInstances();
            return TeaModel.build(map, self);
        }

        public ListStackInstancesResponseBodyStackInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackInstancesResponseBodyStackInstances setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackInstancesResponseBodyStackInstances setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackInstancesResponseBodyStackInstances setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackInstancesResponseBodyStackInstances setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public ListStackInstancesResponseBodyStackInstances setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackInstancesResponseBodyStackInstances setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackInstancesResponseBodyStackInstances setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStackInstancesResponseBodyStackInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStackInstancesResponseBodyStackInstances setRdFolderId(String rdFolderId) {
            this.rdFolderId = rdFolderId;
            return this;
        }
        public String getRdFolderId() {
            return this.rdFolderId;
        }

    }

}
