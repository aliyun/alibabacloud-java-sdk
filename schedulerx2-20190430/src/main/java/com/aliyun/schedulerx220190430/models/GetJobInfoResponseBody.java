// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the specified node.</p>
     */
    @NameInMap("Data")
    public GetJobInfoResponseBodyData data;

    /**
     * <p>The error message. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>jobid: 92583 not match groupId: testSchedulerx.defaultGroup</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the node details were retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The node details were retrieved.</li>
     * <li><strong>false</strong>: The node details failed to be retrieved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The webhook URL of DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=XXXXXX">https://oapi.dingtalk.com/robot/send?access_token=XXXXXX</a></p>
         */
        @NameInMap("Ding")
        public String ding;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@demo.com">user@demo.com</a></p>
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
         * <p>Specifies whether to enable the failure alert. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enables the failure alert.</li>
         * <li><strong>false</strong>: Disables the failure alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailEnable")
        public Boolean failEnable;

        /**
         * <p>Specifies whether to enable the alert for no available machines.</p>
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
         * <p>The timeout threshold. Unit: seconds. Default value: 7200.</p>
         * 
         * <strong>example:</strong>
         * <p>12300</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable the timeout alert. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enables the timeout alert.</li>
         * <li><strong>false</strong>: Disables the timeout alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <p>Specifies whether to terminate the current trigger upon timeout. This feature is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The contact information.</p>
         */
        @NameInMap("ContactInfo")
        public java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> contactInfo;

        /**
         * <p>The alert switch and threshold configuration.</p>
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
         * <p>The number of threads for a single trigger on a single machine. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsumerSize")
        public Integer consumerSize;

        /**
         * <p>The number of threads for subtask distribution. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DispatcherSize")
        public Integer dispatcherSize;

        /**
         * <p>The number of subtasks pulled per request for parallel nodes. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The maximum number of subtasks that can be cached in the queue. Default value: 10000.</p>
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
         * <p>The maximum number of retries for a subtask on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The custom calendar for the <strong>cron</strong> type. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>The time offset for the <strong>cron</strong> type. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataOffset")
        public Integer dataOffset;

        /**
         * <p>The time expression. The following time expression types are supported:</p>
         * <ul>
         * <li><strong>api</strong>: No time expression is required.</li>
         * <li><strong>fix_rate</strong>: A fixed frequency value. For example, 30 indicates that the node is triggered every 30 seconds.</li>
         * <li><strong>cron</strong>: A standard cron expression.</li>
         * <li><strong>second_delay</strong>: A fixed delay in seconds before each execution (valid range: 1s to 60s).</li>
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
         * <li><strong>1</strong>: cron</li>
         * <li><strong>3</strong>: fix_rate</li>
         * <li><strong>4</strong>: second_delay</li>
         * <li><strong>5</strong>: one_time</li>
         * <li><strong>100</strong>: api</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The retry interval on failure. Unit: seconds. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        /**
         * <p>The full path of the node interface class. This field is available only for Java-type nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.test.helloword</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The script content for script-type nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;clear&quot; &gt; /home/admin/edas-container/logs/catalina.out</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1789454134000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The node execution mode. Valid values:</p>
         * <ul>
         * <li><strong>standalone</strong>: standalone</li>
         * <li><strong>broadcatst</strong>: broadcast</li>
         * <li><strong>parallel</strong>: parallel computing</li>
         * <li><strong>grid</strong>: in-memory grid</li>
         * <li><strong>batch</strong>: grid computing</li>
         * <li><strong>shard</strong>: shard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        @NameInMap("ExecuteMode")
        public String executeMode;

        /**
         * <p>The full path of the file uploaded to Object Storage Service (OSS).</p>
         * <p>If you select JAR package execution, you can upload the corresponding JAR package to this OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/schedulerX/test.jar">https://test.oss-cn-hangzhou.aliyuncs.com/schedulerX/test.jar</a></p>
         */
        @NameInMap("JarUrl")
        public String jarUrl;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>538039</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The node monitoring information.</p>
         */
        @NameInMap("JobMonitorInfo")
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo jobMonitorInfo;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The advanced configuration. This configuration is available only for parallel computing, in-memory grid, and grid computing modes.</p>
         */
        @NameInMap("MapTaskXAttrs")
        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs mapTaskXAttrs;

        /**
         * <p>The maximum number of retries on failure. Set this parameter based on your business requirements. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        /**
         * <p>The maximum number of concurrently running instances. Default value: 1. A value of 1 indicates that if the previous trigger has not finished running, the next trigger is skipped even if the scheduled time has arrived.</p>
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

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enabled. The node can be triggered normally.</li>
         * <li><strong>0</strong>: Disabled. The node is not triggered.</li>
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
        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig timeConfig;

        /**
         * <p>The extended fields of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pageSize&quot;:5,&quot;queueSize&quot;:10,&quot;consumerSize&quot;:5,&quot;dispatcherSize&quot;:5,&quot;taskMaxAttempt&quot;:0,&quot;taskAttemptInterval&quot;:0,&quot;globalConsumerSize&quot;:1000,&quot;taskDispatchMode&quot;:&quot;push&quot;}</p>
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

        public GetJobInfoResponseBodyDataJobConfigInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
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
         * <p>The node configuration information.</p>
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
