// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListScheduleEventRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query events. This is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1728872796295</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The event status to filter by. Valid values:</p>
     * <ul>
     * <li><p>Scheduled</p>
     * </li>
     * <li><p>Running</p>
     * </li>
     * <li><p>Succeeded</p>
     * </li>
     * <li><p>Failed</p>
     * </li>
     * <li><p>Failing_Auto_Retry</p>
     * </li>
     * <li><p>Skip_Schedule</p>
     * </li>
     * <li><p>Execute_Log</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Failed</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>JOB | WORKFLOW</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The job execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>hello word</p>
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
     * <p>The number of events to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to sort the results in descending order. Set to <code>true</code> for descending order or <code>false</code> for ascending order. Default is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The start of the time range to query events. This is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1581317873000</p>
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
     * <p>流程001</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

    public static ListScheduleEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleEventRequest self = new ListScheduleEventRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduleEventRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListScheduleEventRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListScheduleEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListScheduleEventRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ListScheduleEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListScheduleEventRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public ListScheduleEventRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListScheduleEventRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListScheduleEventRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListScheduleEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScheduleEventRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListScheduleEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListScheduleEventRequest setWorkflowExecutionId(Long workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
        return this;
    }
    public Long getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    public ListScheduleEventRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
