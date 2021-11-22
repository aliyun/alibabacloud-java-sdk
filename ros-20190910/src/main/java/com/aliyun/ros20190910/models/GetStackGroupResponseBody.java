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

    public static class GetStackGroupResponseBodyStackGroupAutoDeployment extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("RetainStacksOnAccountRemoval")
        public Boolean retainStacksOnAccountRemoval;

        public static GetStackGroupResponseBodyStackGroupAutoDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupAutoDeployment self = new GetStackGroupResponseBodyStackGroupAutoDeployment();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupAutoDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetStackGroupResponseBodyStackGroupAutoDeployment setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

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

        public static GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail self = new GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
            this.cancelledStackInstancesCount = cancelledStackInstancesCount;
            return this;
        }
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
            this.driftedStackInstancesCount = driftedStackInstancesCount;
            return this;
        }
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setFailedStackInstancesCount(Integer failedStackInstancesCount) {
            this.failedStackInstancesCount = failedStackInstancesCount;
            return this;
        }
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
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

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail setTotalStackInstancesCount(Integer totalStackInstancesCount) {
            this.totalStackInstancesCount = totalStackInstancesCount;
            return this;
        }
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

    }

    public static class GetStackGroupResponseBodyStackGroup extends TeaModel {
        @NameInMap("AdministrationRoleName")
        public String administrationRoleName;

        @NameInMap("AutoDeployment")
        public GetStackGroupResponseBodyStackGroupAutoDeployment autoDeployment;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecutionRoleName")
        public String executionRoleName;

        @NameInMap("Parameters")
        public java.util.List<GetStackGroupResponseBodyStackGroupParameters> parameters;

        @NameInMap("PermissionModel")
        public String permissionModel;

        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("StackGroupDriftDetectionDetail")
        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateBody")
        public String templateBody;

        public static GetStackGroupResponseBodyStackGroup build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseBodyStackGroup self = new GetStackGroupResponseBodyStackGroup();
            return TeaModel.build(map, self);
        }

        public GetStackGroupResponseBodyStackGroup setAdministrationRoleName(String administrationRoleName) {
            this.administrationRoleName = administrationRoleName;
            return this;
        }
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        public GetStackGroupResponseBodyStackGroup setAutoDeployment(GetStackGroupResponseBodyStackGroupAutoDeployment autoDeployment) {
            this.autoDeployment = autoDeployment;
            return this;
        }
        public GetStackGroupResponseBodyStackGroupAutoDeployment getAutoDeployment() {
            return this.autoDeployment;
        }

        public GetStackGroupResponseBodyStackGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackGroupResponseBodyStackGroup setExecutionRoleName(String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        public GetStackGroupResponseBodyStackGroup setParameters(java.util.List<GetStackGroupResponseBodyStackGroupParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetStackGroupResponseBodyStackGroupParameters> getParameters() {
            return this.parameters;
        }

        public GetStackGroupResponseBodyStackGroup setPermissionModel(String permissionModel) {
            this.permissionModel = permissionModel;
            return this;
        }
        public String getPermissionModel() {
            return this.permissionModel;
        }

        public GetStackGroupResponseBodyStackGroup setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

        public GetStackGroupResponseBodyStackGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupDriftDetectionDetail(GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
            this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
            return this;
        }
        public GetStackGroupResponseBodyStackGroupStackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackGroupResponseBodyStackGroup setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackGroupResponseBodyStackGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackGroupResponseBodyStackGroup setTemplateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public String getTemplateBody() {
            return this.templateBody;
        }

    }

}
