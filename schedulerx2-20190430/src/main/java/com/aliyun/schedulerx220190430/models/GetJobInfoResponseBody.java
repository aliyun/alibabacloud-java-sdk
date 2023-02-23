// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the job.</p>
     */
    @NameInMap("Data")
    public GetJobInfoResponseBodyData data;

    /**
     * <p>The error message that is returned only when an error occurs.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the job details are obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The job details are obtained.</p>
     * <p>*   **false**: Failed to obtain the job details.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponseBody self = new GetJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobInfoResponseBody setData(GetJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInfoResponseBodyData getData() {
        return this.data;
    }

    public GetJobInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo extends TeaModel {
        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("Ding")
        public String ding;

        /**
         * <p>The email address of the user.</p>
         */
        @NameInMap("UserMail")
        public String userMail;

        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile number of the user.</p>
         */
        @NameInMap("UserPhone")
        public String userPhone;

        public static GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo self = new GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig extends TeaModel {
        /**
         * <p>Indicates whether an alert is generated upon a failure. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("FailEnable")
        public Boolean failEnable;

        /**
         * <p>Indicates whether an alert is generated if no worker is available.</p>
         */
        @NameInMap("MissWorkerEnable")
        public Boolean missWorkerEnable;

        /**
         * <p>The notification method. Only Short Message Service (SMS) is supported.</p>
         */
        @NameInMap("SendChannel")
        public String sendChannel;

        /**
         * <p>The timeout threshold. Unit: seconds. Default value: 7200.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Indicates whether an alert is generated upon a timeout. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <p>Indicates whether the job is terminated upon a timeout. By default, this feature is disabled.</p>
         */
        @NameInMap("TimeoutKillEnable")
        public Boolean timeoutKillEnable;

        public static GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig self = new GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setFailEnable(Boolean failEnable) {
            this.failEnable = failEnable;
            return this;
        }
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setMissWorkerEnable(Boolean missWorkerEnable) {
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
            return this;
        }
        public String getSendChannel() {
            return this.sendChannel;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setTimeoutEnable(Boolean timeoutEnable) {
            this.timeoutEnable = timeoutEnable;
            return this;
        }
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setTimeoutKillEnable(Boolean timeoutKillEnable) {
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo extends TeaModel {
        /**
         * <p>The contact Information.</p>
         */
        @NameInMap("ContactInfo")
        public java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> contactInfo;

        /**
         * <p>The configurations of the alerting feature and alert thresholds.</p>
         */
        @NameInMap("MonitorConfig")
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig monitorConfig;

        public static GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo self = new GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo setContactInfo(java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> getContactInfo() {
            return this.contactInfo;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo setMonitorConfig(GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs extends TeaModel {
        /**
         * <p>The number of threads that are triggered by an instance. Default value: 5.</p>
         */
        @NameInMap("ConsumerSize")
        public Integer consumerSize;

        /**
         * <p>The number of task distribution threads. Default value: 5.</p>
         */
        @NameInMap("DispatcherSize")
        public Integer dispatcherSize;

        /**
         * <p>The number of tasks that are returned for a parallel job at a time. Default value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The maximum number of tasks that can be queued. Default value: 10000.</p>
         */
        @NameInMap("QueueSize")
        public Integer queueSize;

        /**
         * <p>The retry interval of the task after a task failure.</p>
         */
        @NameInMap("TaskAttemptInterval")
        public Integer taskAttemptInterval;

        /**
         * <p>The number of retries after a task failure.</p>
         */
        @NameInMap("TaskMaxAttempt")
        public Integer taskMaxAttempt;

        public static GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs self = new GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setConsumerSize(Integer consumerSize) {
            this.consumerSize = consumerSize;
            return this;
        }
        public Integer getConsumerSize() {
            return this.consumerSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setDispatcherSize(Integer dispatcherSize) {
            this.dispatcherSize = dispatcherSize;
            return this;
        }
        public Integer getDispatcherSize() {
            return this.dispatcherSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setQueueSize(Integer queueSize) {
            this.queueSize = queueSize;
            return this;
        }
        public Integer getQueueSize() {
            return this.queueSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setTaskAttemptInterval(Integer taskAttemptInterval) {
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }
        public Integer getTaskAttemptInterval() {
            return this.taskAttemptInterval;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setTaskMaxAttempt(Integer taskMaxAttempt) {
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }
        public Integer getTaskMaxAttempt() {
            return this.taskMaxAttempt;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoTimeConfig extends TeaModel {
        /**
         * <p>If the TimeType parameter is set to **1** (cron), you can customize the calendar.</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>If the TimeType parameter is set to **1** (cron), you can configure the time offset. Unit: seconds.</p>
         */
        @NameInMap("DataOffset")
        public Integer dataOffset;

        /**
         * <p>The time expression. The time expression varies with the time type:</p>
         * <br>
         * <p>*   **api**: No time expression exists.</p>
         * <p>*   **fix_rate**: a specific fixed frequency. For example, a value of 30 indicates that the job is triggered every 30 seconds.</p>
         * <p>*   **cron**: a standard Cron expression.</p>
         * <p>*   **second_delay**: a fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The time type. Valid values:</p>
         * <br>
         * <p>*   **1**: cron</p>
         * <p>*   **3**: fix_rate</p>
         * <p>*   **4**: second_delay</p>
         * <p>*   **100**: api</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        public static GetJobInfoResponseBodyDataJobConfigInfoTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoTimeConfig self = new GetJobInfoResponseBodyDataJobConfigInfoTimeConfig();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setDataOffset(Integer dataOffset) {
            this.dataOffset = dataOffset;
            return this;
        }
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfo extends TeaModel {
        /**
         * <p>The interval at which the system retries to run the job after a job failure. Unit: seconds. Default value: 30.</p>
         */
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        /**
         * <p>The full path of the job interface class. This parameter is returned only for jobs whose job type is Java.</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The script of a script job.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the job.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The execution mode of the job. Valid values:</p>
         * <br>
         * <p>*   **standalone**</p>
         * <p>*   **broadcast**</p>
         * <p>*   **parallel**</p>
         * <p>*   **grid**</p>
         * <p>*   **batch**</p>
         * <p>*   **shard**</p>
         */
        @NameInMap("ExecuteMode")
        public String executeMode;

        /**
         * <p>The full path that is used to upload files to Object Storage Service (OSS).</p>
         * <br>
         * <p>If you use a JAR package, you can upload the JAR package to this OSS path.</p>
         */
        @NameInMap("JarUrl")
        public String jarUrl;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The monitoring information of the job.</p>
         */
        @NameInMap("JobMonitorInfo")
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo jobMonitorInfo;

        /**
         * <p>The type of the job.</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The advanced configurations of the job. The parameters are returned only if the execution mode of the job is parallel, grid, or batch.</p>
         */
        @NameInMap("MapTaskXAttrs")
        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs mapTaskXAttrs;

        /**
         * <p>The maximum number of retries after a job failure. This parameter is specified based on your business requirements. Default value: 0.</p>
         */
        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        /**
         * <p>The maximum number of concurrent instances. Default value: 1. A value of 1 indicates that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the next instance is reached.</p>
         */
        @NameInMap("MaxConcurrency")
        public String maxConcurrency;

        /**
         * <p>The name of the job.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user-defined parameters. These parameters can be obtained when the job is running.</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **1**: The job is enabled and can be triggered.</p>
         * <p>*   **0**: The job is disabled and cannot be triggered.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time configurations.</p>
         */
        @NameInMap("TimeConfig")
        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig timeConfig;

        /**
         * <p>The extended fields.</p>
         */
        @NameInMap("XAttrs")
        public String XAttrs;

        public static GetJobInfoResponseBodyDataJobConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfo self = new GetJobInfoResponseBodyDataJobConfigInfo();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setAttemptInterval(Integer attemptInterval) {
            this.attemptInterval = attemptInterval;
            return this;
        }
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJarUrl(String jarUrl) {
            this.jarUrl = jarUrl;
            return this;
        }
        public String getJarUrl() {
            return this.jarUrl;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJobMonitorInfo(GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo jobMonitorInfo) {
            this.jobMonitorInfo = jobMonitorInfo;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo getJobMonitorInfo() {
            return this.jobMonitorInfo;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setMapTaskXAttrs(GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs mapTaskXAttrs) {
            this.mapTaskXAttrs = mapTaskXAttrs;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs getMapTaskXAttrs() {
            return this.mapTaskXAttrs;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setMaxAttempt(Integer maxAttempt) {
            this.maxAttempt = maxAttempt;
            return this;
        }
        public Integer getMaxAttempt() {
            return this.maxAttempt;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setMaxConcurrency(String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setTimeConfig(GetJobInfoResponseBodyDataJobConfigInfoTimeConfig timeConfig) {
            this.timeConfig = timeConfig;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig getTimeConfig() {
            return this.timeConfig;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setXAttrs(String XAttrs) {
            this.XAttrs = XAttrs;
            return this;
        }
        public String getXAttrs() {
            return this.XAttrs;
        }

    }

    public static class GetJobInfoResponseBodyData extends TeaModel {
        /**
         * <p>The configurations of the job.</p>
         */
        @NameInMap("JobConfigInfo")
        public GetJobInfoResponseBodyDataJobConfigInfo jobConfigInfo;

        public static GetJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyData self = new GetJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyData setJobConfigInfo(GetJobInfoResponseBodyDataJobConfigInfo jobConfigInfo) {
            this.jobConfigInfo = jobConfigInfo;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfo getJobConfigInfo() {
            return this.jobConfigInfo;
        }

    }

}
