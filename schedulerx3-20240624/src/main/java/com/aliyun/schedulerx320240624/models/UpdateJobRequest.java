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
     * <p>The interval in seconds between retry attempts.</p>
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
     * <p>The client blocking strategy.</p>
     * <ul>
     * <li><p>1: Serial execution</p>
     * </li>
     * <li><p>2: Ignore later schedules</p>
     * </li>
     * <li><p>3: Overwrite earlier schedules</p>
     * </li>
     * </ul>
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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DependentStrategy")
    public Integer dependentStrategy;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Notification contact configuration</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExecutorBlockStrategy")
    public Integer executorBlockStrategy;

    /**
     * <p>The job handler name.</p>
     * 
     * <strong>example:</strong>
     * <p>testJobVoidHandler</p>
     */
    @NameInMap("JobHandler")
    public String jobHandler;

    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The maximum number of retries for a failed job.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrent job instances.</p>
     * <blockquote>
     * <p>This parameter defines the maximum number of instances for a single job that can run concurrently. A value of <code>1</code> prevents duplicate execution. If this limit is exceeded, the scheduler skips the current job.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Time zone</p>
     * <blockquote>
     * <p>The default is the time zone of the SchedulerX server.</p>
     * </blockquote>
     */
    @NameInMap("NoticeConfig")
    public UpdateJobRequestNoticeConfig noticeConfig;

    /**
     * <p>Notification configuration</p>
     */
    @NameInMap("NoticeContacts")
    public java.util.List<UpdateJobRequestNoticeContacts> noticeContacts;

    /**
     * <p>The job parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The job execution priority. Valid values:</p>
     * <ul>
     * <li><p><code>1</code>: Low</p>
     * </li>
     * <li><p><code>5</code>: Medium</p>
     * </li>
     * <li><p><code>10</code>: High</p>
     * </li>
     * <li><p><code>15</code>: Very High</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The routing strategy. Valid values:</p>
     * <ul>
     * <li><p><code>1</code>: round-robin</p>
     * </li>
     * <li><p><code>2</code>: random</p>
     * </li>
     * <li><p><code>3</code>: first</p>
     * </li>
     * <li><p><code>4</code>: last</p>
     * </li>
     * <li><p><code>5</code>: least frequently used</p>
     * </li>
     * <li><p><code>6</code>: least recently used</p>
     * </li>
     * <li><p><code>7</code>: consistent hashing</p>
     * </li>
     * <li><p><code>8</code>: sharded broadcast</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteStrategy")
    public Integer routeStrategy;

    /**
     * <p>The script content for non-BEAN jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>echo &quot;hello world&quot;</p>
     */
    @NameInMap("Script")
    public String script;

    /**
     * <p>The type of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1716902187</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The task execution priority. The following values are supported:</p>
     * <ul>
     * <li><p>1: Low</p>
     * </li>
     * <li><p>5: Medium</p>
     * </li>
     * <li><p>10: High</p>
     * </li>
     * <li><p>15: Very High</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartTimeType")
    public String startTimeType;

    /**
     * <p>The time expression. The expression format depends on the <code>TimeType</code>.</p>
     * <ul>
     * <li><p><code>none</code>: Leave this parameter empty.</p>
     * </li>
     * <li><p><code>cron</code>: Specify a standard cron expression. Online validation is supported.</p>
     * </li>
     * <li><p><code>api</code>: Leave this parameter empty.</p>
     * </li>
     * <li><p><code>fixed_rate</code>: An integer that represents a fixed interval in seconds. For example, <code>30</code> triggers the job every 30 seconds.</p>
     * </li>
     * <li><p><code>one_time</code>: A single execution time, specified in the <code>yyyy-MM-dd HH:mm:ss</code> format or as a timestamp in milliseconds. For example, &quot;2022-10-10 10:10:00&quot;.</p>
     * </li>
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
     * <li><p><code>-1</code>: none</p>
     * </li>
     * <li><p><code>1</code>: cron</p>
     * </li>
     * <li><p><code>3</code>: fixed_rate</p>
     * </li>
     * <li><p><code>5</code>: one_time</p>
     * </li>
     * <li><p><code>100</code>: api</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The start time of the schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>Hongkong</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>The ID of the child job. Separate multiple IDs with a comma.</p>
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
         * <p>The threshold, in seconds, for a job to be considered as finishing early.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EndEarly")
        public Integer endEarly;

        /**
         * <p>Indicates whether to enable an alarm when a job finishes earlier than expected. Set to <code>true</code> to enable the alarm, or <code>false</code> to disable it.</p>
         */
        @NameInMap("EndEarlyEnable")
        public Boolean endEarlyEnable;

        /**
         * <p>Indicates whether to enable the failure alarm. Set to <code>true</code> to enable the alarm, or <code>false</code> to disable it.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailEnable")
        public Boolean failEnable;

        /**
         * <p>The number of consecutive failures required to trigger a failure alarm.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailLimitTimes")
        public Integer failLimitTimes;

        /**
         * <p>Indicates whether to enable an alarm if no workers are available. Set to <code>true</code> to enable the alarm, or <code>false</code> to disable it.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MissWorkerEnable")
        public Boolean missWorkerEnable;

        /**
         * <p>The notification channel. Valid values:
         * \- <code>sms</code>: sms
         * \- <code>phone</code>: voice call
         * \- <code>mail</code>: email
         * \- <code>webhook</code>: webhook
         * \&gt; You can specify multiple channels, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>webhook,sms,mail,phone</p>
         */
        @NameInMap("SendChannel")
        public String sendChannel;

        /**
         * <p>Indicates whether to enable success notifications. Set to <code>true</code> to enable notifications, or <code>false</code> to disable them.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SuccessNotice")
        public Boolean successNotice;

        /**
         * <p>The job execution timeout in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Indicates whether to enable the timeout alarm. Set to <code>true</code> to enable the alarm, or <code>false</code> to disable it.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <p>Indicates whether to terminate a timed-out job. Set to <code>true</code> to terminate the job, or <code>false</code> to let it continue.</p>
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
         * <p>The contact type.
         * \&gt; Default value: 1.</p>
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
