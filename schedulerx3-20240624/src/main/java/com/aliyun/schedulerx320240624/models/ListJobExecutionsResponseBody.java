// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobExecutionsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public ListJobExecutionsResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier for the request. Alibaba Cloud generates this ID to help troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6BCE89B3-E882-511D-9A75-D452A56EC4B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListJobExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionsResponseBody self = new ListJobExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobExecutionsResponseBody setData(ListJobExecutionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobExecutionsResponseBodyData getData() {
        return this.data;
    }

    public ListJobExecutionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobExecutionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobExecutionsResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The attempt number for this execution. <code>1</code> indicates the initial run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attempt")
        public Integer attempt;

        /**
         * <p>The data timestamp for the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The duration of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The time when the job execution ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>1827811800526000</p>
         */
        @NameInMap("Executor")
        public String executor;

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
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The type of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The parameters of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>name=zhangsan</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The strategy for routing the job to a worker. Valid values:</p>
         * <ul>
         * <li><p>1: Round-robin</p>
         * </li>
         * <li><p>2: Random</p>
         * </li>
         * <li><p>3: First</p>
         * </li>
         * <li><p>4: Last</p>
         * </li>
         * <li><p>5: Least Frequently Used</p>
         * </li>
         * <li><p>6: Least Recently Used</p>
         * </li>
         * <li><p>7: Consistent Hashing</p>
         * </li>
         * <li><p>8: Sharded Broadcasting</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteStrategy")
        public Integer routeStrategy;

        /**
         * <p>The time when the job was scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The IP address of the scheduler node.</p>
         * 
         * <strong>example:</strong>
         * <p>28.0.168.46</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The job execution status. Valid values:</p>
         * <ul>
         * <li><p>0: UNKNOWN</p>
         * </li>
         * <li><p>1: WAITING</p>
         * </li>
         * <li><p>2: READY</p>
         * </li>
         * <li><p>3: RUNNING</p>
         * </li>
         * <li><p>4: SUCCESS</p>
         * </li>
         * <li><p>5: FAILED</p>
         * </li>
         * <li><p>6: PAUSED</p>
         * </li>
         * <li><p>7: SUBMITTED</p>
         * </li>
         * <li><p>8: REJECTED</p>
         * </li>
         * <li><p>9: ACCEPTED</p>
         * </li>
         * <li><p>10: PARTIAL_FAILED</p>
         * </li>
         * <li><p>11: SKIPPED</p>
         * </li>
         * <li><p>12: REMOVED</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li><p>-1: none<br></p>
         * </li>
         * <li><p>1: cron<br></p>
         * </li>
         * <li><p>3: fix_rate<br></p>
         * </li>
         * <li><p>5: one_time<br></p>
         * </li>
         * <li><p>100: api</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <p>The total number of tokens consumed by the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TotalTokens")
        public Integer totalTokens;

        /**
         * <p>The method that triggered the job. Valid values:</p>
         * <ul>
         * <li><p>0: unknown</p>
         * </li>
         * <li><p>1: schedule</p>
         * </li>
         * <li><p>2: rerun</p>
         * </li>
         * <li><p>3: api</p>
         * </li>
         * <li><p>4: user_retry</p>
         * </li>
         * <li><p>5: system_retry</p>
         * </li>
         * <li><p>6: manual</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        /**
         * <p>The address of the worker that executed the job instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://192.168.1.9:9999/">http://192.168.1.9:9999/</a></p>
         */
        @NameInMap("WorkAddr")
        public String workAddr;

        /**
         * <p>The ID of the parent workflow instance, if applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WorkflowExecutionId")
        public String workflowExecutionId;

        /**
         * <p>The ID of the parent workflow, if applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The name of the parent workflow, if applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("WorkflowName")
        public String workflowName;

        /**
         * <p>The extended attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;ac21f9f6-5a88-4f97-abd1-b51989166035&quot;}</p>
         */
        @NameInMap("XAttrs")
        public String XAttrs;

        public static ListJobExecutionsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutionsResponseBodyDataRecords self = new ListJobExecutionsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListJobExecutionsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListJobExecutionsResponseBodyDataRecords setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public ListJobExecutionsResponseBodyDataRecords setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public ListJobExecutionsResponseBodyDataRecords setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListJobExecutionsResponseBodyDataRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListJobExecutionsResponseBodyDataRecords setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobExecutionsResponseBodyDataRecords setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListJobExecutionsResponseBodyDataRecords setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListJobExecutionsResponseBodyDataRecords setRouteStrategy(Integer routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public Integer getRouteStrategy() {
            return this.routeStrategy;
        }

        public ListJobExecutionsResponseBodyDataRecords setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListJobExecutionsResponseBodyDataRecords setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public ListJobExecutionsResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListJobExecutionsResponseBodyDataRecords setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public ListJobExecutionsResponseBodyDataRecords setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public ListJobExecutionsResponseBodyDataRecords setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkAddr(String workAddr) {
            this.workAddr = workAddr;
            return this;
        }
        public String getWorkAddr() {
            return this.workAddr;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkflowExecutionId(String workflowExecutionId) {
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

        public ListJobExecutionsResponseBodyDataRecords setXAttrs(String XAttrs) {
            this.XAttrs = XAttrs;
            return this;
        }
        public String getXAttrs() {
            return this.XAttrs;
        }

    }

    public static class ListJobExecutionsResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>A list of job instances.</p>
         */
        @NameInMap("Records")
        public java.util.List<ListJobExecutionsResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries found.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListJobExecutionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutionsResponseBodyData self = new ListJobExecutionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobExecutionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobExecutionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobExecutionsResponseBodyData setRecords(java.util.List<ListJobExecutionsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListJobExecutionsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListJobExecutionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
