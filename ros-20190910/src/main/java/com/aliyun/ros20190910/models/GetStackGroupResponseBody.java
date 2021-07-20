// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackGroup")
    public GetStackGroupResponseBodyStackGroup stackGroup;

    public static GetStackGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupResponseBody self = new GetStackGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackGroupResponseBody setStackGroup(GetStackGroupResponseBodyStackGroup stackGroup) {
        this.stackGroup = stackGroup;
        return this;
    }
    public GetStackGroupResponseBodyStackGroup getStackGroup() {
        return this.stackGroup;
    }

    public static class GetStackGroupResponseBodyStackGroupParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetStackGroupResponseBodyStackGroupParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupParameters self = new GetStackGroupResponseBodyStackGroupParameters();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackGroupResponseBodyStackGroupParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail extends TeaModel {
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("TotalStackInstancesCount")
        public Integer totalStackInstancesCount;

        @NameInMap("FailedStackInstancesCount")
        public Integer failedStackInstancesCount;

        @NameInMap("DriftDetectionStatus")
        public String driftDetectionStatus;

        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        @NameInMap("InProgressStackInstancesCount")
        public Integer inProgressStackInstancesCount;

        @NameInMap("InSyncStackInstancesCount")
        public Integer inSyncStackInstancesCount;

        @NameInMap("CancelledStackInstancesCount")
        public Integer cancelledStackInstancesCount;

        @NameInMap("DriftedStackInstancesCount")
        public Integer driftedStackInstancesCount;

        public static GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail self = new GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setTotalStackInstancesCount(Integer totalStackInstancesCount) {
            this.totalStackInstancesCount = totalStackInstancesCount;
            return this;
        }
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setFailedStackInstancesCount(Integer failedStackInstancesCount) {
            this.failedStackInstancesCount = failedStackInstancesCount;
            return this;
        }
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
            this.inProgressStackInstancesCount = inProgressStackInstancesCount;
            return this;
        }
        public Integer getInProgressStackInstancesCount() {
            return this.inProgressStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
            this.inSyncStackInstancesCount = inSyncStackInstancesCount;
            return this;
        }
        public Integer getInSyncStackInstancesCount() {
            return this.inSyncStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
            this.cancelledStackInstancesCount = cancelledStackInstancesCount;
            return this;
        }
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
            this.driftedStackInstancesCount = driftedStackInstancesCount;
            return this;
        }
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

    }

    public static class GetStackGroupResponseBodyStackGroup extends TeaModel {
        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("AdministrationRoleName")
        public String administrationRoleName;

        @NameInMap("Parameters")
        public java.util.List<GetStackGroupResponseBodyStackGroupParameters> parameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("ExecutionRoleName")
        public String executionRoleName;

        @NameInMap("TemplateBody")
        public String templateBody;

        @NameInMap("StackGroupDriftDetectionDetail")
        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetStackGroupResponseBodyStackGroup build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroup self = new GetStackGroupResponseBodyStackGroup();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackGroupResponseBodyStackGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackGroupResponseBodyStackGroup setAdministrationRoleName(String administrationRoleName) {
            this.administrationRoleName = administrationRoleName;
            return this;
        }
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        public GetStackGroupResponseBodyStackGroup setParameters(java.util.List<GetStackGroupResponseBodyStackGroupParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetStackGroupResponseBodyStackGroupParameters> getParameters() {
            return this.parameters;
        }

        public GetStackGroupResponseBodyStackGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackGroupResponseBodyStackGroup setExecutionRoleName(String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        public GetStackGroupResponseBodyStackGroup setTemplateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public String getTemplateBody() {
            return this.templateBody;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupDriftDetectionDetail(GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
            this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
            return this;
        }
        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
        }

        public GetStackGroupResponseBodyStackGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
