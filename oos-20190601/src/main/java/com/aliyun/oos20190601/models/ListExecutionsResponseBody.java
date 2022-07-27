// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionsResponseBody extends TeaModel {
    @NameInMap("Executions")
    public java.util.List<ListExecutionsResponseBodyExecutions> executions;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsResponseBody self = new ListExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutionsResponseBody setExecutions(java.util.List<ListExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<ListExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public ListExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExecutionsResponseBodyExecutionsCurrentTasks extends TeaModel {
        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("TaskName")
        public String taskName;

        public static ListExecutionsResponseBodyExecutionsCurrentTasks build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutionsCurrentTasks self = new ListExecutionsResponseBodyExecutionsCurrentTasks();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutionsCurrentTasks setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public ListExecutionsResponseBodyExecutionsCurrentTasks setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListExecutionsResponseBodyExecutionsCurrentTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ListExecutionsResponseBodyExecutions extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Counters")
        public java.util.Map<String, ?> counters;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CurrentTasks")
        public java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> currentTasks;

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

        @NameInMap("LastSuccessfulTriggerTime")
        public String lastSuccessfulTriggerTime;

        @NameInMap("LastTriggerStatus")
        public String lastTriggerStatus;

        @NameInMap("LastTriggerTime")
        public String lastTriggerTime;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        @NameInMap("ParentExecutionId")
        public String parentExecutionId;

        @NameInMap("RamRole")
        public String ramRole;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("SafetyCheck")
        public String safetyCheck;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("Targets")
        public String targets;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("WaitingStatus")
        public String waitingStatus;

        public static ListExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutions self = new ListExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListExecutionsResponseBodyExecutions setCounters(java.util.Map<String, ?> counters) {
            this.counters = counters;
            return this;
        }
        public java.util.Map<String, ?> getCounters() {
            return this.counters;
        }

        public ListExecutionsResponseBodyExecutions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListExecutionsResponseBodyExecutions setCurrentTasks(java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> currentTasks) {
            this.currentTasks = currentTasks;
            return this;
        }
        public java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> getCurrentTasks() {
            return this.currentTasks;
        }

        public ListExecutionsResponseBodyExecutions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExecutionsResponseBodyExecutions setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListExecutionsResponseBodyExecutions setExecutedBy(String executedBy) {
            this.executedBy = executedBy;
            return this;
        }
        public String getExecutedBy() {
            return this.executedBy;
        }

        public ListExecutionsResponseBodyExecutions setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListExecutionsResponseBodyExecutions setIsParent(Boolean isParent) {
            this.isParent = isParent;
            return this;
        }
        public Boolean getIsParent() {
            return this.isParent;
        }

        public ListExecutionsResponseBodyExecutions setLastSuccessfulTriggerTime(String lastSuccessfulTriggerTime) {
            this.lastSuccessfulTriggerTime = lastSuccessfulTriggerTime;
            return this;
        }
        public String getLastSuccessfulTriggerTime() {
            return this.lastSuccessfulTriggerTime;
        }

        public ListExecutionsResponseBodyExecutions setLastTriggerStatus(String lastTriggerStatus) {
            this.lastTriggerStatus = lastTriggerStatus;
            return this;
        }
        public String getLastTriggerStatus() {
            return this.lastTriggerStatus;
        }

        public ListExecutionsResponseBodyExecutions setLastTriggerTime(String lastTriggerTime) {
            this.lastTriggerTime = lastTriggerTime;
            return this;
        }
        public String getLastTriggerTime() {
            return this.lastTriggerTime;
        }

        public ListExecutionsResponseBodyExecutions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListExecutionsResponseBodyExecutions setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListExecutionsResponseBodyExecutions setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ListExecutionsResponseBodyExecutions setParentExecutionId(String parentExecutionId) {
            this.parentExecutionId = parentExecutionId;
            return this;
        }
        public String getParentExecutionId() {
            return this.parentExecutionId;
        }

        public ListExecutionsResponseBodyExecutions setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public ListExecutionsResponseBodyExecutions setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListExecutionsResponseBodyExecutions setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListExecutionsResponseBodyExecutions setSafetyCheck(String safetyCheck) {
            this.safetyCheck = safetyCheck;
            return this;
        }
        public String getSafetyCheck() {
            return this.safetyCheck;
        }

        public ListExecutionsResponseBodyExecutions setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutionsResponseBodyExecutions setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListExecutionsResponseBodyExecutions setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListExecutionsResponseBodyExecutions setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListExecutionsResponseBodyExecutions setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
        }

        public ListExecutionsResponseBodyExecutions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListExecutionsResponseBodyExecutions setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListExecutionsResponseBodyExecutions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListExecutionsResponseBodyExecutions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListExecutionsResponseBodyExecutions setWaitingStatus(String waitingStatus) {
            this.waitingStatus = waitingStatus;
            return this;
        }
        public String getWaitingStatus() {
            return this.waitingStatus;
        }

    }

}
