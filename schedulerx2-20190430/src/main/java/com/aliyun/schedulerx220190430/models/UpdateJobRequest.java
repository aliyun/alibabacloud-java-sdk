// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The retry interval on errors. Unit: seconds. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <p>The custom calendar that can be optionally specified for the cron type.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The full path of the node interface class.</p>
     * <p>This field is required only for Java node types, and the full path must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.test.helloworld</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The advanced configuration for parallel grid tasks. The number of threads for a single trigger on a single machine. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ConsumerSize")
    public Integer consumerSize;

    /**
     * <p>The contact information for the node.</p>
     * <blockquote>
     * <p>Notice: This field is deprecated.</notice></p>
     * </blockquote>
     */
    @NameInMap("ContactInfo")
    public java.util.List<UpdateJobRequestContactInfo> contactInfo;

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
     * <p>The time offset that can be optionally specified for the cron type. Unit: seconds.</p>
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
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The advanced configuration for parallel grid tasks. The number of subtask dispatch threads. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DispatcherSize")
    public Integer dispatcherSize;

    /**
     * <p>The node execution mode. Valid values:</p>
     * <ul>
     * <li><strong>standalone</strong>: standalone</li>
     * <li><strong>broadcatst</strong>: broadcast</li>
     * <li><strong>parallel</strong>: visual MapReduce</li>
     * <li><strong>batch</strong>: MapReduce</li>
     * <li><strong>shard</strong>: shard</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standalone</p>
     */
    @NameInMap("ExecuteMode")
    public String executeMode;

    /**
     * <p>Specifies whether to enable the failure alert. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FailEnable")
    public Boolean failEnable;

    /**
     * <p>The number of consecutive failures before an alert is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The node ID. You can obtain the node ID on the Task Management page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92583</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The maximum number of retries on errors. Set this parameter based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrently running instances. Default value: 1. This means that if the previous trigger has not finished running, the next trigger is not performed even if the scheduled time has arrived.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>Specifies whether to enable the no-available-machine alert. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MissWorkerEnable")
    public Boolean missWorkerEnable;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>helloword</p>
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
     * <p>The advanced configuration for parallel grid tasks. The number of subtasks pulled per request. Default value: 100.</p>
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
     * <p>The advanced configuration for parallel grid tasks. The maximum cache size of the subtask queue. Default value: 10000.</p>
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
     * <p>The alert notification method. Currently, only sms is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("SendChannel")
    public String sendChannel;

    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Specifies whether to enable the success notification.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SuccessNoticeEnable")
    public Boolean successNoticeEnable;

    /**
     * <p>The advanced configuration for parallel grid tasks. The retry interval for failed subtasks.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskAttemptInterval")
    public Integer taskAttemptInterval;

    /**
     * <p>The advanced configuration for parallel grid tasks. Specifies the push model or pull model.</p>
     * 
     * <strong>example:</strong>
     * <p>push</p>
     */
    @NameInMap("TaskDispatchMode")
    public String taskDispatchMode;

    /**
     * <p>The advanced configuration for parallel grid tasks. The number of retries for failed subtasks.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskMaxAttempt")
    public Integer taskMaxAttempt;

    /**
     * <p>The custom task template for k8s node types.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1
     * kind: Pod
     * metadata:
     *   name: schedulerx-node-{JOB_ID}
     *   namespace: {NAMESPACE}
     * spec:
     *   containers:</p>
     * <ul>
     * <li>name: node-job
     * image: node:16
     * imagePullPolicy: IfNotPresent
     * volumeMounts:<ul>
     * <li>name: script-node
     * mountPath: script/node
     * command: [&quot;node&quot;, &quot;script/node/node-{JOB_ID}.js&quot;]
     * volumes:</li>
     * </ul>
     * </li>
     * <li>name: script-node
     * configMap:
     *   name: schedulerx-configmap
     *   items:<ul>
     * <li>key: schedulerx-node-{JOB_ID}
     * path: node-{JOB_ID}.js</li>
     * </ul>
     * </li>
     * </ul>
     * <p>  restartPolicy: Never</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The time expression. Set the time expression based on the selected time type.</p>
     * <ul>
     * <li><strong>cron</strong>: Specify a standard cron expression. Online verification is supported.</li>
     * <li><strong>api</strong>: No time expression is required.</li>
     * <li><strong>fixed_rate</strong>: Specify a fixed frequency value in seconds. For example, 30 indicates that the node is triggered every 30 seconds.</li>
     * <li><strong>second_delay</strong>: Specify a fixed delay in seconds before each execution (1s to 60s).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
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

    /**
     * <p>The timeout threshold. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>Specifies whether to enable the timeout alert. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TimeoutEnable")
    public Boolean timeoutEnable;

    /**
     * <p>Specifies whether to enable the timeout termination for the current trigger. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The parameter that must be configured for k8s node types.
     * Job task: {&quot;resource&quot;:&quot;job&quot;}
     * Shell task: {&quot;image&quot;:&quot;busybox&quot;,&quot;resource&quot;:&quot;shell&quot;}</p>
     * 
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

    public UpdateJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
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

    public UpdateJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
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
         * <p>The webhook URL of the DingTalk chatbot in the DingTalk group for alert contacts. References: <a href="https://open.dingtalk.com/document/org/application-types">DingTalk development documentation</a>.</p>
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
         * <p>test***@***.com</p>
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
