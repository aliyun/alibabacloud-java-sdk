// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85DE34BD-7FF9-480F-8C21-556E9DA93ACD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stacks.</p>
     */
    @NameInMap("StackInstances")
    public java.util.List<ListStackInstancesResponseBodyStackInstances> stackInstances;

    /**
     * <p>The total number of stacks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesResponseBody self = new ListStackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackInstancesResponseBody setStackInstances(java.util.List<ListStackInstancesResponseBodyStackInstances> stackInstances) {
        this.stackInstances = stackInstances;
        return this;
    }
    public java.util.List<ListStackInstancesResponseBodyStackInstances> getStackInstances() {
        return this.stackInstances;
    }

    public ListStackInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStackInstancesResponseBodyStackInstances extends TeaModel {
        /**
         * <p>The ID of the destination account to which the stack belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>156552876021****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the last successful drift detection was performed on the stack.</p>
         * <blockquote>
         * <p>This parameter is returned only if drift detection is performed on the stack group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The ID of the folder in the resource directory.</p>
         * <blockquote>
         * <p>This parameter is returned only if the stack group is granted service-managed permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fd-4PvlVLOL8v</p>
         */
        @NameInMap("RdFolderId")
        public String rdFolderId;

        /**
         * <p>The region ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the stack when the last successful drift detection was performed on the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DRIFTED: The stack has drifted.</li>
         * <li>NOT_CHECKED: No successful drift detection is performed on the stack.</li>
         * <li>IN_SYNC: The stack is being synchronized.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if drift detection is performed on the stack group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        /**
         * <p>The ID of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The stack ID.</p>
         * <blockquote>
         * <p>This parameter is returned only if the stack is in the CURRENT state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>35ad60e3-6a92-42d8-8812-f0700d45****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The state of the stack.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>CURRENT: The stack is up-to-date with the stack group.</p>
         * </li>
         * <li><p>OUTDATED: The stack is not up-to-date with the stack group. Stacks are in the OUTDATED state due to the following possible reasons:</p>
         * <ul>
         * <li>When the CreateStackInstances operation is called to create stacks, the stacks fail to be created.</li>
         * <li>When the UpdateStackInstances or UpdateStackGroup operation is called to update stacks, the stacks fail to be updated, or only specific stacks are updated.</li>
         * <li>The creation or update operation is not complete.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the stack instance is in the OUTDATED state.</p>
         * <blockquote>
         * <p>This parameter is returned only if the stack instance is in the OUTDATED state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>User initiated stop</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static ListStackInstancesResponseBodyStackInstances build(java.util.Map<String, ?> map) throws Exception {
            ListStackInstancesResponseBodyStackInstances self = new ListStackInstancesResponseBodyStackInstances();
            return TeaModel.build(map, self);
        }

        public ListStackInstancesResponseBodyStackInstances setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStackInstancesResponseBodyStackInstances setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackInstancesResponseBodyStackInstances setRdFolderId(String rdFolderId) {
            this.rdFolderId = rdFolderId;
            return this;
        }
        public String getRdFolderId() {
            return this.rdFolderId;
        }

        public ListStackInstancesResponseBodyStackInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStackInstancesResponseBodyStackInstances setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public ListStackInstancesResponseBodyStackInstances setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackInstancesResponseBodyStackInstances setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackInstancesResponseBodyStackInstances setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackInstancesResponseBodyStackInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackInstancesResponseBodyStackInstances setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
