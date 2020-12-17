// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackGroup")
    @Validation(required = true)
    public GetStackGroupResponseStackGroup stackGroup;

    public static GetStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupResponse self = new GetStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetStackGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackGroupResponse setStackGroup(GetStackGroupResponseStackGroup stackGroup) {
        this.stackGroup = stackGroup;
        return this;
    }
    public GetStackGroupResponseStackGroup getStackGroup() {
        return this.stackGroup;
    }

    public static class GetStackGroupResponseStackGroupParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetStackGroupResponseStackGroupParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseStackGroupParameters self = new GetStackGroupResponseStackGroupParameters();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseStackGroupParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackGroupResponseStackGroupParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail extends TeaModel {
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

        public static GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail self = new GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setDriftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
            this.driftedStackInstancesCount = driftedStackInstancesCount;
            return this;
        }
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setFailedStackInstancesCount(Integer failedStackInstancesCount) {
            this.failedStackInstancesCount = failedStackInstancesCount;
            return this;
        }
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
            this.cancelledStackInstancesCount = cancelledStackInstancesCount;
            return this;
        }
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
            this.inProgressStackInstancesCount = inProgressStackInstancesCount;
            return this;
        }
        public Integer getInProgressStackInstancesCount() {
            return this.inProgressStackInstancesCount;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
            this.inSyncStackInstancesCount = inSyncStackInstancesCount;
            return this;
        }
        public Integer getInSyncStackInstancesCount() {
            return this.inSyncStackInstancesCount;
        }

        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail setTotalStackInstancesCount(Integer totalStackInstancesCount) {
            this.totalStackInstancesCount = totalStackInstancesCount;
            return this;
        }
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

    }

    public static class GetStackGroupResponseStackGroup extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("TemplateBody")
        @Validation(required = true)
        public String templateBody;

        @NameInMap("ExecutionRoleName")
        @Validation(required = true)
        public String executionRoleName;

        @NameInMap("AdministrationRoleName")
        @Validation(required = true)
        public String administrationRoleName;

        @NameInMap("Parameters")
        @Validation(required = true)
        public java.util.List<GetStackGroupResponseStackGroupParameters> parameters;

        @NameInMap("StackGroupDriftDetectionDetail")
        @Validation(required = true)
        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        public static GetStackGroupResponseStackGroup build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseStackGroup self = new GetStackGroupResponseStackGroup();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseStackGroup setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackGroupResponseStackGroup setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackGroupResponseStackGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackGroupResponseStackGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackGroupResponseStackGroup setTemplateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public String getTemplateBody() {
            return this.templateBody;
        }

        public GetStackGroupResponseStackGroup setExecutionRoleName(String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        public GetStackGroupResponseStackGroup setAdministrationRoleName(String administrationRoleName) {
            this.administrationRoleName = administrationRoleName;
            return this;
        }
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        public GetStackGroupResponseStackGroup setParameters(java.util.List<GetStackGroupResponseStackGroupParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetStackGroupResponseStackGroupParameters> getParameters() {
            return this.parameters;
        }

        public GetStackGroupResponseStackGroup setStackGroupDriftDetectionDetail(GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
            this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
            return this;
        }
        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
        }

    }

}
