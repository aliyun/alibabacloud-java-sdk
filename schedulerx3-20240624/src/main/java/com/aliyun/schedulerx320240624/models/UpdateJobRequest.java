// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The retry interval upon node failure.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <p>The custom calendar.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The child node IDs, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ChildJobId")
    public String childJobId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The dependency strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DependentStrategy")
    public Integer dependentStrategy;

    /**
     * <p>The node description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The client blocking strategy. Valid values:</p>
     * <ul>
     * <li>1: serial execution on a single machine</li>
     * <li>2: ignore subsequent scheduling</li>
     * <li>3: override previous scheduling</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExecutorBlockStrategy")
    public Integer executorBlockStrategy;

    /**
     * <p>The JobHandler name.</p>
     * 
     * <strong>example:</strong>
     * <p>testJobVoidHandler</p>
     */
    @NameInMap("JobHandler")
    public String jobHandler;

    /**
     * <p>The node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The maximum number of retry attempts upon node failure.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrent instances of the node.</p>
     * <blockquote>
     * <p>The maximum number of instances that can run at the same time for the same node. A value of 1 indicates that repeated execution is not allowed. If the concurrency limit is exceeded, the current scheduling is skipped.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification configuration.</p>
     */
    @NameInMap("NoticeConfig")
    public UpdateJobRequestNoticeConfig noticeConfig;

    /**
     * <p>The notification contact configuration.</p>
     */
    @NameInMap("NoticeContacts")
    public java.util.List<UpdateJobRequestNoticeContacts> noticeContacts;

    /**
     * <p>The node parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The execution priority of the node. Valid values:</p>
     * <ul>
     * <li>1: low</li>
     * <li>5: medium</li>
     * <li>10: high</li>
     * <li>15: very high</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The routing policy. Valid values:</p>
     * <ul>
     * <li>1: round robin</li>
     * <li>2: random</li>
     * <li>3: first</li>
     * <li>4: last</li>
     * <li>5: least frequently used</li>
     * <li>6: least recently used</li>
     * <li>7: consistent hashing</li>
     * <li>8: shard broadcast</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteStrategy")
    public Integer routeStrategy;

    /**
     * <p>The script for non-BEAN nodes. Use this field to configure the script.</p>
     * 
     * <strong>example:</strong>
     * <p>echo &quot;hello world&quot;</p>
     */
    @NameInMap("Script")
    public String script;

    /**
     * <p>The scheduling start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1716902187</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The start time type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartTimeType")
    public String startTimeType;

    /**
     * <p>The time expression. Set the time expression based on the selected time type.</p>
     * <ul>
     * <li>none: No value is required.</li>
     * <li>cron: Specify a standard cron expression. Online verification is supported.</li>
     * <li>api: No value is required.</li>
     * <li>fixed_rate: Specify a fixed frequency value in seconds. For example, 30 indicates that the node is triggered every 30 seconds.</li>
     * <li>one_time: Specify a scheduling time in the yyyy-MM-dd HH:mm:ss format or a timestamp in milliseconds. For example, &quot;2022-10-10 10:10:00&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0 0 4 ? * Mon/1</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The time type. Valid values:</p>
     * <ul>
     * <li>-1: none</li>
     * <li>1: cron</li>
     * <li>3: fix_rate</li>
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
     * <p>The time zone.</p>
     * <blockquote>
     * <p>By default, the time zone of the SchedulerX server is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Hongkong</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>The node weight.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <strong>example:</strong>
     * <p>{&quot;reponseMode&quot;:&quot;streaming&quot;}</p>
     */
    @NameInMap("XAttrs")
    public String XAttrs;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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

    public UpdateJobRequest setChildJobId(String childJobId) {
        this.childJobId = childJobId;
        return this;
    }
    public String getChildJobId() {
        return this.childJobId;
    }

    public UpdateJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateJobRequest setDependentStrategy(Integer dependentStrategy) {
        this.dependentStrategy = dependentStrategy;
        return this;
    }
    public Integer getDependentStrategy() {
        return this.dependentStrategy;
    }

    public UpdateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobRequest setExecutorBlockStrategy(Integer executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy;
        return this;
    }
    public Integer getExecutorBlockStrategy() {
        return this.executorBlockStrategy;
    }

    public UpdateJobRequest setJobHandler(String jobHandler) {
        this.jobHandler = jobHandler;
        return this;
    }
    public String getJobHandler() {
        return this.jobHandler;
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

    public UpdateJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateJobRequest setNoticeConfig(UpdateJobRequestNoticeConfig noticeConfig) {
        this.noticeConfig = noticeConfig;
        return this;
    }
    public UpdateJobRequestNoticeConfig getNoticeConfig() {
        return this.noticeConfig;
    }

    public UpdateJobRequest setNoticeContacts(java.util.List<UpdateJobRequestNoticeContacts> noticeContacts) {
        this.noticeContacts = noticeContacts;
        return this;
    }
    public java.util.List<UpdateJobRequestNoticeContacts> getNoticeContacts() {
        return this.noticeContacts;
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

    public UpdateJobRequest setRouteStrategy(Integer routeStrategy) {
        this.routeStrategy = routeStrategy;
        return this;
    }
    public Integer getRouteStrategy() {
        return this.routeStrategy;
    }

    public UpdateJobRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public UpdateJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateJobRequest setStartTimeType(String startTimeType) {
        this.startTimeType = startTimeType;
        return this;
    }
    public String getStartTimeType() {
        return this.startTimeType;
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

    public UpdateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public UpdateJobRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public UpdateJobRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

    public static class UpdateJobRequestNoticeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EndEarly")
        public Integer endEarly;

        @NameInMap("EndEarlyEnable")
        public Boolean endEarlyEnable;

        /**
         * <p>Specifies whether to enable the failure alerting switch. Valid values:</p>
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
         * <p>The number of consecutive failures.</p>
         * <blockquote>
         * <p>An alert is sent only when the number of consecutive failures exceeds the configured value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailLimitTimes")
        public Integer failLimitTimes;

        /**
         * <p>Specifies whether to enable the no-available-machine alerting switch. Valid values:</p>
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
         * <p>The notification channel. Valid values:</p>
         * <ul>
         * <li>sms: text message</li>
         * <li>phone: phone call</li>
         * <li>mail: email</li>
         * <li>webhook: webhook<blockquote>
         * <p>Separate multiple notification channels with commas.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>webhook,sms,mail,phone</p>
         */
        @NameInMap("SendChannel")
        public String sendChannel;

        /**
         * <p>Specifies whether to enable the success notification switch. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SuccessNotice")
        public Boolean successNotice;

        /**
         * <p>The node execution timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable timeout alerting. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <p>Specifies whether to enable the timeout termination switch for the current trigger. Valid values:</p>
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

        public static UpdateJobRequestNoticeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobRequestNoticeConfig self = new UpdateJobRequestNoticeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateJobRequestNoticeConfig setEndEarly(Integer endEarly) {
            this.endEarly = endEarly;
            return this;
        }
        public Integer getEndEarly() {
            return this.endEarly;
        }

        public UpdateJobRequestNoticeConfig setEndEarlyEnable(Boolean endEarlyEnable) {
            this.endEarlyEnable = endEarlyEnable;
            return this;
        }
        public Boolean getEndEarlyEnable() {
            return this.endEarlyEnable;
        }

        public UpdateJobRequestNoticeConfig setFailEnable(Boolean failEnable) {
            this.failEnable = failEnable;
            return this;
        }
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        public UpdateJobRequestNoticeConfig setFailLimitTimes(Integer failLimitTimes) {
            this.failLimitTimes = failLimitTimes;
            return this;
        }
        public Integer getFailLimitTimes() {
            return this.failLimitTimes;
        }

        public UpdateJobRequestNoticeConfig setMissWorkerEnable(Boolean missWorkerEnable) {
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        public UpdateJobRequestNoticeConfig setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
            return this;
        }
        public String getSendChannel() {
            return this.sendChannel;
        }

        public UpdateJobRequestNoticeConfig setSuccessNotice(Boolean successNotice) {
            this.successNotice = successNotice;
            return this;
        }
        public Boolean getSuccessNotice() {
            return this.successNotice;
        }

        public UpdateJobRequestNoticeConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public UpdateJobRequestNoticeConfig setTimeoutEnable(Boolean timeoutEnable) {
            this.timeoutEnable = timeoutEnable;
            return this;
        }
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        public UpdateJobRequestNoticeConfig setTimeoutKillEnable(Boolean timeoutKillEnable) {
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

    }

    public static class UpdateJobRequestNoticeContacts extends TeaModel {
        /**
         * <p>The contact type. </p>
         * <blockquote>
         * <p>Default configurations: 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContactType")
        public Integer contactType;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoming</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateJobRequestNoticeContacts build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobRequestNoticeContacts self = new UpdateJobRequestNoticeContacts();
            return TeaModel.build(map, self);
        }

        public UpdateJobRequestNoticeContacts setContactType(Integer contactType) {
            this.contactType = contactType;
            return this;
        }
        public Integer getContactType() {
            return this.contactType;
        }

        public UpdateJobRequestNoticeContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
