// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The interval of retries after a job failure. Default value: 30. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <p>If you set TimeType to 1 (cron), you can specify calendar days.</p>
     * 
     * <strong>example:</strong>
     * <p>This parameter is not supported. You do not need to specify this parameter.</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The full path of the job interface class.</p>
     * <p>This parameter is available only when you set JobType to java. You must enter a full path.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.schedulerx.test.helloworld</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The number of threads that are triggered by a single worker at a time. Default value: 5. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ConsumerSize")
    public Integer consumerSize;

    /**
     * <p>The information about the alert contact.</p>
     */
    @NameInMap("ContactInfo")
    public java.util.List<CreateJobRequestContactInfo> contactInfo;

    /**
     * <p>The script content. This parameter is required when you set JobType to python, shell, go, or k8s.</p>
     * 
     * <strong>example:</strong>
     * <p>echo \&quot;hello\&quot;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>If you set TimeType to 1 (cron), you can specify a time offset. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2400</p>
     */
    @NameInMap("DataOffset")
    public Integer dataOffset;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of task distribution threads. Default value: 5. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DispatcherSize")
    public Integer dispatcherSize;

    /**
     * <p>The execution mode of the job. Valid values:</p>
     * <ul>
     * <li><strong>Stand-alone operation</strong></li>
     * <li><strong>Broadcast run</strong></li>
     * <li><strong>Visual MapReduce</strong></li>
     * <li><strong>MapReduce</strong></li>
     * <li><strong>Shard run</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standalone</p>
     */
    @NameInMap("ExecuteMode")
    public String executeMode;

    /**
     * <p>Specifies whether to turn on Failure alarm. If the switch is turned on, an alert will be generated upon a failure. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FailEnable")
    public Boolean failEnable;

    /**
     * <p>The number of consecutive failures. An alert will be received if the number of consecutive failures reaches the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailTimes")
    public Integer failTimes;

    /**
     * <p>The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>java</li>
     * <li>python</li>
     * <li>shell</li>
     * <li>go</li>
     * <li>http</li>
     * <li>xxljob</li>
     * <li>dataworks</li>
     * <li>k8s</li>
     * <li>springschedule</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The maximum number of retries after a job failure. Specify this parameter based on your business requirements. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrent instances. Default value: 1. The default value indicates that only one instance is allowed to run at a time. When an instance is running, another instance is not triggered even if the scheduled time for running the instance is reached.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>Specifies whether to turn on No machine alarm available. If the switch is turned on, an alert will be generated when no machine is available for running the job. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MissWorkerEnable")
    public Boolean missWorkerEnable;

    /**
     * <p>The job name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>helloworld</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The namespace source. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The number of tasks that can be pulled at a time. Default value: 100. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The user-defined parameters that you can obtain when the job is running.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The maximum number of tasks that can be queued. Default value: 10000. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("QueueSize")
    public Integer queueSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The method that is used to send alerts. Only Short Message Service (SMS) is supported. Default value: sms.</p>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("SendChannel")
    public String sendChannel;

    /**
     * <p>Specifies whether to enable the job. If this parameter is set to 0, the job is disabled. If this parameter is set to 1, the job is enabled. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Specifies whether to turn on Successful notice. If the switch is turned on, a notice will be sent when a job succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SuccessNoticeEnable")
    public Boolean successNoticeEnable;

    /**
     * <p>The interval of retries after a task failure. Default value: 0. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskAttemptInterval")
    public Integer taskAttemptInterval;

    /**
     * <p>The number of retries after a task failure. Default value: 0. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskMaxAttempt")
    public Integer taskMaxAttempt;

    /**
     * <p>The time expression. Specify the time expression based on the value of TimeType:</p>
     * <ul>
     * <li>If you set TimeType to <strong>1</strong> (cron), specify this parameter to a standard CRON expression.</li>
     * <li>If you set TimeType to <strong>100</strong> (api), no time expression is required.</li>
     * <li>If you set TimeType to <strong>3</strong> (fixed_rate), specify this parameter to a fixed frequency in seconds. For example, if you set this parameter to 30, the system triggers a job every 30 seconds.</li>
     * <li>If you set TimeType to <strong>4</strong> (second_delay), specify this parameter to a fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.</li>
     * <li>If you set TimeType to <strong>5</strong> (one_time), specify this parameter to a specific time point at which the job is triggered. The time is in the format of yyyy-MM-dd HH:mm:ss, such as 2022-10-10 10:10:00, or a timestamp in milliseconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0 0/10 * * * ?</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The time type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: cron</li>
     * <li><strong>3</strong>: fixed_rate</li>
     * <li><strong>4</strong>: second_delay</li>
     * <li><strong>5</strong>: one_time</li>
     * <li><strong>100</strong>: api</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The timeout threshold. Default value: 7200. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>Specifies whether to turn on Timeout alarm. If the switch is turned on, an alert will be generated upon a timeout. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TimeoutEnable")
    public Boolean timeoutEnable;

    /**
     * <p>Specifies whether to turn on Timeout termination. If the switch is turned on, the job will be terminated upon a timeout. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TimeoutKillEnable")
    public Boolean timeoutKillEnable;

    /**
     * <p>Time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>If you set JobType to k8s, this parameter is required. xxljob task: {&quot;resource&quot;:&quot;job&quot;} shell task: {&quot;image&quot;:&quot;busybox&quot;,&quot;resource&quot;:&quot;shell&quot;}</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;resource&quot;:&quot;job&quot;}</p>
     */
    @NameInMap("XAttrs")
    public String XAttrs;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
        return this;
    }
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    public CreateJobRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public CreateJobRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateJobRequest setConsumerSize(Integer consumerSize) {
        this.consumerSize = consumerSize;
        return this;
    }
    public Integer getConsumerSize() {
        return this.consumerSize;
    }

    public CreateJobRequest setContactInfo(java.util.List<CreateJobRequestContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public java.util.List<CreateJobRequestContactInfo> getContactInfo() {
        return this.contactInfo;
    }

    public CreateJobRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateJobRequest setDataOffset(Integer dataOffset) {
        this.dataOffset = dataOffset;
        return this;
    }
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setDispatcherSize(Integer dispatcherSize) {
        this.dispatcherSize = dispatcherSize;
        return this;
    }
    public Integer getDispatcherSize() {
        return this.dispatcherSize;
    }

    public CreateJobRequest setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public CreateJobRequest setFailEnable(Boolean failEnable) {
        this.failEnable = failEnable;
        return this;
    }
    public Boolean getFailEnable() {
        return this.failEnable;
    }

    public CreateJobRequest setFailTimes(Integer failTimes) {
        this.failTimes = failTimes;
        return this;
    }
    public Integer getFailTimes() {
        return this.failTimes;
    }

    public CreateJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateJobRequest setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
        return this;
    }
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    public CreateJobRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public CreateJobRequest setMissWorkerEnable(Boolean missWorkerEnable) {
        this.missWorkerEnable = missWorkerEnable;
        return this;
    }
    public Boolean getMissWorkerEnable() {
        return this.missWorkerEnable;
    }

    public CreateJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public CreateJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateJobRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateJobRequest setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
        return this;
    }
    public Integer getQueueSize() {
        return this.queueSize;
    }

    public CreateJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateJobRequest setSendChannel(String sendChannel) {
        this.sendChannel = sendChannel;
        return this;
    }
    public String getSendChannel() {
        return this.sendChannel;
    }

    public CreateJobRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateJobRequest setSuccessNoticeEnable(Boolean successNoticeEnable) {
        this.successNoticeEnable = successNoticeEnable;
        return this;
    }
    public Boolean getSuccessNoticeEnable() {
        return this.successNoticeEnable;
    }

    public CreateJobRequest setTaskAttemptInterval(Integer taskAttemptInterval) {
        this.taskAttemptInterval = taskAttemptInterval;
        return this;
    }
    public Integer getTaskAttemptInterval() {
        return this.taskAttemptInterval;
    }

    public CreateJobRequest setTaskMaxAttempt(Integer taskMaxAttempt) {
        this.taskMaxAttempt = taskMaxAttempt;
        return this;
    }
    public Integer getTaskMaxAttempt() {
        return this.taskMaxAttempt;
    }

    public CreateJobRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public CreateJobRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public CreateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public CreateJobRequest setTimeoutEnable(Boolean timeoutEnable) {
        this.timeoutEnable = timeoutEnable;
        return this;
    }
    public Boolean getTimeoutEnable() {
        return this.timeoutEnable;
    }

    public CreateJobRequest setTimeoutKillEnable(Boolean timeoutKillEnable) {
        this.timeoutKillEnable = timeoutKillEnable;
        return this;
    }
    public Boolean getTimeoutKillEnable() {
        return this.timeoutKillEnable;
    }

    public CreateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateJobRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

    public static class CreateJobRequestContactInfo extends TeaModel {
        /**
         * <p>The webhook URL of the DingTalk chatbot.<a href="https://open.dingtalk.com/document/org/application-types"></a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>**********</p>
         */
        @NameInMap("Ding")
        public String ding;

        /**
         * <p>The email address of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>test***@***.com</p>
         */
        @NameInMap("UserMail")
        public String userMail;

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("UserPhone")
        public String userPhone;

        public static CreateJobRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestContactInfo self = new CreateJobRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public CreateJobRequestContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public CreateJobRequestContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateJobRequestContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

}
