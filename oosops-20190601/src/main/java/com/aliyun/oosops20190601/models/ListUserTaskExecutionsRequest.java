// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserTaskExecutionsRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("EndDateAfter")
    public String endDateAfter;

    @NameInMap("EndDateBefore")
    public String endDateBefore;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("IncludeChildTaskExecution")
    public Boolean includeChildTaskExecution;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ParentTaskExecutionId")
    public String parentTaskExecutionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("StartDateAfter")
    public String startDateAfter;

    @NameInMap("StartDateBefore")
    public String startDateBefore;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskAction")
    public String taskAction;

    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    @NameInMap("TaskName")
    public String taskName;

    public static ListUserTaskExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserTaskExecutionsRequest self = new ListUserTaskExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserTaskExecutionsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ListUserTaskExecutionsRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListUserTaskExecutionsRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListUserTaskExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListUserTaskExecutionsRequest setIncludeChildTaskExecution(Boolean includeChildTaskExecution) {
        this.includeChildTaskExecution = includeChildTaskExecution;
        return this;
    }
    public Boolean getIncludeChildTaskExecution() {
        return this.includeChildTaskExecution;
    }

    public ListUserTaskExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserTaskExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserTaskExecutionsRequest setParentTaskExecutionId(String parentTaskExecutionId) {
        this.parentTaskExecutionId = parentTaskExecutionId;
        return this;
    }
    public String getParentTaskExecutionId() {
        return this.parentTaskExecutionId;
    }

    public ListUserTaskExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserTaskExecutionsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListUserTaskExecutionsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListUserTaskExecutionsRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListUserTaskExecutionsRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListUserTaskExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserTaskExecutionsRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public ListUserTaskExecutionsRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public ListUserTaskExecutionsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
