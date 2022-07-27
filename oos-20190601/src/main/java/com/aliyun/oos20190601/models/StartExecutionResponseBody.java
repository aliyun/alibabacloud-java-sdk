// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartExecutionResponseBody extends TeaModel {
    @NameInMap("Execution")
    public StartExecutionResponseBodyExecution execution;

    @NameInMap("RequestId")
    public String requestId;

    public static StartExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionResponseBody self = new StartExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartExecutionResponseBody setExecution(StartExecutionResponseBodyExecution execution) {
        this.execution = execution;
        return this;
    }
    public StartExecutionResponseBodyExecution getExecution() {
        return this.execution;
    }

    public StartExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartExecutionResponseBodyExecutionCurrentTasks extends TeaModel {
        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("TaskName")
        public String taskName;

        public static StartExecutionResponseBodyExecutionCurrentTasks build(java.util.Map<String, ?> map) throws Exception {
            StartExecutionResponseBodyExecutionCurrentTasks self = new StartExecutionResponseBodyExecutionCurrentTasks();
            return TeaModel.build(map, self);
        }

        public StartExecutionResponseBodyExecutionCurrentTasks setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public StartExecutionResponseBodyExecutionCurrentTasks setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public StartExecutionResponseBodyExecutionCurrentTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class StartExecutionResponseBodyExecution extends TeaModel {
        @NameInMap("Counters")
        public java.util.Map<String, ?> counters;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CurrentTasks")
        public java.util.List<StartExecutionResponseBodyExecutionCurrentTasks> currentTasks;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExecutedBy")
        public String executedBy;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("IsParent")
        public Boolean isParent;

        @NameInMap("LoopMode")
        public String loopMode;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("ParentExecutionId")
        public String parentExecutionId;

        @NameInMap("RamRole")
        public String ramRole;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SafetyCheck")
        public String safetyCheck;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static StartExecutionResponseBodyExecution build(java.util.Map<String, ?> map) throws Exception {
            StartExecutionResponseBodyExecution self = new StartExecutionResponseBodyExecution();
            return TeaModel.build(map, self);
        }

        public StartExecutionResponseBodyExecution setCounters(java.util.Map<String, ?> counters) {
            this.counters = counters;
            return this;
        }
        public java.util.Map<String, ?> getCounters() {
            return this.counters;
        }

        public StartExecutionResponseBodyExecution setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public StartExecutionResponseBodyExecution setCurrentTasks(java.util.List<StartExecutionResponseBodyExecutionCurrentTasks> currentTasks) {
            this.currentTasks = currentTasks;
            return this;
        }
        public java.util.List<StartExecutionResponseBodyExecutionCurrentTasks> getCurrentTasks() {
            return this.currentTasks;
        }

        public StartExecutionResponseBodyExecution setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StartExecutionResponseBodyExecution setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public StartExecutionResponseBodyExecution setExecutedBy(String executedBy) {
            this.executedBy = executedBy;
            return this;
        }
        public String getExecutedBy() {
            return this.executedBy;
        }

        public StartExecutionResponseBodyExecution setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public StartExecutionResponseBodyExecution setIsParent(Boolean isParent) {
            this.isParent = isParent;
            return this;
        }
        public Boolean getIsParent() {
            return this.isParent;
        }

        public StartExecutionResponseBodyExecution setLoopMode(String loopMode) {
            this.loopMode = loopMode;
            return this;
        }
        public String getLoopMode() {
            return this.loopMode;
        }

        public StartExecutionResponseBodyExecution setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public StartExecutionResponseBodyExecution setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public StartExecutionResponseBodyExecution setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public StartExecutionResponseBodyExecution setParentExecutionId(String parentExecutionId) {
            this.parentExecutionId = parentExecutionId;
            return this;
        }
        public String getParentExecutionId() {
            return this.parentExecutionId;
        }

        public StartExecutionResponseBodyExecution setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public StartExecutionResponseBodyExecution setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public StartExecutionResponseBodyExecution setSafetyCheck(String safetyCheck) {
            this.safetyCheck = safetyCheck;
            return this;
        }
        public String getSafetyCheck() {
            return this.safetyCheck;
        }

        public StartExecutionResponseBodyExecution setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public StartExecutionResponseBodyExecution setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartExecutionResponseBodyExecution setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public StartExecutionResponseBodyExecution setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public StartExecutionResponseBodyExecution setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public StartExecutionResponseBodyExecution setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public StartExecutionResponseBodyExecution setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public StartExecutionResponseBodyExecution setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
