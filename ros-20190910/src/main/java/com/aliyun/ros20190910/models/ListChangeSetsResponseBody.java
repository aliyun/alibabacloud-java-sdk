// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponseBody extends TeaModel {
    /**
     * <p>The change sets.</p>
     */
    @NameInMap("ChangeSets")
    public java.util.List<ListChangeSetsResponseBodyChangeSets> changeSets;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of change sets returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public static class ListChangeSetsResponseBodyChangeSetsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListChangeSetsResponseBodyChangeSetsTags build(java.util.Map<String, ?> map) throws Exception {
            ListChangeSetsResponseBodyChangeSetsTags self = new ListChangeSetsResponseBodyChangeSetsTags();
            return TeaModel.build(map, self);
        }

        public ListChangeSetsResponseBodyChangeSetsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListChangeSetsResponseBodyChangeSetsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListChangeSetsResponseBodyChangeSets extends TeaModel {
        /**
         * <p>The ID of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>1f6521a4-05af-4975-afe9-bc4b45ad****</p>
         */
        @NameInMap("ChangeSetId")
        public String changeSetId;

        /**
         * <p>The name of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChangeSet</p>
         */
        @NameInMap("ChangeSetName")
        public String changeSetName;

        /**
         * <p>The type of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeSetType")
        public String changeSetType;

        /**
         * <p>The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T05:16:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The execution status of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("ExecutionStatus")
        public String executionStatus;

        /**
         * <p>The region ID of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the stack with which the change set is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The name of the stack with which the change set is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStack</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The status of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the change set is in its current state.</p>
         * 
         * <strong>example:</strong>
         * <p>too many changes</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("Tags")
        public java.util.List<ListChangeSetsResponseBodyChangeSetsTags> tags;

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

        public ListChangeSetsResponseBodyChangeSets setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public ListChangeSetsResponseBodyChangeSets setTags(java.util.List<ListChangeSetsResponseBodyChangeSetsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListChangeSetsResponseBodyChangeSetsTags> getTags() {
            return this.tags;
        }

    }

}
