// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponseBody extends TeaModel {
    @NameInMap("StackGroups")
    public java.util.List<ListStackGroupsResponseBodyStackGroups> stackGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListStackGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsResponseBody self = new ListStackGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackGroupsResponseBody setStackGroups(java.util.List<ListStackGroupsResponseBodyStackGroups> stackGroups) {
        this.stackGroups = stackGroups;
        return this;
    }
    public java.util.List<ListStackGroupsResponseBodyStackGroups> getStackGroups() {
        return this.stackGroups;
    }

    public ListStackGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListStackGroupsResponseBodyStackGroups extends TeaModel {
        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListStackGroupsResponseBodyStackGroups build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsResponseBodyStackGroups self = new ListStackGroupsResponseBodyStackGroups();
            return TeaModel.build(map, self);
        }

        public ListStackGroupsResponseBodyStackGroups setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackGroupsResponseBodyStackGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackGroupsResponseBodyStackGroups setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackGroupsResponseBodyStackGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStackGroupsResponseBodyStackGroups setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public ListStackGroupsResponseBodyStackGroups setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackGroupsResponseBodyStackGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
