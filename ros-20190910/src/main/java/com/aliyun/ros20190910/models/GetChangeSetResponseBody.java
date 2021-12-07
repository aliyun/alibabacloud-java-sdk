// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponseBody extends TeaModel {
    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("ChangeSetName")
    public String changeSetName;

    @NameInMap("ChangeSetType")
    public String changeSetType;

    @NameInMap("Changes")
    public java.util.List<java.util.Map<String, ?>> changes;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("ExecutionStatus")
    public String executionStatus;

    @NameInMap("Log")
    public GetChangeSetResponseBodyLog log;

    @NameInMap("Parameters")
    public java.util.List<GetChangeSetResponseBodyParameters> parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusReason")
    public String statusReason;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static GetChangeSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponseBody self = new GetChangeSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeSetResponseBody setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetChangeSetResponseBody setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public GetChangeSetResponseBody setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public GetChangeSetResponseBody setChanges(java.util.List<java.util.Map<String, ?>> changes) {
        this.changes = changes;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getChanges() {
        return this.changes;
    }

    public GetChangeSetResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetChangeSetResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetChangeSetResponseBody setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetChangeSetResponseBody setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public GetChangeSetResponseBody setLog(GetChangeSetResponseBodyLog log) {
        this.log = log;
        return this;
    }
    public GetChangeSetResponseBodyLog getLog() {
        return this.log;
    }

    public GetChangeSetResponseBody setParameters(java.util.List<GetChangeSetResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetChangeSetResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetChangeSetResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetChangeSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeSetResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetChangeSetResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetChangeSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetChangeSetResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetChangeSetResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetChangeSetResponseBody setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class GetChangeSetResponseBodyLogTerraformLogs extends TeaModel {
        @NameInMap("Command")
        public String command;

        @NameInMap("Content")
        public String content;

        @NameInMap("Stream")
        public String stream;

        public static GetChangeSetResponseBodyLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyLogTerraformLogs self = new GetChangeSetResponseBodyLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetChangeSetResponseBodyLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetChangeSetResponseBodyLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class GetChangeSetResponseBodyLog extends TeaModel {
        @NameInMap("TerraformLogs")
        public java.util.List<GetChangeSetResponseBodyLogTerraformLogs> terraformLogs;

        public static GetChangeSetResponseBodyLog build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyLog self = new GetChangeSetResponseBodyLog();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyLog setTerraformLogs(java.util.List<GetChangeSetResponseBodyLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<GetChangeSetResponseBodyLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class GetChangeSetResponseBodyParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetChangeSetResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyParameters self = new GetChangeSetResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetChangeSetResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
