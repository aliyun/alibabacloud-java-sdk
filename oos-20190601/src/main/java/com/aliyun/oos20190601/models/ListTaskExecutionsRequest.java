// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionsRequest extends TeaModel {
    /**
     * <p>The execution ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("EndDateAfter")
    public String endDateAfter;

    /**
     * <p>Specifies to query task executions that stop running at or later than the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("EndDateBefore")
    public String endDateBefore;

    /**
     * <p>The status of the execution. Valid values: Running, Started, Success, Failed, Waiting, Cancelled, Pending, and Skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-xxx</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The number of entries to return on each page. Valid values: 20 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeChildTaskExecution")
    public Boolean includeChildTaskExecution;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Sorts the task executions to query. Valid values:</p>
     * <ul>
     * <li><strong>StartDate</strong>: specifies that the task executions are sorted based on the time when they are created. This is the default value.</li>
     * <li><strong>EndDate</strong>: specifies that the task executions are sorted based on the time when the time when they stop running.</li>
     * <li><strong>Status</strong>: specifies that the task executions are sorted based on their statuses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ3NjFENDdB</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to show the child nodes in the loop task. Default value: False.</p>
     * 
     * <strong>example:</strong>
     * <p>task-exec-xxx</p>
     */
    @NameInMap("ParentTaskExecutionId")
    public String parentTaskExecutionId;

    /**
     * <p>The ID of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The order in which you want to sort the task executions to query. Valid values:</p>
     * <ul>
     * <li><strong>Ascending</strong>: ascending order.</li>
     * <li><strong>Descending</strong>: descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StartDate</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>Ascending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Specifies to query task executions that stop running at or before the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("StartDateAfter")
    public String startDateAfter;

    /**
     * <p>Specifies to query task executions that start to run at or later than the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("StartDateBefore")
    public String startDateBefore;

    /**
     * <p>Specifies to query task executions that start to run at or before the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The execution ID of the parent node. In a loop task, set this parameter to the execution ID of the parent node.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::Sleep</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-exec-xxx</p>
     */
    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    /**
     * <p>The action of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>describeInstance</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ListTaskExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionsRequest self = new ListTaskExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionsRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListTaskExecutionsRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListTaskExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
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

    public ListTaskExecutionsRequest setParentTaskExecutionId(String parentTaskExecutionId) {
        this.parentTaskExecutionId = parentTaskExecutionId;
        return this;
    }
    public String getParentTaskExecutionId() {
        return this.parentTaskExecutionId;
    }

    public ListTaskExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ListTaskExecutionsRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListTaskExecutionsRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListTaskExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTaskExecutionsRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
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

}
