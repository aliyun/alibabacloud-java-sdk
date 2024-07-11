// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionsResponseBody extends TeaModel {
    /**
     * <p>The details of the task executions.</p>
     */
    @NameInMap("Executions")
    public java.util.List<ListExecutionsResponseBodyExecutions> executions;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14A074-47CA-9757-12CC4761D47A</p>
     */
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
        /**
         * <p>The execution template of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>acs::Template</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The ID of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>task-exec-44d32b45d2a49899#1</p>
         */
        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>installSLSILogtail</p>
         */
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
        /**
         * <p>The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of tasks that are counted by execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Failed&quot;: 0,&quot;Success&quot;: 1,&quot;Total&quot;: 2}</p>
         */
        @NameInMap("Counters")
        public java.util.Map<String, ?> counters;

        /**
         * <p>The time when the execution was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about the tasks that are running.</p>
         */
        @NameInMap("CurrentTasks")
        public java.util.List<ListExecutionsResponseBodyExecutionsCurrentTasks> currentTasks;

        /**
         * <p>The description of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>test execution.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the execution stops running.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The account ID of the user who started the execution of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1309252800</p>
         */
        @NameInMap("ExecutedBy")
        public String executedBy;

        /**
         * <p>The unique ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-44d32b45d2a449e</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>Indicates whether the execution contains child executions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsParent")
        public Boolean isParent;

        /**
         * <p>The time when the template was last successfully triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-27T09:29:18Z</p>
         */
        @NameInMap("LastSuccessfulTriggerTime")
        public String lastSuccessfulTriggerTime;

        /**
         * <p>The outputs of last trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;InstanceId&quot;: &quot;i-xxx&quot;
         * }</p>
         */
        @NameInMap("LastTriggerOutputs")
        public String lastTriggerOutputs;

        /**
         * <p>The status of the execution after the template was last triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("LastTriggerStatus")
        public String lastTriggerStatus;

        /**
         * <p>The status message of last trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("LastTriggerStatusMessage")
        public String lastTriggerStatusMessage;

        /**
         * <p>The time when the template was last successfully triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-27T09:29:18Z</p>
         */
        @NameInMap("LastTriggerTime")
        public String lastTriggerTime;

        /**
         * <p>The execution mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatic</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The output of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;InstanceId&quot;:&quot;i-xxx&quot; }</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The input parameters of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Status&quot;:&quot;Running&quot; }</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The ID of the parent execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-xxx</p>
         */
        @NameInMap("ParentExecutionId")
        public String parentExecutionId;

        /**
         * <p>The role that started the execution of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>OOSServiceRole</p>
         */
        @NameInMap("RamRole")
        public String ramRole;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{ 			&quot;Success&quot;: 1 		}</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The security check mode. Valid values: Skip, and ConfirmEveryHighRiskAction.</p>
         * 
         * <strong>example:</strong>
         * <p>Skip</p>
         */
        @NameInMap("SafetyCheck")
        public String safetyCheck;

        /**
         * <p>The time when the execution was started.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The status of the execution. Valid values: Started, Queued, Running, Waiting, Success, Failed, and Cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The reason for which the status occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The tags of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The target resource.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Filters&quot;: [{&quot;ResourceIds&quot;: [&quot;i-bp14z07dg3464980x72o&quot;], &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Type&quot;: &quot;ResourceIds&quot;}]}&quot;</p>
         */
        @NameInMap("Targets")
        public String targets;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The version number of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the execution was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The Waiting state.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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

        public ListExecutionsResponseBodyExecutions setLastTriggerOutputs(String lastTriggerOutputs) {
            this.lastTriggerOutputs = lastTriggerOutputs;
            return this;
        }
        public String getLastTriggerOutputs() {
            return this.lastTriggerOutputs;
        }

        public ListExecutionsResponseBodyExecutions setLastTriggerStatus(String lastTriggerStatus) {
            this.lastTriggerStatus = lastTriggerStatus;
            return this;
        }
        public String getLastTriggerStatus() {
            return this.lastTriggerStatus;
        }

        public ListExecutionsResponseBodyExecutions setLastTriggerStatusMessage(String lastTriggerStatusMessage) {
            this.lastTriggerStatusMessage = lastTriggerStatusMessage;
            return this;
        }
        public String getLastTriggerStatusMessage() {
            return this.lastTriggerStatusMessage;
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
