// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StartDateBefore")
    public String startDateBefore;

    @NameInMap("StartDateAfter")
    public String startDateAfter;

    @NameInMap("EndDateBefore")
    public String endDateBefore;

    @NameInMap("EndDateAfter")
    public String endDateAfter;

    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskAction")
    public String taskAction;

    @NameInMap("ParentTaskExecutionId")
    public String parentTaskExecutionId;

    @NameInMap("IncludeChildTaskExecution")
    public Boolean includeChildTaskExecution;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListTaskExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionsRequest self = new ListTaskExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTaskExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListTaskExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTaskExecutionsRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListTaskExecutionsRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListTaskExecutionsRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListTaskExecutionsRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListTaskExecutionsRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public ListTaskExecutionsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListTaskExecutionsRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public ListTaskExecutionsRequest setParentTaskExecutionId(String parentTaskExecutionId) {
        this.parentTaskExecutionId = parentTaskExecutionId;
        return this;
    }
    public String getParentTaskExecutionId() {
        return this.parentTaskExecutionId;
    }

    public ListTaskExecutionsRequest setIncludeChildTaskExecution(Boolean includeChildTaskExecution) {
        this.includeChildTaskExecution = includeChildTaskExecution;
        return this;
    }
    public Boolean getIncludeChildTaskExecution() {
        return this.includeChildTaskExecution;
    }

    public ListTaskExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTaskExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskExecutionsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTaskExecutionsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
