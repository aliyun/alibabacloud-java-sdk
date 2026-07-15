// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The retry interval on failure. Unit: seconds. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <p>The custom calendar. This parameter is available for the cron time type.</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The full path of the node interface class.</p>
     * <p>This field is required only when you select the Java node type. Specify the full path.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.schedulerx.test.helloworld</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The advanced configuration for parallel grid nodes. The number of threads triggered for a single execution on a single machine. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ConsumerSize")
    public Integer consumerSize;

    /**
     * <p>The node contact information.</p>
     * <blockquote>
     * <p>Notice: This field is deprecated.</notice></p>
     * </blockquote>
     */
    @NameInMap("ContactInfo")
    public java.util.List<CreateJobRequestContactInfo> contactInfo;

    /**
     * <ul>
     * <li>If the node type is python, shell, or k8s, specify the corresponding script content.</li>
     * <li>If the node type is golang, the content format example is {&quot;jobName&quot;:&quot;HelloWorld&quot;}.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>echo \&quot;hello\&quot;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The time offset. Unit: seconds. This parameter is available for the cron time type.</p>
     * 
     * <strong>example:</strong>
     * <p>2400</p>
     */
    @NameInMap("DataOffset")
    public Integer dataOffset;

    /**
     * <p>The node description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The advanced configuration for parallel grid nodes. The number of subtask dispatch threads. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DispatcherSize")
    public Integer dispatcherSize;

    /**
     * <p>The node execution mode. The following execution modes are supported:</p>
     * <ul>
     * <li><strong>Standalone</strong>: standalone</li>
     * <li><strong>Broadcast</strong>: broadcast</li>
     * <li><strong>Visual MapReduce</strong>: parallel</li>
     * <li><strong>MapReduce</strong>: batch</li>
     * <li><strong>Sharding</strong>: sharding</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standalone</p>
     */
    @NameInMap("ExecuteMode")
    public String executeMode;

    /**
     * <p>Specifies whether to enable the failure alert. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enables the failure alert.</li>
     * <li><strong>false</strong>: Disables the failure alert.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FailEnable")
    public Boolean failEnable;

    /**
     * <p>The number of consecutive failures before an alert is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailTimes")
    public Integer failTimes;

    /**
     * <p>The application ID. You can obtain the application ID on the Application Management page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The node type. The following node types are supported:</p>
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
     * <p>The maximum number of retries on failure. Set this parameter based on your business requirements. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrently running instances. Default value: 1. This means that if the previous trigger has not finished running, the next trigger is not performed even if the scheduled time arrives.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>Specifies whether to enable the no-available-machine alert. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enables the no-available-machine alert.</li>
     * <li><strong>false</strong>: Disables the no-available-machine alert.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MissWorkerEnable")
    public Boolean missWorkerEnable;

    /**
     * <p>The node name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>helloworld</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required only for special third-party users.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The advanced configuration for parallel grid nodes. The number of subtasks pulled in a single request. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The user-defined parameters that can be obtained at runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The node priority. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low</li>
     * <li><strong>5</strong>: medium</li>
     * <li><strong>10</strong>: high</li>
     * <li><strong>15</strong>: very high</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The advanced configuration for parallel grid nodes. The maximum cache size of the subtask queue. Default value: 10000.</p>
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
     * <p>The alert notification channel.</p>
     * <ul>
     * <li>Use the default channel of the application group: default.</li>
     * <li>Specify a notification channel for the node: sms, mail, phone, or webhook.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("SendChannel")
    public String sendChannel;

    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The node status. Valid values: 0: disabled. 1: enabled. Default value: 1 (enabled).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Specifies whether to enable the success notification.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SuccessNoticeEnable")
    public Boolean successNoticeEnable;

    /**
     * <p>The advanced configuration for parallel grid nodes. The retry interval for a failed subtask. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskAttemptInterval")
    public Integer taskAttemptInterval;

    /**
     * <p>The advanced configuration for parallel grid nodes. The number of retries for a failed subtask. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskMaxAttempt")
    public Integer taskMaxAttempt;

    /**
     * <p>The time expression. Set the time expression based on the selected time type.</p>
     * <ul>
     * <li><strong>cron</strong>: Specify a standard cron expression. Online verification is supported.</li>
     * <li><strong>api</strong>: No time expression is required.</li>
     * <li><strong>fixed_rate</strong>: Specify a fixed frequency value in seconds. For example, 30 indicates that the node is triggered every 30 seconds.</li>
     * <li><strong>second_delay</strong>: Specify a fixed delay in seconds before each execution (1s to 60s).</li>
     * <li><strong>one_time</strong>: Specify a time in the format of yyyy-MM-dd HH:mm:ss or a timestamp in milliseconds. For example, &quot;2022-10-10 10:10:00&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0 0/10 * * * ?</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The time type. The following time types are supported:</p>
     * <ul>
     * <li><strong>cron</strong>: 1</li>
     * <li><strong>fixed_rate</strong>: 3</li>
     * <li><strong>second_delay</strong>: 4</li>
     * <li><strong>one_time</strong>: 5 </li>
     * <li><strong>api</strong>: 100</li>
     * <li><strong>none</strong>: -1</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The timeout threshold. Unit: seconds. Default value: 7200.</p>
     * 
     * <strong>example:</strong>
     * <p>7200</p>
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
     * <p>false</p>
     */
    @NameInMap("TimeoutEnable")
    public Boolean timeoutEnable;

    /**
     * <p>Specifies whether to enable timeout termination. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enables timeout termination.</li>
     * <li><strong>false</strong>: Disables timeout termination.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TimeoutKillEnable")
    public Boolean timeoutKillEnable;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>If the node type is k8s, configure this parameter.
     * Job task: {&quot;resource&quot;:&quot;job&quot;}
     * Shell task: {&quot;image&quot;:&quot;busybox&quot;,&quot;resource&quot;:&quot;shell&quot;}</p>
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

    public CreateJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
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

    public CreateJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
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
         * <p>The webhook URL of the DingTalk chatbot for the alert contact\&quot;s DingTalk group. References: <a href="https://open.dingtalk.com/document/org/application-types">DingTalk development documentation</a>.</p>
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
         * <p>John Smith</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile phone number of the alert recipient.</p>
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
