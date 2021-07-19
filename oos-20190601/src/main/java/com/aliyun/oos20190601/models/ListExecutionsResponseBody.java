// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Executions")
    public java.util.List<ListExecutionsResponseBodyExecutions> executions;

    public static ListExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsResponseBody self = new ListExecutionsResponseBody();
        return TeaModel.build(map, self);
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

    public ListExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionsResponseBody setExecutions(java.util.List<ListExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<ListExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public static class ListExecutionsResponseBodyExecutionsCurrentTasks extends TeaModel {
        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskAction")
        public String taskAction;

        public static ListExecutionsResponseBodyExecutionsCurrentTasks build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutionsCurrentTasks self = new ListExecutionsResponseBodyExecutionsCurrentTasks();
            return TeaModel.build(map, self);
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

        public ListExecutionsResponseBodyExecutionsCurrentTasks setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

    }

    public static class ListExecutionsResponseBodyExecutions extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("WaitingStatus")
        public String waitingStatus;

        @NameInMap("Targets")
        public String targets;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("LastSuccessfulTriggerTime")
        public String lastSuccessfulTriggerTime;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("SafetyCheck")
        public String safetyCheck;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("LastTriggerTime")
        public String lastTriggerTime;

        @NameInMap("ParentExecutionId")
        public String parentExecutionId;

        @NameInMap("LastTriggerStatus")
        public String lastTriggerStatus;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("ExecutedBy")
        public String executedBy;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("IsParent")
        public Boolean isParent;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        @NameInMap("Counters")
        public java.util.Map<String, ?> counters;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Category")
        public String category;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("RamRole")
        public String ramRole;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("CurrentTasks")
        public java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> currentTasks;

        public static ListExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutions self = new ListExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutionsResponseBodyExecutions setWaitingStatus(String waitingStatus) {
            this.waitingStatus = waitingStatus;
            return this;
        }
        public String getWaitingStatus() {
            return this.waitingStatus;
        }

        public ListExecutionsResponseBodyExecutions setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
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

        public ListExecutionsResponseBodyExecutions setLastSuccessfulTriggerTime(String lastSuccessfulTriggerTime) {
            this.lastSuccessfulTriggerTime = lastSuccessfulTriggerTime;
            return this;
        }
        public String getLastSuccessfulTriggerTime() {
            return this.lastSuccessfulTriggerTime;
        }

        public ListExecutionsResponseBodyExecutions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListExecutionsResponseBodyExecutions setSafetyCheck(String safetyCheck) {
            this.safetyCheck = safetyCheck;
            return this;
        }
        public String getSafetyCheck() {
            return this.safetyCheck;
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

        public ListExecutionsResponseBodyExecutions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListExecutionsResponseBodyExecutions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListExecutionsResponseBodyExecutions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExecutionsResponseBodyExecutions setLastTriggerTime(String lastTriggerTime) {
            this.lastTriggerTime = lastTriggerTime;
            return this;
        }
        public String getLastTriggerTime() {
            return this.lastTriggerTime;
        }

        public ListExecutionsResponseBodyExecutions setParentExecutionId(String parentExecutionId) {
            this.parentExecutionId = parentExecutionId;
            return this;
        }
        public String getParentExecutionId() {
            return this.parentExecutionId;
        }

        public ListExecutionsResponseBodyExecutions setLastTriggerStatus(String lastTriggerStatus) {
            this.lastTriggerStatus = lastTriggerStatus;
            return this;
        }
        public String getLastTriggerStatus() {
            return this.lastTriggerStatus;
        }

        public ListExecutionsResponseBodyExecutions setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListExecutionsResponseBodyExecutions setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListExecutionsResponseBodyExecutions setExecutedBy(String executedBy) {
            this.executedBy = executedBy;
            return this;
        }
        public String getExecutedBy() {
            return this.executedBy;
        }

        public ListExecutionsResponseBodyExecutions setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListExecutionsResponseBodyExecutions setIsParent(Boolean isParent) {
            this.isParent = isParent;
            return this;
        }
        public Boolean getIsParent() {
            return this.isParent;
        }

        public ListExecutionsResponseBodyExecutions setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListExecutionsResponseBodyExecutions setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListExecutionsResponseBodyExecutions setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ListExecutionsResponseBodyExecutions setCounters(java.util.Map<String, ?> counters) {
            this.counters = counters;
            return this;
        }
        public java.util.Map<String, ?> getCounters() {
            return this.counters;
        }

        public ListExecutionsResponseBodyExecutions setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListExecutionsResponseBodyExecutions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListExecutionsResponseBodyExecutions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListExecutionsResponseBodyExecutions setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public ListExecutionsResponseBodyExecutions setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListExecutionsResponseBodyExecutions setCurrentTasks(java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> currentTasks) {
            this.currentTasks = currentTasks;
            return this;
        }
        public java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> getCurrentTasks() {
            return this.currentTasks;
        }

    }

}
