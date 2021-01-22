// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public java.util.List<GetStackResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusReason")
    public String statusReason;

    @NameInMap("ParentStackId")
    public String parentStackId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    @NameInMap("RootStackId")
    public String rootStackId;

    @NameInMap("TemplateDescription")
    public String templateDescription;

    @NameInMap("StackType")
    public String stackType;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Outputs")
    public java.util.List<java.util.Map<String, ?>> outputs;

    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackDriftStatus")
    public String stackDriftStatus;

    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("Tags")
    public java.util.List<GetStackResponseBodyTags> tags;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    @NameInMap("StackId")
    public String stackId;

    public static GetStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponseBody self = new GetStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetStackResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetStackResponseBody setParameters(java.util.List<GetStackResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetStackResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetStackResponseBody setParentStackId(String parentStackId) {
        this.parentStackId = parentStackId;
        return this;
    }
    public String getParentStackId() {
        return this.parentStackId;
    }

    public GetStackResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetStackResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetStackResponseBody setRootStackId(String rootStackId) {
        this.rootStackId = rootStackId;
        return this;
    }
    public String getRootStackId() {
        return this.rootStackId;
    }

    public GetStackResponseBody setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public GetStackResponseBody setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }
    public String getStackType() {
        return this.stackType;
    }

    public GetStackResponseBody setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public GetStackResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetStackResponseBody setOutputs(java.util.List<java.util.Map<String, ?>> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getOutputs() {
        return this.outputs;
    }

    public GetStackResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackResponseBody setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    public GetStackResponseBody setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public GetStackResponseBody setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetStackResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetStackResponseBody setTags(java.util.List<GetStackResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetStackResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetStackResponseBody setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public GetStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class GetStackResponseBodyParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetStackResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyParameters self = new GetStackResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetStackResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetStackResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyTags self = new GetStackResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetStackResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
