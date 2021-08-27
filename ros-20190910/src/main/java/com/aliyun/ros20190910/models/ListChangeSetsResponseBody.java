// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ChangeSets")
    public java.util.List<ListChangeSetsResponseBodyChangeSets> changeSets;

    public static ListChangeSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsResponseBody self = new ListChangeSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListChangeSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChangeSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChangeSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListChangeSetsResponseBody setChangeSets(java.util.List<ListChangeSetsResponseBodyChangeSets> changeSets) {
        this.changeSets = changeSets;
        return this;
    }
    public java.util.List<ListChangeSetsResponseBodyChangeSets> getChangeSets() {
        return this.changeSets;
    }

    public static class ListChangeSetsResponseBodyChangeSets extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("ChangeSetName")
        public String changeSetName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ChangeSetType")
        public String changeSetType;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChangeSetId")
        public String changeSetId;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("ExecutionStatus")
        public String executionStatus;

        @NameInMap("RegionId")
        public String regionId;

        public static ListChangeSetsResponseBodyChangeSets build(java.util.Map<String, ?> map) throws Exception {
            ListChangeSetsResponseBodyChangeSets self = new ListChangeSetsResponseBodyChangeSets();
            return TeaModel.build(map, self);
        }

        public ListChangeSetsResponseBodyChangeSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListChangeSetsResponseBodyChangeSets setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListChangeSetsResponseBodyChangeSets setChangeSetName(String changeSetName) {
            this.changeSetName = changeSetName;
            return this;
        }
        public String getChangeSetName() {
            return this.changeSetName;
        }

        public ListChangeSetsResponseBodyChangeSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChangeSetsResponseBodyChangeSets setChangeSetType(String changeSetType) {
            this.changeSetType = changeSetType;
            return this;
        }
        public String getChangeSetType() {
            return this.changeSetType;
        }

        public ListChangeSetsResponseBodyChangeSets setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListChangeSetsResponseBodyChangeSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListChangeSetsResponseBodyChangeSets setChangeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }
        public String getChangeSetId() {
            return this.changeSetId;
        }

        public ListChangeSetsResponseBodyChangeSets setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListChangeSetsResponseBodyChangeSets setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public ListChangeSetsResponseBodyChangeSets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
