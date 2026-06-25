// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListWorkflowExecutionsRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range for filtering executions. The time must be in <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-13 16:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of results to return. Defaults to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. For the first request, do not specify this parameter. If the response does not include a <code>NextToken</code>, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start of the time range for filtering executions. The time must be in <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-27 02:15:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The workflow execution status. Use this parameter to filter executions by status. Valid values:</p>
     * <ul>
     * <li><p>0: unknown</p>
     * </li>
     * <li><p>1: waiting</p>
     * </li>
     * <li><p>2: queued</p>
     * </li>
     * <li><p>3: running</p>
     * </li>
     * <li><p>4: success</p>
     * </li>
     * <li><p>5: failed</p>
     * </li>
     * <li><p>6: killed</p>
     * </li>
     * <li><p>7: held</p>
     * </li>
     * <li><p>8: mark_success</p>
     * </li>
     * <li><p>9: skipped</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The workflow execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("WorkflowExecutionId")
    public Long workflowExecutionId;

    /**
     * <p>The workflow ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>The workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>myWorkflow</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

    public static ListWorkflowExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowExecutionsRequest self = new ListWorkflowExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowExecutionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListWorkflowExecutionsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListWorkflowExecutionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListWorkflowExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowExecutionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListWorkflowExecutionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowExecutionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListWorkflowExecutionsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListWorkflowExecutionsRequest setWorkflowExecutionId(Long workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
        return this;
    }
    public Long getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    public ListWorkflowExecutionsRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public ListWorkflowExecutionsRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
