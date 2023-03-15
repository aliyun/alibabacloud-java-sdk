// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the operation on the stack group.</p>
     */
    @NameInMap("StackGroupOperation")
    public GetStackGroupOperationResponseBodyStackGroupOperation stackGroupOperation;

    public static GetStackGroupOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationResponseBody self = new GetStackGroupOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackGroupOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackGroupOperationResponseBody setStackGroupOperation(GetStackGroupOperationResponseBodyStackGroupOperation stackGroupOperation) {
        this.stackGroupOperation = stackGroupOperation;
        return this;
    }
    public GetStackGroupOperationResponseBodyStackGroupOperation getStackGroupOperation() {
        return this.stackGroupOperation;
    }

    public static class GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets extends TeaModel {
        /**
         * <p>The IDs of the member accounts in the resource directory.</p>
         * <br>
         * <p>>  This parameter is returned only if the AccountIds request parameter is specified in the [UpdateStackInstances](~~151716~~) operation to update stack instances.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The folder IDs of the resource directory.</p>
         */
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets self = new GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

    }

    public static class GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences extends TeaModel {
        /**
         * <p>The maximum number of stack operation failures that can occur within the accounts in each region. When the value is exceeded, the operation fails to be performed in the region. If the operation fails to be performed in one region, the operation fails to be performed in other regions.</p>
         * <br>
         * <p>Valid values: 0 to 20.</p>
         * <br>
         * <p>>  Only one of the FailureToleranceCount and FailureTolerancePercentage parameters is returned.</p>
         */
        @NameInMap("FailureToleranceCount")
        public Integer failureToleranceCount;

        /**
         * <p>The percentage of the total number of accounts within which stack operation failures can occur to the total number of accounts in each region. When the value is exceeded, the operation fails to be performed in the region.</p>
         * <br>
         * <p>Valid values: 0 to 100.</p>
         * <br>
         * <p>>  Only one of the FailureToleranceCount and FailureTolerancePercentage parameters is returned.</p>
         */
        @NameInMap("FailureTolerancePercentage")
        public Integer failureTolerancePercentage;

        /**
         * <p>The maximum number of accounts within which operations are performed on stacks concurrently in each region.</p>
         * <br>
         * <p>Valid values: 1 to 20.</p>
         * <br>
         * <p>>  Only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters is returned.</p>
         */
        @NameInMap("MaxConcurrentCount")
        public Integer maxConcurrentCount;

        /**
         * <p>The percentage of the total number of accounts within which operations are performed on stacks concurrently to the total number of accounts in each region.</p>
         * <br>
         * <p>Valid values: 1 to 100.</p>
         * <br>
         * <p>>  Only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters is returned.</p>
         */
        @NameInMap("MaxConcurrentPercentage")
        public Integer maxConcurrentPercentage;

        /**
         * <p>The regions in the order of which the operation is performed.</p>
         */
        @NameInMap("RegionIdsOrder")
        public java.util.List<String> regionIdsOrder;

        public static GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences self = new GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences setFailureToleranceCount(Integer failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }
        public Integer getFailureToleranceCount() {
            return this.failureToleranceCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences setFailureTolerancePercentage(Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }
        public Integer getFailureTolerancePercentage() {
            return this.failureTolerancePercentage;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences setMaxConcurrentCount(Integer maxConcurrentCount) {
            this.maxConcurrentCount = maxConcurrentCount;
            return this;
        }
        public Integer getMaxConcurrentCount() {
            return this.maxConcurrentCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences setMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
            this.maxConcurrentPercentage = maxConcurrentPercentage;
            return this;
        }
        public Integer getMaxConcurrentPercentage() {
            return this.maxConcurrentPercentage;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences setRegionIdsOrder(java.util.List<String> regionIdsOrder) {
            this.regionIdsOrder = regionIdsOrder;
            return this;
        }
        public java.util.List<String> getRegionIdsOrder() {
            return this.regionIdsOrder;
        }

    }

    public static class GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail extends TeaModel {
        /**
         * <p>The number of stack instances for which the drift detection was canceled.</p>
         */
        @NameInMap("CancelledStackInstancesCount")
        public Integer cancelledStackInstancesCount;

        /**
         * <p>The status of the drift detection.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   COMPLETED: The drift detection is performed and completed on all stack instances.</p>
         * <p>*   FAILED: The drift detection is performed. The number of stack instances that failed the drift detection exceeds the specified threshold.</p>
         * <p>*   PARTIAL_SUCCESS: The drift detection is performed. The number of stack instances that failed the drift detection does not exceed the specified threshold.</p>
         * <p>*   IN_PROGRESS: The drift detection is being performed on the stack group.</p>
         * <p>*   STOPPED: The drift detection is canceled for the stack group.</p>
         */
        @NameInMap("DriftDetectionStatus")
        public String driftDetectionStatus;

        /**
         * <p>The time when the drift detection was initiated.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The number of stack instances that were drifted.</p>
         */
        @NameInMap("DriftedStackInstancesCount")
        public Integer driftedStackInstancesCount;

        /**
         * <p>The number of stack instances that failed the drift detection.</p>
         */
        @NameInMap("FailedStackInstancesCount")
        public Integer failedStackInstancesCount;

        /**
         * <p>The number of stack instances on which the drift detection was being performed.</p>
         */
        @NameInMap("InProgressStackInstancesCount")
        public Integer inProgressStackInstancesCount;

        /**
         * <p>The number of stack instances that were being synchronized.</p>
         */
        @NameInMap("InSyncStackInstancesCount")
        public Integer inSyncStackInstancesCount;

        /**
         * <p>The drift status of the stack group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   DRIFTED: At least one stack instance in the stack group is drifted.</p>
         * <p>*   NOT_CHECKED: No drift detection is completed in the stack group.</p>
         * <p>*   IN_SYNC: All the stack instances in the stack group are being synchronized.</p>
         */
        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        /**
         * <p>The number of stack instances.</p>
         */
        @NameInMap("TotalStackInstancesCount")
        public Integer totalStackInstancesCount;

        public static GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail self = new GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
            this.cancelledStackInstancesCount = cancelledStackInstancesCount;
            return this;
        }
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setDriftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
            this.driftedStackInstancesCount = driftedStackInstancesCount;
            return this;
        }
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setFailedStackInstancesCount(Integer failedStackInstancesCount) {
            this.failedStackInstancesCount = failedStackInstancesCount;
            return this;
        }
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
            this.inProgressStackInstancesCount = inProgressStackInstancesCount;
            return this;
        }
        public Integer getInProgressStackInstancesCount() {
            return this.inProgressStackInstancesCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
            this.inSyncStackInstancesCount = inSyncStackInstancesCount;
            return this;
        }
        public Integer getInSyncStackInstancesCount() {
            return this.inSyncStackInstancesCount;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail setTotalStackInstancesCount(Integer totalStackInstancesCount) {
            this.totalStackInstancesCount = totalStackInstancesCount;
            return this;
        }
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

    }

    public static class GetStackGroupOperationResponseBodyStackGroupOperation extends TeaModel {
        /**
         * <p>The operation that was performed.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   CREATE</p>
         * <p>*   UPDATE</p>
         * <p>*   DELETE</p>
         * <p>*   DETECT_DRIFT</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The name of the RAM role that is specified for the administrator account in Resource Orchestration Service (ROS) when you create the stack group that is granted self-managed permissions. If this parameter is not specified, the default value AliyunROSStackGroupAdministrationRole is returned.</p>
         */
        @NameInMap("AdministrationRoleName")
        public String administrationRoleName;

        /**
         * <p>The time when the operation was initiated.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The folders in which you want to deploy the stack instances that are granted service-managed permissions.</p>
         */
        @NameInMap("DeploymentTargets")
        public GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets deploymentTargets;

        /**
         * <p>The time when the operation ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the RAM role that is specified for the execution account when you create the stack group that is granted self-managed permissions. The administrator account whose RAM role is AliyunROSStackGroupAdministrationRole assumes this RAM role. If this parameter is not specified, the default value AliyunROSStackGroupExecutionRole is returned.</p>
         */
        @NameInMap("ExecutionRoleName")
        public String executionRoleName;

        /**
         * <p>The description of the operation.</p>
         * <br>
         * <p>>  This parameter is returned only if the OperationDescription request parameter is specified in the [CreateStackInstances](~~151338~~) operation to create stack instances.</p>
         */
        @NameInMap("OperationDescription")
        public String operationDescription;

        /**
         * <p>The ID of the operation that was performed on the stack group.</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The operation preferences.</p>
         */
        @NameInMap("OperationPreferences")
        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences operationPreferences;

        /**
         * <p>Indicates whether the relevant stacks are retained when stack instances are deleted in the stack group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: The stacks are retained.</p>
         * <p>*   false: The stacks are deleted. Proceed with caution.</p>
         * <br>
         * <p>>  This parameter is returned only when the stack instances are deleted.</p>
         */
        @NameInMap("RetainStacks")
        public Boolean retainStacks;

        /**
         * <p>The details of the drift detection.</p>
         * <br>
         * <p>>  This parameter is returned only when the drift detection is performed on the stack group.</p>
         */
        @NameInMap("StackGroupDriftDetectionDetail")
        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        /**
         * <p>The ID of the stack group.</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The status of the operation.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RUNNING: The operation is being performed.</p>
         * <p>*   SUCCEEDED: The operation succeeded.</p>
         * <p>*   FAILED: The operation failed.</p>
         * <p>*   STOPPING: The operation is being stopped.</p>
         * <p>*   STOPPED: The operation is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetStackGroupOperationResponseBodyStackGroupOperation build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseBodyStackGroupOperation self = new GetStackGroupOperationResponseBodyStackGroupOperation();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setAdministrationRoleName(String administrationRoleName) {
            this.administrationRoleName = administrationRoleName;
            return this;
        }
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setDeploymentTargets(GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets deploymentTargets) {
            this.deploymentTargets = deploymentTargets;
            return this;
        }
        public GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets getDeploymentTargets() {
            return this.deploymentTargets;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setExecutionRoleName(String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setOperationPreferences(GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences operationPreferences) {
            this.operationPreferences = operationPreferences;
            return this;
        }
        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences getOperationPreferences() {
            return this.operationPreferences;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setRetainStacks(Boolean retainStacks) {
            this.retainStacks = retainStacks;
            return this;
        }
        public Boolean getRetainStacks() {
            return this.retainStacks;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setStackGroupDriftDetectionDetail(GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
            this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
            return this;
        }
        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackGroupOperationResponseBodyStackGroupOperation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
