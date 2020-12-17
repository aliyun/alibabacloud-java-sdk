// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResponse extends TeaModel {
    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("DisableRollback")
    @Validation(required = true)
    public Boolean disableRollback;

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

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    @NameInMap("TemplateDescription")
    @Validation(required = true)
    public String templateDescription;

    @NameInMap("TimeoutInMinutes")
    @Validation(required = true)
    public Integer timeoutInMinutes;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("ParentStackId")
    @Validation(required = true)
    public String parentStackId;

    @NameInMap("StackDriftStatus")
    @Validation(required = true)
    public String stackDriftStatus;

    @NameInMap("DriftDetectionTime")
    @Validation(required = true)
    public String driftDetectionTime;

    @NameInMap("RamRoleName")
    @Validation(required = true)
    public String ramRoleName;

    @NameInMap("DeletionProtection")
    @Validation(required = true)
    public String deletionProtection;

    @NameInMap("RootStackId")
    @Validation(required = true)
    public String rootStackId;

    @NameInMap("StackType")
    @Validation(required = true)
    public String stackType;

    @NameInMap("Parameters")
    @Validation(required = true)
    public java.util.List<GetStackResponseParameters> parameters;

    @NameInMap("Outputs")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> outputs;

    @NameInMap("NotificationURLs")
    @Validation(required = true)
    public java.util.List<String> notificationURLs;

    public static GetStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponse self = new GetStackResponse();
        return TeaModel.build(map, self);
    }

    public GetStackResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetStackResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetStackResponse setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetStackResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackResponse setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetStackResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetStackResponse setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetStackResponse setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public GetStackResponse setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public GetStackResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetStackResponse setParentStackId(String parentStackId) {
        this.parentStackId = parentStackId;
        return this;
    }
    public String getParentStackId() {
        return this.parentStackId;
    }

    public GetStackResponse setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    public GetStackResponse setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackResponse setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public GetStackResponse setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetStackResponse setRootStackId(String rootStackId) {
        this.rootStackId = rootStackId;
        return this;
    }
    public String getRootStackId() {
        return this.rootStackId;
    }

    public GetStackResponse setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }
    public String getStackType() {
        return this.stackType;
    }

    public GetStackResponse setParameters(java.util.List<GetStackResponseParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetStackResponseParameters> getParameters() {
        return this.parameters;
    }

    public GetStackResponse setOutputs(java.util.List<java.util.Map<String, ?>> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getOutputs() {
        return this.outputs;
    }

    public GetStackResponse setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public static class GetStackResponseParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetStackResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseParameters self = new GetStackResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetStackResponseParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackResponseParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
