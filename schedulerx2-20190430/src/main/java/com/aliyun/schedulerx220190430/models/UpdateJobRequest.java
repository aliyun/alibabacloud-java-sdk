// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
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
     * <p>Business days</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The full path of the job interface class.</p>
     * <p>This field is available only when you set the job type to java. In this case, you must enter a full path.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.test.helloworld</p>
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
    public java.util.List<UpdateJobRequestContactInfo> contactInfo;

    /**
     * <p>The script content. This parameter is required when you set the job type to python, shell, go, or k8s.</p>
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
     * <p>test</p>
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
     * <p>true</p>
     */
    @NameInMap("FailEnable")
    public Boolean failEnable;

    /**
     * <p>The number of consecutive failures. An alert will be received if the number of consecutive failures reaches the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The job ID. You can obtain the job ID on the Task Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92583</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The maximum number of retries after a job failure. This parameter is specified based on your business requirements.</p>
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
     * <p>true</p>
     */
    @NameInMap("MissWorkerEnable")
    public Boolean missWorkerEnable;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>helloword</p>
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
     * <p>The method that is used to send alerts. Only Short Message Service (SMS) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("SendChannel")
    public String sendChannel;

    /**
     * <p>Specifies whether to turn on Successful notice. If the switch is turned on, a notice will be sent when a job succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SuccessNoticeEnable")
    public Boolean successNoticeEnable;

    /**
     * <p>The interval of retries after a task failure. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskAttemptInterval")
    public Integer taskAttemptInterval;

    /**
     * <p>The job mode. Valid values: push and pull. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>push</p>
     */
    @NameInMap("TaskDispatchMode")
    public String taskDispatchMode;

    /**
     * <p>The number of retries after a task failure. This parameter is an advanced configuration item of the MapReduce job.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskMaxAttempt")
    public Integer taskMaxAttempt;

    @NameInMap("Template")
    public String template;

    /**
     * <p>The time expression. Specify the time expression based on the value of TimeType:</p>
     * <ul>
     * <li>If you set TimeType to <strong>1</strong> (cron), specify this parameter to a standard CRON expression.</li>
     * <li>If you set TimeType to <strong>100</strong> (api), no time expression is required.</li>
     * <li>If you set TimeType to <strong>3</strong> (fixed_rate), specify this parameter to a fixed frequency in seconds. For example, if you set this parameter to 30, the system triggers a job every 30 seconds.</li>
     * <li>If you set TimeType to <strong>4</strong> (second_delay), specify this parameter to a fixed delay after which the job is triggered. Valid values: 1 to 60. Unit: seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The time type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: cron</li>
     * <li><strong>3</strong>: fix_rate</li>
     * <li><strong>4</strong>: second_delay</li>
     * <li><strong>100</strong>: api</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The timeout threshold. Unit: seconds.</p>
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
     * <p>true</p>
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
     * <p>true</p>
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
     * <strong>example:</strong>
     * <p>{&quot;resource&quot;:&quot;shell&quot;,&quot;fileFormat&quot;:&quot;unix&quot;,&quot;templateType&quot;:&quot;customTemplate&quot;}</p>
     */
    @NameInMap("XAttrs")
    public String XAttrs;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
        return this;
    }
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    public UpdateJobRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public UpdateJobRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public UpdateJobRequest setConsumerSize(Integer consumerSize) {
        this.consumerSize = consumerSize;
        return this;
    }
    public Integer getConsumerSize() {
        return this.consumerSize;
    }

    public UpdateJobRequest setContactInfo(java.util.List<UpdateJobRequestContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public java.util.List<UpdateJobRequestContactInfo> getContactInfo() {
        return this.contactInfo;
    }

    public UpdateJobRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateJobRequest setDataOffset(Integer dataOffset) {
        this.dataOffset = dataOffset;
        return this;
    }
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    public UpdateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobRequest setDispatcherSize(Integer dispatcherSize) {
        this.dispatcherSize = dispatcherSize;
        return this;
    }
    public Integer getDispatcherSize() {
        return this.dispatcherSize;
    }

    public UpdateJobRequest setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public UpdateJobRequest setFailEnable(Boolean failEnable) {
        this.failEnable = failEnable;
        return this;
    }
    public Boolean getFailEnable() {
        return this.failEnable;
    }

    public UpdateJobRequest setFailTimes(Integer failTimes) {
        this.failTimes = failTimes;
        return this;
    }
    public Integer getFailTimes() {
        return this.failTimes;
    }

    public UpdateJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateJobRequest setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
        return this;
    }
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    public UpdateJobRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateJobRequest setMissWorkerEnable(Boolean missWorkerEnable) {
        this.missWorkerEnable = missWorkerEnable;
        return this;
    }
    public Boolean getMissWorkerEnable() {
        return this.missWorkerEnable;
    }

    public UpdateJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public UpdateJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UpdateJobRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public UpdateJobRequest setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
        return this;
    }
    public Integer getQueueSize() {
        return this.queueSize;
    }

    public UpdateJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateJobRequest setSendChannel(String sendChannel) {
        this.sendChannel = sendChannel;
        return this;
    }
    public String getSendChannel() {
        return this.sendChannel;
    }

    public UpdateJobRequest setSuccessNoticeEnable(Boolean successNoticeEnable) {
        this.successNoticeEnable = successNoticeEnable;
        return this;
    }
    public Boolean getSuccessNoticeEnable() {
        return this.successNoticeEnable;
    }

    public UpdateJobRequest setTaskAttemptInterval(Integer taskAttemptInterval) {
        this.taskAttemptInterval = taskAttemptInterval;
        return this;
    }
    public Integer getTaskAttemptInterval() {
        return this.taskAttemptInterval;
    }

    public UpdateJobRequest setTaskDispatchMode(String taskDispatchMode) {
        this.taskDispatchMode = taskDispatchMode;
        return this;
    }
    public String getTaskDispatchMode() {
        return this.taskDispatchMode;
    }

    public UpdateJobRequest setTaskMaxAttempt(Integer taskMaxAttempt) {
        this.taskMaxAttempt = taskMaxAttempt;
        return this;
    }
    public Integer getTaskMaxAttempt() {
        return this.taskMaxAttempt;
    }

    public UpdateJobRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateJobRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public UpdateJobRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public UpdateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public UpdateJobRequest setTimeoutEnable(Boolean timeoutEnable) {
        this.timeoutEnable = timeoutEnable;
        return this;
    }
    public Boolean getTimeoutEnable() {
        return this.timeoutEnable;
    }

    public UpdateJobRequest setTimeoutKillEnable(Boolean timeoutKillEnable) {
        this.timeoutKillEnable = timeoutKillEnable;
        return this;
    }
    public Boolean getTimeoutKillEnable() {
        return this.timeoutKillEnable;
    }

    public UpdateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public UpdateJobRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

    public static class UpdateJobRequestContactInfo extends TeaModel {
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
         * <p>userA</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile phone number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("UserPhone")
        public String userPhone;

        public static UpdateJobRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobRequestContactInfo self = new UpdateJobRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public UpdateJobRequestContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public UpdateJobRequestContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public UpdateJobRequestContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public UpdateJobRequestContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

}
