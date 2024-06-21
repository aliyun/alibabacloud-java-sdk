// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksResponseBody extends TeaModel {
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
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBAC80B4-9C27-529D-BC9C-4155FA5CD7A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the stacks.</p>
     */
    @NameInMap("Stacks")
    public java.util.List<ListStacksResponseBodyStacks> stacks;

    /**
     * <p>The total number of stacks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
        /**
         * <p>The name of the API operation that belongs to another Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>DeleteSecurityGroup</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DependencyViolation</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The logical ID of the resource on which the operation error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsSecurityGroup</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>There is still instance(s) in the specified security group.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the request that is initiated to call the API operation of another Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>071D6166-3F6B-5C7B-A1F0-0113FBB643A8</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The type of the resource on which the operation error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::SecurityGroup</p>
         */
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
         * <p>The tag key of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:rm:rgId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2frunvw7****</p>
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
         * <p>The time when the stack was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-10T06:44:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether deletion protection is enabled for the stack. Valid values:</p>
         * <ul>
         * <li>Enabled: Deletion protection is enabled for the stack.</li>
         * <li>Disabled: Deletion protection is disabled for the stack. In this case, you can delete the stack by using the console or calling the <a href="https://help.aliyun.com/document_detail/610812.html">DeleteStack</a> operation.</li>
         * </ul>
         * <blockquote>
         * <p> Deletion protection of a nested stack is the same as that of its root stack.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("DeletionProtection")
        public String deletionProtection;

        /**
         * <p>Indicates whether rollback is disabled when the stack fails to be created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        /**
         * <p>The time when the most recent successful drift detection was performed on the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-10T06:46:36</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The supplementary information that is returned if an error occurs on a stack operation.</p>
         * <blockquote>
         * <p> This parameter is returned only under specific conditions, and is returned together with at least one sub-parameter. For example, an error occurred when an API operation of another Alibaba Cloud service was called.</p>
         * </blockquote>
         */
        @NameInMap("OperationInfo")
        public ListStacksResponseBodyStacksOperationInfo operationInfo;

        /**
         * <p>The ID of the parent stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf692****</p>
         */
        @NameInMap("ParentStackId")
        public String parentStackId;

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2frunvw7****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the stack is a managed stack. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The name of the service to which the managed stack belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ACVS</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The state of the stack on which the most recent successful drift detection was performed. Valid values:</p>
         * <ul>
         * <li>DRIFTED: The stack has drifted.</li>
         * <li>NOT_CHECKED: No successful drift detection is performed on the stack.</li>
         * <li>IN_SYNC: The stack is being synchronized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        /**
         * <p>The stack ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67805444-a605-45ee-a57f-83908ff6****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The stack name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStack</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The stack type. Valid values:</p>
         * <ul>
         * <li>ROS: ROS stack. The stack is created by using a ROS template.</li>
         * <li>Terraform: Terraform stack. The stack is created by using a Terraform template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        @NameInMap("StackType")
        public String stackType;

        /**
         * <p>The state of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the stack is in its current state.</p>
         * 
         * <strong>example:</strong>
         * <p>Stack CREATE completed successfully</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The tags of the stack.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListStacksResponseBodyStacksTags> tags;

        /**
         * <p>The timeout period for creating the stack. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        /**
         * <p>The time when the stack was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-10T07:44:36</p>
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

        public ListStacksResponseBodyStacks setDeletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public String getDeletionProtection() {
            return this.deletionProtection;
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
