// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartExecutionResponseBody extends TeaModel {
    /**
     * <p>The details of the execution.</p>
     */
    @NameInMap("Execution")
    public StartExecutionResponseBodyExecution execution;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The action of the task.</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The execution ID of the task.</p>
         */
        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        /**
         * <p>The name of the task.</p>
         */
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
        /**
         * <p>The number of executions.</p>
         */
        @NameInMap("Counters")
        public java.util.Map<String, ?> counters;

        /**
         * <p>The time when the execution was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about in-progress tasks.</p>
         */
        @NameInMap("CurrentTasks")
        public java.util.List<StartExecutionResponseBodyExecutionCurrentTasks> currentTasks;

        /**
         * <p>The description of the execution.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the execution stopped.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The account ID of the user who started the execution of the template.</p>
         */
        @NameInMap("ExecutedBy")
        public String executedBy;

        /**
         * <p>The GUID of the execution.</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>Indicates whether the execution is a parent execution.</p>
         */
        @NameInMap("IsParent")
        public Boolean isParent;

        /**
         * <p>The loop mode.</p>
         */
        @NameInMap("LoopMode")
        public String loopMode;

        /**
         * <p>The execution mode.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The output of the execution.</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The input parameters of the execution.</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The ID of the parent execution.</p>
         */
        @NameInMap("ParentExecutionId")
        public String parentExecutionId;

        /**
         * <p>The role that started the execution of the template.</p>
         */
        @NameInMap("RamRole")
        public String ramRole;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security check mode.</p>
         */
        @NameInMap("SafetyCheck")
        public String safetyCheck;

        /**
         * <p>The time when the execution was started.</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The status of the execution.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status information of the execution.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The tags of the execution.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The version number of the template.</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the execution was last updated.</p>
         */
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
