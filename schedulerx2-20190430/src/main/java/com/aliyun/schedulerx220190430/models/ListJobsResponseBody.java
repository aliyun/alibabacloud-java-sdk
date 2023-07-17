// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the jobs.</p>
     */
    @NameInMap("Data")
    public ListJobsResponseBodyData data;

    /**
     * <p>The error message that is returned if an error occurs.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call is successful.</p>
     * <p>*   **false**: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobsResponseBody setData(ListJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobsResponseBodyData getData() {
        return this.data;
    }

    public ListJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo extends TeaModel {
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
         * <p>The username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile number of the user.</p>
         */
        @NameInMap("UserPhone")
        public String userPhone;

        public static ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo self = new ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

    public static class ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig extends TeaModel {
        /**
         * <p>Indicates whether the feature of generating an alert upon a failure is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("FailEnable")
        public Boolean failEnable;

        /**
         * <p>Indicates whether the feature of generating an alert when no machine is available for running the job is enabled.</p>
         */
        @NameInMap("MissWorkerEnable")
        public Boolean missWorkerEnable;

        /**
         * <p>The method that is used to send an alert notification. Only Short Message Service (SMS) is supported.</p>
         */
        @NameInMap("SendChannel")
        public String sendChannel;

        /**
         * <p>The timeout threshold. Unit: seconds. Default value: 7200.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Indicates whether the feature of generating an alert upon a timeout is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <p>Indicates whether the feature of stopping job triggering upon a timeout is enabled. By default, the feature is disabled.</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("TimeoutKillEnable")
        public Boolean timeoutKillEnable;

        public static ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig self = new ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setFailEnable(Boolean failEnable) {
            this.failEnable = failEnable;
            return this;
        }
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setMissWorkerEnable(Boolean missWorkerEnable) {
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
            return this;
        }
        public String getSendChannel() {
            return this.sendChannel;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setTimeoutEnable(Boolean timeoutEnable) {
            this.timeoutEnable = timeoutEnable;
            return this;
        }
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setTimeoutKillEnable(Boolean timeoutKillEnable) {
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

    }

    public static class ListJobsResponseBodyDataJobsJobMonitorInfo extends TeaModel {
        /**
         * <p>The contact information.</p>
         */
        @NameInMap("ContactInfo")
        public java.util.List<ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo> contactInfo;

        /**
         * <p>The configurations of the alerting feature and the alert threshold.</p>
         */
        @NameInMap("MonitorConfig")
        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig monitorConfig;

        public static ListJobsResponseBodyDataJobsJobMonitorInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsJobMonitorInfo self = new ListJobsResponseBodyDataJobsJobMonitorInfo();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfo setContactInfo(java.util.List<ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo> contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo> getContactInfo() {
            return this.contactInfo;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfo setMonitorConfig(ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

    }

    public static class ListJobsResponseBodyDataJobsMapTaskXAttrs extends TeaModel {
        /**
         * <p>The number of threads that are triggered by a standalone job at a time. Default value: 5.</p>
         */
        @NameInMap("ConsumerSize")
        public Integer consumerSize;

        /**
         * <p>The number of task distribution threads. Default value: 5.</p>
         */
        @NameInMap("DispatcherSize")
        public Integer dispatcherSize;

        /**
         * <p>The number of tasks that are pulled by a parallel job at a time. Default value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The maximum number of task queues that can be cached. Default value: 10000.</p>
         */
        @NameInMap("QueueSize")
        public Integer queueSize;

        /**
         * <p>The interval at which the system retries to run the task after a task failure.</p>
         */
        @NameInMap("TaskAttemptInterval")
        public Integer taskAttemptInterval;

        /**
         * <p>The number of retries after a task failure.</p>
         */
        @NameInMap("TaskMaxAttempt")
        public Integer taskMaxAttempt;

        public static ListJobsResponseBodyDataJobsMapTaskXAttrs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsMapTaskXAttrs self = new ListJobsResponseBodyDataJobsMapTaskXAttrs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setConsumerSize(Integer consumerSize) {
            this.consumerSize = consumerSize;
            return this;
        }
        public Integer getConsumerSize() {
            return this.consumerSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setDispatcherSize(Integer dispatcherSize) {
            this.dispatcherSize = dispatcherSize;
            return this;
        }
        public Integer getDispatcherSize() {
            return this.dispatcherSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setQueueSize(Integer queueSize) {
            this.queueSize = queueSize;
            return this;
        }
        public Integer getQueueSize() {
            return this.queueSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setTaskAttemptInterval(Integer taskAttemptInterval) {
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }
        public Integer getTaskAttemptInterval() {
            return this.taskAttemptInterval;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setTaskMaxAttempt(Integer taskMaxAttempt) {
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }
        public Integer getTaskMaxAttempt() {
            return this.taskMaxAttempt;
        }

    }

    public static class ListJobsResponseBodyDataJobsTimeConfig extends TeaModel {
        /**
         * <p>If the TimeType parameter is set to cron, you can specify custom calendar days.</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>The time offset if the TimeType parameter is set to cron. Unit: seconds.</p>
         */
        @NameInMap("DataOffset")
        public Integer dataOffset;

        /**
         * <p>The time expression. Valid values:</p>
         * <br>
         * <p>*   **api**: indicates that no time expression is used to specify the time when to schedule the job.</p>
         * <p>*   **fix_rate**: indicates that the job is triggered at a fixed frequency. For example, a value of 30 indicates that the job is triggered every 30 seconds.</p>
         * <p>*   **cron**: indicates that a standard CRON expression is used to specify the time when to schedule the job.</p>
         * <p>*   **second_delay**: indicates that the job is triggered after a fixed delay. Valid values: 1 to 60. Unit: seconds.</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The method that is used to specify the time when to schedule the job. Valid values:</p>
         * <br>
         * <p>*   **1**: cron</p>
         * <p>*   **3**: fix_rate</p>
         * <p>*   **4**: second_delay</p>
         * <p>*   **100**: api</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        public static ListJobsResponseBodyDataJobsTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsTimeConfig self = new ListJobsResponseBodyDataJobsTimeConfig();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsTimeConfig setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public ListJobsResponseBodyDataJobsTimeConfig setDataOffset(Integer dataOffset) {
            this.dataOffset = dataOffset;
            return this;
        }
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        public ListJobsResponseBodyDataJobsTimeConfig setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public ListJobsResponseBodyDataJobsTimeConfig setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

    }

    public static class ListJobsResponseBodyDataJobs extends TeaModel {
        /**
         * <p>The interval at which the system retries to run the job after a job failure. Unit: seconds. Default value: 30.</p>
         */
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        /**
         * <p>The full path of the job interface class. This parameter is returned only for a Java job.</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The script of the job. This parameter is returned only for a Python, Shell, or Go job.</p>
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
         * <p>*   **standalone**: The job runs in standalone mode.</p>
         * <p>*   **broadcast**: The job runs in broadcast mode.</p>
         * <p>*   **parallel**: The job runs in parallel computing mode.</p>
         * <p>*   **grid**: The job runs in memory grid mode.</p>
         * <p>*   **batch**: The job runs in grid computing mode.</p>
         * <p>*   **shard**: The job runs in multipart mode.</p>
         */
        @NameInMap("ExecuteMode")
        public String executeMode;

        /**
         * <p>The full path to which a JAR package is uploaded in Object Storage Service (OSS).</p>
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
        public ListJobsResponseBodyDataJobsJobMonitorInfo jobMonitorInfo;

        /**
         * <p>The type of the job.</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The advanced configurations of the job. The parameters are returned only if the value of the ExecuteMode parameter is parallel, grid, or batch.</p>
         */
        @NameInMap("MapTaskXAttrs")
        public ListJobsResponseBodyDataJobsMapTaskXAttrs mapTaskXAttrs;

        /**
         * <p>The maximum number of retries after a job failure. This parameter is specified based on your business requirements. Default value: 0.</p>
         */
        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        /**
         * <p>The maximum number of instances that can concurrently run for the job. Default value: 1. A value of 1 indicates that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the instance is reached.</p>
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
         * <p>Indicates whether the job is enabled. Valid values:</p>
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
        public ListJobsResponseBodyDataJobsTimeConfig timeConfig;

        /**
         * <p>The extended fields.</p>
         */
        @NameInMap("XAttrs")
        public String XAttrs;

        public static ListJobsResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobs self = new ListJobsResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobs setAttemptInterval(Integer attemptInterval) {
            this.attemptInterval = attemptInterval;
            return this;
        }
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        public ListJobsResponseBodyDataJobs setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListJobsResponseBodyDataJobs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobsResponseBodyDataJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobsResponseBodyDataJobs setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public ListJobsResponseBodyDataJobs setJarUrl(String jarUrl) {
            this.jarUrl = jarUrl;
            return this;
        }
        public String getJarUrl() {
            return this.jarUrl;
        }

        public ListJobsResponseBodyDataJobs setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyDataJobs setJobMonitorInfo(ListJobsResponseBodyDataJobsJobMonitorInfo jobMonitorInfo) {
            this.jobMonitorInfo = jobMonitorInfo;
            return this;
        }
        public ListJobsResponseBodyDataJobsJobMonitorInfo getJobMonitorInfo() {
            return this.jobMonitorInfo;
        }

        public ListJobsResponseBodyDataJobs setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobsResponseBodyDataJobs setMapTaskXAttrs(ListJobsResponseBodyDataJobsMapTaskXAttrs mapTaskXAttrs) {
            this.mapTaskXAttrs = mapTaskXAttrs;
            return this;
        }
        public ListJobsResponseBodyDataJobsMapTaskXAttrs getMapTaskXAttrs() {
            return this.mapTaskXAttrs;
        }

        public ListJobsResponseBodyDataJobs setMaxAttempt(Integer maxAttempt) {
            this.maxAttempt = maxAttempt;
            return this;
        }
        public Integer getMaxAttempt() {
            return this.maxAttempt;
        }

        public ListJobsResponseBodyDataJobs setMaxConcurrency(String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListJobsResponseBodyDataJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsResponseBodyDataJobs setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListJobsResponseBodyDataJobs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyDataJobs setTimeConfig(ListJobsResponseBodyDataJobsTimeConfig timeConfig) {
            this.timeConfig = timeConfig;
            return this;
        }
        public ListJobsResponseBodyDataJobsTimeConfig getTimeConfig() {
            return this.timeConfig;
        }

        public ListJobsResponseBodyDataJobs setXAttrs(String XAttrs) {
            this.XAttrs = XAttrs;
            return this;
        }
        public String getXAttrs() {
            return this.XAttrs;
        }

    }

    public static class ListJobsResponseBodyData extends TeaModel {
        /**
         * <p>The jobs and their details.</p>
         */
        @NameInMap("Jobs")
        public java.util.List<ListJobsResponseBodyDataJobs> jobs;

        public static ListJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyData self = new ListJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyData setJobs(java.util.List<ListJobsResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

    }

}
