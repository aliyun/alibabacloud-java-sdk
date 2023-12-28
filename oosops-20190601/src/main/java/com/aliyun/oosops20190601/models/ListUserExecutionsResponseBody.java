// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserExecutionsResponseBody extends TeaModel {
    @NameInMap("Executions")
    public java.util.List<ListUserExecutionsResponseBodyExecutions> executions;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserExecutionsResponseBody self = new ListUserExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserExecutionsResponseBody setExecutions(java.util.List<ListUserExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<ListUserExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public ListUserExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserExecutionsResponseBodyExecutionsCurrentTasks extends TeaModel {
        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("TaskName")
        public String taskName;

        public static ListUserExecutionsResponseBodyExecutionsCurrentTasks build(java.util.Map<String, ?> map) throws Exception {
            ListUserExecutionsResponseBodyExecutionsCurrentTasks self = new ListUserExecutionsResponseBodyExecutionsCurrentTasks();
            return TeaModel.build(map, self);
        }

        public ListUserExecutionsResponseBodyExecutionsCurrentTasks setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public ListUserExecutionsResponseBodyExecutionsCurrentTasks setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListUserExecutionsResponseBodyExecutionsCurrentTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ListUserExecutionsResponseBodyExecutions extends TeaModel {
        @NameInMap("Counters")
        public String counters;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CurrentTasks")
        public java.util.List<ListUserExecutionsResponseBodyExecutionsCurrentTasks> currentTasks;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExecutedBy")
        public String executedBy;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("IsParent")
        public Boolean isParent;

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

        @NameInMap("SafetyCheck")
        public String safetyCheck;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

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

        public static ListUserExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListUserExecutionsResponseBodyExecutions self = new ListUserExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListUserExecutionsResponseBodyExecutions setCounters(String counters) {
            this.counters = counters;
            return this;
        }
        public String getCounters() {
            return this.counters;
        }

        public ListUserExecutionsResponseBodyExecutions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListUserExecutionsResponseBodyExecutions setCurrentTasks(java.util.List<ListUserExecutionsResponseBodyExecutionsCurrentTasks> currentTasks) {
            this.currentTasks = currentTasks;
            return this;
        }
        public java.util.List<ListUserExecutionsResponseBodyExecutionsCurrentTasks> getCurrentTasks() {
            return this.currentTasks;
        }

        public ListUserExecutionsResponseBodyExecutions setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListUserExecutionsResponseBodyExecutions setExecutedBy(String executedBy) {
            this.executedBy = executedBy;
            return this;
        }
        public String getExecutedBy() {
            return this.executedBy;
        }

        public ListUserExecutionsResponseBodyExecutions setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListUserExecutionsResponseBodyExecutions setIsParent(Boolean isParent) {
            this.isParent = isParent;
            return this;
        }
        public Boolean getIsParent() {
            return this.isParent;
        }

        public ListUserExecutionsResponseBodyExecutions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListUserExecutionsResponseBodyExecutions setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListUserExecutionsResponseBodyExecutions setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListUserExecutionsResponseBodyExecutions setParentExecutionId(String parentExecutionId) {
            this.parentExecutionId = parentExecutionId;
            return this;
        }
        public String getParentExecutionId() {
            return this.parentExecutionId;
        }

        public ListUserExecutionsResponseBodyExecutions setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public ListUserExecutionsResponseBodyExecutions setSafetyCheck(String safetyCheck) {
            this.safetyCheck = safetyCheck;
            return this;
        }
        public String getSafetyCheck() {
            return this.safetyCheck;
        }

        public ListUserExecutionsResponseBodyExecutions setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListUserExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserExecutionsResponseBodyExecutions setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListUserExecutionsResponseBodyExecutions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListUserExecutionsResponseBodyExecutions setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListUserExecutionsResponseBodyExecutions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListUserExecutionsResponseBodyExecutions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListUserExecutionsResponseBodyExecutions setWaitingStatus(String waitingStatus) {
            this.waitingStatus = waitingStatus;
            return this;
        }
        public String getWaitingStatus() {
            return this.waitingStatus;
        }

    }

}
