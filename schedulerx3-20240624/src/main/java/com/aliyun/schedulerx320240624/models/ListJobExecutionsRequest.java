// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobExecutionsRequest extends TeaModel {
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
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-12 20:50:56</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The job execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The current page number.</p>
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
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-12 20:50:55</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job execution status. Valid values:</p>
     * <ul>
     * <li>0: <strong>UNKNOWN</strong>.</li>
     * <li>1: <strong>WAITING</strong>.</li>
     * <li>2: <strong>READY</strong>.</li>
     * <li>3: <strong>RUNNING</strong>.</li>
     * <li>4: <strong>SUCCESS</strong>.</li>
     * <li>5: <strong>FAILED</strong>.</li>
     * <li>6: <strong>PAUSED</strong>.</li>
     * <li>7: <strong>SUBMITTED</strong>.</li>
     * <li>8: <strong>REJECTED</strong>.</li>
     * <li>9: <strong>ACCEPTED</strong>.</li>
     * <li>10: <strong>PARTIAL_FAILED</strong>.</li>
     * <li>11: <strong>SKIPPED</strong>.</li>
     * <li>12: <strong>REMOVED</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The workflow instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("WorkflowExecutionId")
    public Long workflowExecutionId;

    public static ListJobExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionsRequest self = new ListJobExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListJobExecutionsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListJobExecutionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListJobExecutionsRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public ListJobExecutionsRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListJobExecutionsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListJobExecutionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListJobExecutionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobExecutionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListJobExecutionsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListJobExecutionsRequest setWorkflowExecutionId(Long workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
        return this;
    }
    public Long getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

}
