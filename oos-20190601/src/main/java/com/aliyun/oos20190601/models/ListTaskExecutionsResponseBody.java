// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionsResponseBody extends TeaModel {
    /**
     * <p>The details of the task executions.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ3NjFENDdB</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>CDABABABAB-FC28-4D9C-8FB5-68DC6F0486FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution ID of the child node.</p>
     */
    @NameInMap("TaskExecutions")
    public java.util.List<ListTaskExecutionsResponseBodyTaskExecutions> taskExecutions;

    public static ListTaskExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionsResponseBody self = new ListTaskExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTaskExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskExecutionsResponseBody setTaskExecutions(java.util.List<ListTaskExecutionsResponseBodyTaskExecutions> taskExecutions) {
        this.taskExecutions = taskExecutions;
        return this;
    }
    public java.util.List<ListTaskExecutionsResponseBodyTaskExecutions> getTaskExecutions() {
        return this.taskExecutions;
    }

    public static class ListTaskExecutionsResponseBodyTaskExecutions extends TeaModel {
        /**
         * <p>The output of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-xxx</p>
         */
        @NameInMap("ChildExecutionId")
        public String childExecutionId;

        /**
         * <p>The ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The execution ID of the parent node.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The action of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-44d32b45d2a449e49899</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>The Input parameters of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{                     &quot;NotifyNote&quot;:&quot;&quot;                 }</p>
         */
        @NameInMap("ExtraData")
        public java.util.Map<String, ?> extraData;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Loop")
        public java.util.Map<String, ?> loop;

        /**
         * <p>The status information of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LoopBatchNumber")
        public Integer loopBatchNumber;

        /**
         * <p>The time when the execution was created.</p>
         * 
         * <strong>example:</strong>
         * <p>i-1234566zxcvvb</p>
         */
        @NameInMap("LoopItem")
        public String loopItem;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;InstanceId&quot;:&quot;i-xxx&quot; }</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-exec-xxx</p>
         */
        @NameInMap("ParentTaskExecutionId")
        public String parentTaskExecutionId;

        /**
         * <p>Queries task executions. Multiple methods are supported to filter task executions.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Status&quot;:&quot;Running&quot; }</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The elements in the loop task.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The time when the task execution stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The execution ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::Sleep</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The time when the execution was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>task-exec-xxx</p>
         */
        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        /**
         * <p>The time when the execution started.</p>
         * 
         * <strong>example:</strong>
         * <p>describeInstance</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The number of times for which the loop task is run.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The configuration and statistics information of the loop task. This parameter is returned only for the parent node of the loop task.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListTaskExecutionsResponseBodyTaskExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListTaskExecutionsResponseBodyTaskExecutions self = new ListTaskExecutionsResponseBodyTaskExecutions();
            return TeaModel.build(map, self);
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setChildExecutionId(String childExecutionId) {
            this.childExecutionId = childExecutionId;
            return this;
        }
        public String getChildExecutionId() {
            return this.childExecutionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setExtraData(java.util.Map<String, ?> extraData) {
            this.extraData = extraData;
            return this;
        }
        public java.util.Map<String, ?> getExtraData() {
            return this.extraData;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setLoop(java.util.Map<String, ?> loop) {
            this.loop = loop;
            return this;
        }
        public java.util.Map<String, ?> getLoop() {
            return this.loop;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setLoopBatchNumber(Integer loopBatchNumber) {
            this.loopBatchNumber = loopBatchNumber;
            return this;
        }
        public Integer getLoopBatchNumber() {
            return this.loopBatchNumber;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setLoopItem(String loopItem) {
            this.loopItem = loopItem;
            return this;
        }
        public String getLoopItem() {
            return this.loopItem;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setParentTaskExecutionId(String parentTaskExecutionId) {
            this.parentTaskExecutionId = parentTaskExecutionId;
            return this;
        }
        public String getParentTaskExecutionId() {
            return this.parentTaskExecutionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
