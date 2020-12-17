// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponse extends TeaModel {
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

    @NameInMap("ChangeSets")
    @Validation(required = true)
    public java.util.List<ListChangeSetsResponseChangeSets> changeSets;

    public static ListChangeSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsResponse self = new ListChangeSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListChangeSetsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChangeSetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChangeSetsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListChangeSetsResponse setChangeSets(java.util.List<ListChangeSetsResponseChangeSets> changeSets) {
        this.changeSets = changeSets;
        return this;
    }
    public java.util.List<ListChangeSetsResponseChangeSets> getChangeSets() {
        return this.changeSets;
    }

    public static class ListChangeSetsResponseChangeSets extends TeaModel {
        @NameInMap("ChangeSetId")
        @Validation(required = true)
        public String changeSetId;

        @NameInMap("ChangeSetName")
        @Validation(required = true)
        public String changeSetName;

        @NameInMap("ChangeSetType")
        @Validation(required = true)
        public String changeSetType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ExecutionStatus")
        @Validation(required = true)
        public String executionStatus;

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

        public static ListChangeSetsResponseChangeSets build(java.util.Map<String, ?> map) throws Exception {
            ListChangeSetsResponseChangeSets self = new ListChangeSetsResponseChangeSets();
            return TeaModel.build(map, self);
        }

        public ListChangeSetsResponseChangeSets setChangeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }
        public String getChangeSetId() {
            return this.changeSetId;
        }

        public ListChangeSetsResponseChangeSets setChangeSetName(String changeSetName) {
            this.changeSetName = changeSetName;
            return this;
        }
        public String getChangeSetName() {
            return this.changeSetName;
        }

        public ListChangeSetsResponseChangeSets setChangeSetType(String changeSetType) {
            this.changeSetType = changeSetType;
            return this;
        }
        public String getChangeSetType() {
            return this.changeSetType;
        }

        public ListChangeSetsResponseChangeSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListChangeSetsResponseChangeSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChangeSetsResponseChangeSets setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public ListChangeSetsResponseChangeSets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListChangeSetsResponseChangeSets setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListChangeSetsResponseChangeSets setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListChangeSetsResponseChangeSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListChangeSetsResponseChangeSets setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
