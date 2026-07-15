// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The node list information.</p>
     */
    @NameInMap("Data")
    public ListJobsResponseBodyData data;

    /**
     * <p>The error message. This parameter is returned only if an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace can not find namespace: 1a72ecb1-b4cc-400a-a71b-20cdec9b****, namespaceSource:null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB58B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>**********</p>
         */
        @NameInMap("Ding")
        public String ding;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@mail.com">user@mail.com</a></p>
         */
        @NameInMap("UserMail")
        public String userMail;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile phone number of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
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
         * <p>Specifies whether to enable the failure alert switch. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailEnable")
        public Boolean failEnable;

        /**
         * <p>Specifies whether to enable the no-available-machine alert.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MissWorkerEnable")
        public Boolean missWorkerEnable;

        /**
         * <p>The alert notification method. Currently, only sms is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>sms</p>
         */
        @NameInMap("SendChannel")
        public String sendChannel;

        /**
         * <p>The timeout threshold, in seconds. Default value: 7200.</p>
         * 
         * <strong>example:</strong>
         * <p>12300</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable the timeout alert switch. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <p>Specifies whether to enable the timeout termination switch for the current trigger. This is disabled by default. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The alert switch and threshold configuration.</p>
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
         * <p>The number of threads for a single trigger on a single machine. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsumerSize")
        public Integer consumerSize;

        /**
         * <p>The number of subtask dispatch threads. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DispatcherSize")
        public Integer dispatcherSize;

        /**
         * <p>The number of subtasks pulled per batch for a parallel node. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The upper limit of the subtask queue cache. Default value: 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("QueueSize")
        public Integer queueSize;

        /**
         * <p>The retry interval for a subtask on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskAttemptInterval")
        public Integer taskAttemptInterval;

        /**
         * <p>The number of retries for a subtask on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The custom calendar that can be specified for the cron type.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>The time offset that can be specified for the cron type, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataOffset")
        public Integer dataOffset;

        /**
         * <p>The time expression. Valid values:</p>
         * <ul>
         * <li><p><strong>api</strong>: No time expression.</p>
         * </li>
         * <li><p><strong>fix_rate</strong>: A specific fixed frequency value. For example, 30 indicates that the node is triggered every 30 seconds.</p>
         * </li>
         * <li><p><strong>cron</strong>: A standard cron expression.</p>
         * </li>
         * <li><p><strong>second_delay</strong>: A fixed delay in seconds before each execution (1s to 60s).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0 0/10 * * * ?</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The time configuration type. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: cron</p>
         * </li>
         * <li><p><strong>3</strong>: fix_rate</p>
         * </li>
         * <li><p><strong>4</strong>: second_delay</p>
         * </li>
         * <li><p><strong>100</strong>: api</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The retry interval on error, in seconds. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        /**
         * <p>The full path of the node interface class. This field is returned only when the node is of the Java type.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.schedulerx.test.helloworld</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The script code content for Python, Shell, or Go node types.</p>
         * 
         * <strong>example:</strong>
         * <p>echo \&quot;hello\&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The node execution mode. Valid values:</p>
         * <ul>
         * <li><p><strong>standalone</strong>: standalone</p>
         * </li>
         * <li><p><strong>broadcast</strong>: broadcast</p>
         * </li>
         * <li><p><strong>parallel</strong>: parallel computing</p>
         * </li>
         * <li><p><strong>grid</strong>: memory grid</p>
         * </li>
         * <li><p><strong>batch</strong>: grid computing</p>
         * </li>
         * <li><p><strong>shard</strong>: shard</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        @NameInMap("ExecuteMode")
        public String executeMode;

        /**
         * <p>The full path of the JAR package in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>https:doc***.oss-cn-hangzhou.aliyuncs.com/sc-****-D-0.0.2-SNAPSHOT.jar</p>
         */
        @NameInMap("JarUrl")
        public String jarUrl;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99341</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The node monitoring information.</p>
         */
        @NameInMap("JobMonitorInfo")
        public ListJobsResponseBodyDataJobsJobMonitorInfo jobMonitorInfo;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The advanced configuration. This is used only for parallel computing, memory grid, and grid computing.</p>
         */
        @NameInMap("MapTaskXAttrs")
        public ListJobsResponseBodyDataJobsMapTaskXAttrs mapTaskXAttrs;

        /**
         * <p>The maximum number of retries on error. Set this based on business requirements. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        /**
         * <p>The maximum number of concurrently running instances. Default value: 1. This means that if the previous trigger has not finished running, the next trigger will not be initiated even if the scheduled time has arrived.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxConcurrency")
        public String maxConcurrency;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>helloworld</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user-defined parameters that can be obtained at runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Enabled. The node can be triggered normally.</p>
         * </li>
         * <li><p><strong>0</strong>: Disabled. The node will not be triggered.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time configuration information.</p>
         */
        @NameInMap("TimeConfig")
        public ListJobsResponseBodyDataJobsTimeConfig timeConfig;

        /**
         * <p>The node extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pageSize&quot;:5,&quot;queueSize&quot;:10,&quot;consumerSize&quot;:5,&quot;dispatcherSize&quot;:5,&quot;taskMaxAttempt&quot;:0,&quot;taskAttemptInterval&quot;:0,&quot;globalConsumerSize&quot;:1000,&quot;taskDispatchMode&quot;:&quot;push&quot;}</p>
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

        public ListJobsResponseBodyDataJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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
         * <p>The node list and node details.</p>
         */
        @NameInMap("Jobs")
        public java.util.List<ListJobsResponseBodyDataJobs> jobs;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         */
        @NameInMap("Total")
        public Integer total;

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

        public ListJobsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
