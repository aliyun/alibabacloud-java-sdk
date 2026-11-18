// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetLogEventRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxl-job-executor-perf-test-241</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-684d02ee5a6</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1721636220</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The event.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>JOB</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The job execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("JobExecutionId")
    public Long jobExecutionId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test_partition_tbl</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to sort the results in descending order. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sorts the results in descending order.</li>
     * <li><strong>false</strong>: Sorts the results in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The start time. Specify a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1721268302000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The workflow execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1450568762586578000</p>
     */
    @NameInMap("WorkflowExecutionId")
    public Long workflowExecutionId;

    /**
     * <p>The workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>Workflow001</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

    public static GetLogEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogEventRequest self = new GetLogEventRequest();
        return TeaModel.build(map, self);
    }

    public GetLogEventRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLogEventRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetLogEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetLogEventRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public GetLogEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public GetLogEventRequest setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public Long getJobExecutionId() {
        return this.jobExecutionId;
    }

    public GetLogEventRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public GetLogEventRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLogEventRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetLogEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLogEventRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetLogEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetLogEventRequest setWorkflowExecutionId(Long workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
        return this;
    }
    public Long getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    public GetLogEventRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
