// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponse extends TeaModel {
    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    @NameInMap("ChangeSetName")
    @Validation(required = true)
    public String changeSetName;

    @NameInMap("ChangeSetType")
    @Validation(required = true)
    public String changeSetType;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("DisableRollback")
    @Validation(required = true)
    public Boolean disableRollback;

    @NameInMap("ExecutionStatus")
    @Validation(required = true)
    public String executionStatus;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("StackName")
    @Validation(required = true)
    public String stackName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("TemplateBody")
    @Validation(required = true)
    public String templateBody;

    @NameInMap("TimeoutInMinutes")
    @Validation(required = true)
    public Integer timeoutInMinutes;

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    @NameInMap("Parameters")
    @Validation(required = true)
    public java.util.List<GetChangeSetResponseParameters> parameters;

    @NameInMap("Changes")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> changes;

    public static GetChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponse self = new GetChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public GetChangeSetResponse setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetChangeSetResponse setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public GetChangeSetResponse setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public GetChangeSetResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetChangeSetResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetChangeSetResponse setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetChangeSetResponse setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public GetChangeSetResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetChangeSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeSetResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetChangeSetResponse setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetChangeSetResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetChangeSetResponse setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetChangeSetResponse setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public GetChangeSetResponse setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetChangeSetResponse setParameters(java.util.List<GetChangeSetResponseParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetChangeSetResponseParameters> getParameters() {
        return this.parameters;
    }

    public GetChangeSetResponse setChanges(java.util.List<java.util.Map<String, ?>> changes) {
        this.changes = changes;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getChanges() {
        return this.changes;
    }

    public static class GetChangeSetResponseParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetChangeSetResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseParameters self = new GetChangeSetResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetChangeSetResponseParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
