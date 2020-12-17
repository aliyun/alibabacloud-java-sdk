// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponse extends TeaModel {
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

    @NameInMap("StackGroups")
    @Validation(required = true)
    public java.util.List<ListStackGroupsResponseStackGroups> stackGroups;

    public static ListStackGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsResponse self = new ListStackGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackGroupsResponse setStackGroups(java.util.List<ListStackGroupsResponseStackGroups> stackGroups) {
        this.stackGroups = stackGroups;
        return this;
    }
    public java.util.List<ListStackGroupsResponseStackGroups> getStackGroups() {
        return this.stackGroups;
    }

    public static class ListStackGroupsResponseStackGroups extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        @NameInMap("StackGroupDriftStatus")
        @Validation(required = true)
        public String stackGroupDriftStatus;

        public static ListStackGroupsResponseStackGroups build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsResponseStackGroups self = new ListStackGroupsResponseStackGroups();
            return TeaModel.build(map, self);
        }

        public ListStackGroupsResponseStackGroups setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackGroupsResponseStackGroups setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackGroupsResponseStackGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackGroupsResponseStackGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStackGroupsResponseStackGroups setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackGroupsResponseStackGroups setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

    }

}
