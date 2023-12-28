// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserTaskExecutionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskExecutions")
    public java.util.List<ListUserTaskExecutionsResponseBodyTaskExecutions> taskExecutions;

    public static ListUserTaskExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserTaskExecutionsResponseBody self = new ListUserTaskExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserTaskExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserTaskExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserTaskExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserTaskExecutionsResponseBody setTaskExecutions(java.util.List<ListUserTaskExecutionsResponseBodyTaskExecutions> taskExecutions) {
        this.taskExecutions = taskExecutions;
        return this;
    }
    public java.util.List<ListUserTaskExecutionsResponseBodyTaskExecutions> getTaskExecutions() {
        return this.taskExecutions;
    }

    public static class ListUserTaskExecutionsResponseBodyTaskExecutions extends TeaModel {
        @NameInMap("ChildExecutionId")
        public String childExecutionId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("Loop")
        public String loop;

        @NameInMap("LoopBatchNumber")
        public Integer loopBatchNumber;

        @NameInMap("LoopItem")
        public String loopItem;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("ParentTaskExecutionId")
        public String parentTaskExecutionId;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListUserTaskExecutionsResponseBodyTaskExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListUserTaskExecutionsResponseBodyTaskExecutions self = new ListUserTaskExecutionsResponseBodyTaskExecutions();
            return TeaModel.build(map, self);
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setChildExecutionId(String childExecutionId) {
            this.childExecutionId = childExecutionId;
            return this;
        }
        public String getChildExecutionId() {
            return this.childExecutionId;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setLoopBatchNumber(Integer loopBatchNumber) {
            this.loopBatchNumber = loopBatchNumber;
            return this;
        }
        public Integer getLoopBatchNumber() {
            return this.loopBatchNumber;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setLoopItem(String loopItem) {
            this.loopItem = loopItem;
            return this;
        }
        public String getLoopItem() {
            return this.loopItem;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setParentTaskExecutionId(String parentTaskExecutionId) {
            this.parentTaskExecutionId = parentTaskExecutionId;
            return this;
        }
        public String getParentTaskExecutionId() {
            return this.parentTaskExecutionId;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListUserTaskExecutionsResponseBodyTaskExecutions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
