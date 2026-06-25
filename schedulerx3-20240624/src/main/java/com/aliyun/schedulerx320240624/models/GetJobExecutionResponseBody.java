// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetJobExecutionResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetJobExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionResponseBody self = new GetJobExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobExecutionResponseBody setData(GetJobExecutionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobExecutionResponseBodyData getData() {
        return this.data;
    }

    public GetJobExecutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobExecutionResponseBodyData extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of execution attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attempt")
        public Integer attempt;

        /**
         * <p>The data timestamp for the job instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11 00:06:10</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The duration of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The time when the job execution ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Details of the executor that ran the job. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;: \&quot;NORMAL\&quot;, \&quot;ActiveCount\&quot;: 4, \&quot;UnavailableCount\&quot;: 0, \&quot;ExpectedCount\&quot;: 4, \&quot;RiskCount\&quot;: 0}</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>The ID of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1310630367761285120</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        /**
         * <p>The ID of the job.</p>
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
         * <p>天猫-自动审单</p>
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
         * <p>/home/avatar/system/services/biz/payment/crontab/monitorpayment.php</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The result of the job execution. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The routing strategy. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: <code>Round Robin</code></p>
         * </li>
         * <li><p><code>2</code>: <code>Random</code></p>
         * </li>
         * <li><p><code>3</code>: <code>First</code></p>
         * </li>
         * <li><p><code>4</code>: <code>Last</code></p>
         * </li>
         * <li><p><code>5</code>: <code>Least Frequently Used</code></p>
         * </li>
         * <li><p><code>6</code>: <code>Least Recently Used</code></p>
         * </li>
         * <li><p><code>7</code>: <code>Consistent Hashing</code></p>
         * </li>
         * <li><p><code>8</code>: <code>Shard Broadcasting</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteStrategy")
        public Integer routeStrategy;

        /**
         * <p>The scheduled time for the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11 00:06:10</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The IP address of the scheduling server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.3.27.76</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The time when the job execution started.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11 00:06:10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The job execution status. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: <code>UNKNOWN</code></p>
         * </li>
         * <li><p><code>1</code>: <code>WAITING</code></p>
         * </li>
         * <li><p><code>2</code>: <code>READY</code></p>
         * </li>
         * <li><p><code>3</code>: <code>RUNNING</code></p>
         * </li>
         * <li><p><code>4</code>: <code>SUCCESS</code></p>
         * </li>
         * <li><p><code>5</code>: <code>FAILED</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The scheduling type of the job. Valid values:</p>
         * <ul>
         * <li><p><code>-1</code>: <code>none</code></p>
         * </li>
         * <li><p><code>1</code>: <code>cron</code></p>
         * </li>
         * <li><p><code>2</code>: <code>fixed_delay</code></p>
         * </li>
         * <li><p><code>3</code>: <code>fixed_rate</code></p>
         * </li>
         * <li><p><code>5</code>: <code>one_time</code></p>
         * </li>
         * <li><p><code>100</code>: <code>api</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <p>Indicates how the job was triggered. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: <code>unknown</code></p>
         * </li>
         * <li><p><code>1</code>: <code>timer_schedule</code></p>
         * </li>
         * <li><p><code>2</code>: <code>rerun</code></p>
         * </li>
         * <li><p><code>3</code>: <code>api_run</code></p>
         * </li>
         * <li><p><code>4</code>: <code>user_retry</code></p>
         * </li>
         * <li><p><code>5</code>: <code>system_retry</code></p>
         * </li>
         * <li><p><code>6</code>: <code>manual</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timer_schedule</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        public static GetJobExecutionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionResponseBodyData self = new GetJobExecutionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetJobExecutionResponseBodyData setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public GetJobExecutionResponseBodyData setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public GetJobExecutionResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetJobExecutionResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobExecutionResponseBodyData setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public GetJobExecutionResponseBodyData setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public GetJobExecutionResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobExecutionResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobExecutionResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobExecutionResponseBodyData setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetJobExecutionResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetJobExecutionResponseBodyData setRouteStrategy(Integer routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public Integer getRouteStrategy() {
            return this.routeStrategy;
        }

        public GetJobExecutionResponseBodyData setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetJobExecutionResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetJobExecutionResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobExecutionResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobExecutionResponseBodyData setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public GetJobExecutionResponseBodyData setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

    }

}
