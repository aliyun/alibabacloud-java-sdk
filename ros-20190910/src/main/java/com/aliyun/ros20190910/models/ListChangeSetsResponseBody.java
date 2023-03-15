// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponseBody extends TeaModel {
    /**
     * <p>The list of change sets.</p>
     */
    @NameInMap("ChangeSets")
    public java.util.List<ListChangeSetsResponseBodyChangeSets> changeSets;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListChangeSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsResponseBody self = new ListChangeSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsResponseBody setChangeSets(java.util.List<ListChangeSetsResponseBodyChangeSets> changeSets) {
        this.changeSets = changeSets;
        return this;
    }
    public java.util.List<ListChangeSetsResponseBodyChangeSets> getChangeSets() {
        return this.changeSets;
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

    public static class ListChangeSetsResponseBodyChangeSets extends TeaModel {
        /**
         * <p>The ID of the change set.</p>
         */
        @NameInMap("ChangeSetId")
        public String changeSetId;

        /**
         * <p>The name of the change set.</p>
         */
        @NameInMap("ChangeSetName")
        public String changeSetName;

        /**
         * <p>The type of the change set.</p>
         */
        @NameInMap("ChangeSetType")
        public String changeSetType;

        /**
         * <p>The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the change set.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The execution status of the change set.</p>
         */
        @NameInMap("ExecutionStatus")
        public String executionStatus;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the stack with which the change set is associated.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The name of the stack with which the change set is associated.</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The status of the change set.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the change set is in its current status.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static ListChangeSetsResponseBodyChangeSets build(java.util.Map<String, ?> map) throws Exception {
            ListChangeSetsResponseBodyChangeSets self = new ListChangeSetsResponseBodyChangeSets();
            return TeaModel.build(map, self);
        }

        public ListChangeSetsResponseBodyChangeSets setChangeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }
        public String getChangeSetId() {
            return this.changeSetId;
        }

        public ListChangeSetsResponseBodyChangeSets setChangeSetName(String changeSetName) {
            this.changeSetName = changeSetName;
            return this;
        }
        public String getChangeSetName() {
            return this.changeSetName;
        }

        public ListChangeSetsResponseBodyChangeSets setChangeSetType(String changeSetType) {
            this.changeSetType = changeSetType;
            return this;
        }
        public String getChangeSetType() {
            return this.changeSetType;
        }

        public ListChangeSetsResponseBodyChangeSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListChangeSetsResponseBodyChangeSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public ListChangeSetsResponseBodyChangeSets setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListChangeSetsResponseBodyChangeSets setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListChangeSetsResponseBodyChangeSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListChangeSetsResponseBodyChangeSets setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
