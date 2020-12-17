// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackGroupOperation")
    @Validation(required = true)
    public GetStackGroupOperationResponseStackGroupOperation stackGroupOperation;

    public static GetStackGroupOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationResponse self = new GetStackGroupOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetStackGroupOperationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackGroupOperationResponse setStackGroupOperation(GetStackGroupOperationResponseStackGroupOperation stackGroupOperation) {
        this.stackGroupOperation = stackGroupOperation;
        return this;
    }
    public GetStackGroupOperationResponseStackGroupOperation getStackGroupOperation() {
        return this.stackGroupOperation;
    }

    public static class GetStackGroupOperationResponseStackGroupOperationOperationPreferences extends TeaModel {
        @NameInMap("FailureToleranceCount")
        @Validation(required = true)
        public Integer failureToleranceCount;

        @NameInMap("FailureTolerancePercentage")
        @Validation(required = true)
        public Integer failureTolerancePercentage;

        @NameInMap("MaxConcurrentCount")
        @Validation(required = true)
        public Integer maxConcurrentCount;

        @NameInMap("MaxConcurrentPercentage")
        @Validation(required = true)
        public Integer maxConcurrentPercentage;

        @NameInMap("RegionIdsOrder")
        @Validation(required = true)
        public java.util.List<String> regionIdsOrder;

        public static GetStackGroupOperationResponseStackGroupOperationOperationPreferences build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseStackGroupOperationOperationPreferences self = new GetStackGroupOperationResponseStackGroupOperationOperationPreferences();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences setFailureToleranceCount(Integer failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }
        public Integer getFailureToleranceCount() {
            return this.failureToleranceCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences setFailureTolerancePercentage(Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }
        public Integer getFailureTolerancePercentage() {
            return this.failureTolerancePercentage;
        }

        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences setMaxConcurrentCount(Integer maxConcurrentCount) {
            this.maxConcurrentCount = maxConcurrentCount;
            return this;
        }
        public Integer getMaxConcurrentCount() {
            return this.maxConcurrentCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences setMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
            this.maxConcurrentPercentage = maxConcurrentPercentage;
            return this;
        }
        public Integer getMaxConcurrentPercentage() {
            return this.maxConcurrentPercentage;
        }

        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences setRegionIdsOrder(java.util.List<String> regionIdsOrder) {
            this.regionIdsOrder = regionIdsOrder;
            return this;
        }
        public java.util.List<String> getRegionIdsOrder() {
            return this.regionIdsOrder;
        }

    }

    public static class GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail extends TeaModel {
        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        @NameInMap("StackGroupDriftStatus")
        @Validation(required = true)
        public String stackGroupDriftStatus;

        @NameInMap("DriftDetectionStatus")
        @Validation(required = true)
        public String driftDetectionStatus;

        @NameInMap("DriftedStackInstancesCount")
        @Validation(required = true)
        public Integer driftedStackInstancesCount;

        @NameInMap("FailedStackInstancesCount")
        @Validation(required = true)
        public Integer failedStackInstancesCount;

        @NameInMap("CancelledStackInstancesCount")
        @Validation(required = true)
        public Integer cancelledStackInstancesCount;

        @NameInMap("InProgressStackInstancesCount")
        @Validation(required = true)
        public Integer inProgressStackInstancesCount;

        @NameInMap("InSyncStackInstancesCount")
        @Validation(required = true)
        public Integer inSyncStackInstancesCount;

        @NameInMap("TotalStackInstancesCount")
        @Validation(required = true)
        public Integer totalStackInstancesCount;

        public static GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail self = new GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setDriftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
            this.driftedStackInstancesCount = driftedStackInstancesCount;
            return this;
        }
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setFailedStackInstancesCount(Integer failedStackInstancesCount) {
            this.failedStackInstancesCount = failedStackInstancesCount;
            return this;
        }
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
            this.cancelledStackInstancesCount = cancelledStackInstancesCount;
            return this;
        }
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
            this.inProgressStackInstancesCount = inProgressStackInstancesCount;
            return this;
        }
        public Integer getInProgressStackInstancesCount() {
            return this.inProgressStackInstancesCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
            this.inSyncStackInstancesCount = inSyncStackInstancesCount;
            return this;
        }
        public Integer getInSyncStackInstancesCount() {
            return this.inSyncStackInstancesCount;
        }

        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail setTotalStackInstancesCount(Integer totalStackInstancesCount) {
            this.totalStackInstancesCount = totalStackInstancesCount;
            return this;
        }
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

    }

    public static class GetStackGroupOperationResponseStackGroupOperation extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("OperationId")
        @Validation(required = true)
        public String operationId;

        @NameInMap("OperationDescription")
        @Validation(required = true)
        public String operationDescription;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RetainStacks")
        @Validation(required = true)
        public Boolean retainStacks;

        @NameInMap("AdministratorRoleName")
        @Validation(required = true)
        public String administratorRoleName;

        @NameInMap("ExecutionRoleName")
        @Validation(required = true)
        public String executionRoleName;

        @NameInMap("OperationPreferences")
        @Validation(required = true)
        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences operationPreferences;

        @NameInMap("StackGroupDriftDetectionDetail")
        @Validation(required = true)
        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        public static GetStackGroupOperationResponseStackGroupOperation build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseStackGroupOperation self = new GetStackGroupOperationResponseStackGroupOperation();
            return TeaModel.build(map, self);
        }

        public GetStackGroupOperationResponseStackGroupOperation setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackGroupOperationResponseStackGroupOperation setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackGroupOperationResponseStackGroupOperation setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetStackGroupOperationResponseStackGroupOperation setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public GetStackGroupOperationResponseStackGroupOperation setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStackGroupOperationResponseStackGroupOperation setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStackGroupOperationResponseStackGroupOperation setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetStackGroupOperationResponseStackGroupOperation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackGroupOperationResponseStackGroupOperation setRetainStacks(Boolean retainStacks) {
            this.retainStacks = retainStacks;
            return this;
        }
        public Boolean getRetainStacks() {
            return this.retainStacks;
        }

        public GetStackGroupOperationResponseStackGroupOperation setAdministratorRoleName(String administratorRoleName) {
            this.administratorRoleName = administratorRoleName;
            return this;
        }
        public String getAdministratorRoleName() {
            return this.administratorRoleName;
        }

        public GetStackGroupOperationResponseStackGroupOperation setExecutionRoleName(String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        public GetStackGroupOperationResponseStackGroupOperation setOperationPreferences(GetStackGroupOperationResponseStackGroupOperationOperationPreferences operationPreferences) {
            this.operationPreferences = operationPreferences;
            return this;
        }
        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences getOperationPreferences() {
            return this.operationPreferences;
        }

        public GetStackGroupOperationResponseStackGroupOperation setStackGroupDriftDetectionDetail(GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
            this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
            return this;
        }
        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
        }

    }

}
