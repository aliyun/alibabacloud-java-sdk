// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

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
        @NameInMap("FailureToleranceCount")
        public Integer failureToleranceCount;

        @NameInMap("FailureTolerancePercentage")
        public Integer failureTolerancePercentage;

        @NameInMap("MaxConcurrentCount")
        public Integer maxConcurrentCount;

        @NameInMap("MaxConcurrentPercentage")
        public Integer maxConcurrentPercentage;

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
        @NameInMap("CancelledStackInstancesCount")
        public Integer cancelledStackInstancesCount;

        @NameInMap("DriftDetectionStatus")
        public String driftDetectionStatus;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("DriftedStackInstancesCount")
        public Integer driftedStackInstancesCount;

        @NameInMap("FailedStackInstancesCount")
        public Integer failedStackInstancesCount;

        @NameInMap("InProgressStackInstancesCount")
        public Integer inProgressStackInstancesCount;

        @NameInMap("InSyncStackInstancesCount")
        public Integer inSyncStackInstancesCount;

        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("AdministrationRoleName")
        public String administrationRoleName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeploymentTargets")
        public GetStackGroupOperationResponseBodyStackGroupOperationDeploymentTargets deploymentTargets;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecutionRoleName")
        public String executionRoleName;

        @NameInMap("OperationDescription")
        public String operationDescription;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("OperationPreferences")
        public GetStackGroupOperationResponseBodyStackGroupOperationOperationPreferences operationPreferences;

        @NameInMap("RetainStacks")
        public Boolean retainStacks;

        @NameInMap("StackGroupDriftDetectionDetail")
        public GetStackGroupOperationResponseBodyStackGroupOperationStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("StackGroupName")
        public String stackGroupName;

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
