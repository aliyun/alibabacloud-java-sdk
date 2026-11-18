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
     * <p>The details of the job execution.</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of failed attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attempt")
        public Integer attempt;

        /**
         * <p>The node data timestamp. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11 00:06:10</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The total running duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The expiration time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The executor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;: \&quot;NORMAL\&quot;, \&quot;ActiveCount\&quot;: 4, \&quot;UnavailableCount\&quot;: 0, \&quot;ExpectedCount\&quot;: 4, \&quot;RiskCount\&quot;: 0}</p>
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
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>Tmall-AutoOrderReview</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The job parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/avatar/system/services/biz/payment/crontab/monitorpayment.php</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The routing strategy. Valid values:</p>
         * <ul>
         * <li>1: round-robin</li>
         * <li>2: random</li>
         * <li>3: first</li>
         * <li>4: last</li>
         * <li>5: least frequently used</li>
         * <li>6: least recently used</li>
         * <li>7: consistent hashing</li>
         * <li>8: sharding broadcast</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteStrategy")
        public Integer routeStrategy;

        /**
         * <p>The job scheduling time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11 00:06:10</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>172.3.27.76</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The start time of the job execution. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11 00:06:10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The job execution status. Valid values:</p>
         * <ul>
         * <li>0: UNKNOWN.</li>
         * <li>1: WAITING.</li>
         * <li>2: READY.</li>
         * <li>3: RUNNING.</li>
         * <li>4: SUCCESS.</li>
         * <li>5: FAILED.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time type. Valid values:</p>
         * <ul>
         * <li>-1: none</li>
         * <li>1: cron</li>
         * <li>2: fixed_delay</li>
         * <li>3: fixed_rate</li>
         * <li>5: one_time</li>
         * <li>100: api</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <p>The job trigger type. Valid values:</p>
         * <ul>
         * <li>0: unknown</li>
         * <li>1: timer_schedule</li>
         * <li>2: rerun</li>
         * <li>3: api_run</li>
         * <li>4: user_retry</li>
         * <li>5: system_retry</li>
         * <li>6: manual</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
