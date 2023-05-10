// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksResponseBody extends TeaModel {
    /**
     * <p>The tag key of the stack.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates whether rollback is disabled when the stack fails to be created. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tags of the stack.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag value of the stack.</p>
     */
    @NameInMap("Stacks")
    public java.util.List<ListStacksResponseBodyStacks> stacks;

    /**
     * <p>The time when the stack was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStacksResponseBody self = new ListStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStacksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStacksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStacksResponseBody setStacks(java.util.List<ListStacksResponseBodyStacks> stacks) {
        this.stacks = stacks;
        return this;
    }
    public java.util.List<ListStacksResponseBodyStacks> getStacks() {
        return this.stacks;
    }

    public ListStacksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStacksResponseBodyStacksOperationInfo extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Code")
        public String code;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ListStacksResponseBodyStacksOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacksOperationInfo self = new ListStacksResponseBodyStacksOperationInfo();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacksOperationInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListStacksResponseBodyStacksOperationInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStacksResponseBodyStacksOperationInfo setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStacksResponseBodyStacksOperationInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListStacksResponseBodyStacksOperationInfo setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListStacksResponseBodyStacksOperationInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListStacksResponseBodyStacksTags extends TeaModel {
        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the stack is a managed stack. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListStacksResponseBodyStacksTags build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacksTags self = new ListStacksResponseBodyStacksTags();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListStacksResponseBodyStacksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStacksResponseBodyStacks extends TeaModel {
        /**
         * <p>The ID of the stack.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The state of the stack on which the last successful drift detection was performed. Valid values:</p>
         * <br>
         * <p>*   DRIFTED: Drift detection is being performed on the stack.</p>
         * <p>*   NOT_CHECKED: No successful drift detection is performed on the stack.</p>
         * <p>*   IN_SYNC: The stack is being synchronized.</p>
         */
        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        /**
         * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("OperationInfo")
        public ListStacksResponseBodyStacksOperationInfo operationInfo;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ParentStackId")
        public String parentStackId;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The logical ID of the resource on which an operation fails to be performed.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The name of the API operation that belongs to another Alibaba Cloud service.</p>
         */
        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        /**
         * <p>The ID of the request that is initiated to call the API operation of another Alibaba Cloud service.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The name of the service to which the managed stack belongs.</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The type of the resource on which an operation fails to be performed.</p>
         */
        @NameInMap("StackType")
        public String stackType;

        /**
         * <p>The name of the stack.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the parent stack.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The type of the stack. Valid values:</p>
         * <br>
         * <p>*   ROS: ROS stack. The stack is created by using a Resource Orchestration Service (ROS) template.</p>
         * <p>*   Terraform: Terraform stack. The stack is created by using a Terraform template.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListStacksResponseBodyStacksTags> tags;

        /**
         * <p>The supplementary information that is returned when an operation fails to be performed on the stack.</p>
         * <br>
         * <p>>  This parameter is returned if an operation fails to be performed on the stack. The system returns at least one sub-property. Example: An error occurred when the API operation of another Alibaba Cloud service was called.</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        /**
         * <p>The timeout period that is allowed to create the stack. Unit: minutes.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListStacksResponseBodyStacks build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacks self = new ListStacksResponseBodyStacks();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStacksResponseBodyStacks setDisableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        public ListStacksResponseBodyStacks setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStacksResponseBodyStacks setOperationInfo(ListStacksResponseBodyStacksOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public ListStacksResponseBodyStacksOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        public ListStacksResponseBodyStacks setParentStackId(String parentStackId) {
            this.parentStackId = parentStackId;
            return this;
        }
        public String getParentStackId() {
            return this.parentStackId;
        }

        public ListStacksResponseBodyStacks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListStacksResponseBodyStacks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListStacksResponseBodyStacks setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListStacksResponseBodyStacks setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListStacksResponseBodyStacks setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public ListStacksResponseBodyStacks setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStacksResponseBodyStacks setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStacksResponseBodyStacks setStackType(String stackType) {
            this.stackType = stackType;
            return this;
        }
        public String getStackType() {
            return this.stackType;
        }

        public ListStacksResponseBodyStacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStacksResponseBodyStacks setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStacksResponseBodyStacks setTags(java.util.List<ListStacksResponseBodyStacksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListStacksResponseBodyStacksTags> getTags() {
            return this.tags;
        }

        public ListStacksResponseBodyStacks setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public ListStacksResponseBodyStacks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
