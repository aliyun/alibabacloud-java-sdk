// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateJobShrinkRequest extends TeaModel {
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
    public String noticeConfigShrink;

    /**
     * <p>Notification configuration</p>
     */
    @NameInMap("NoticeContacts")
    public String noticeContactsShrink;

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

    public static UpdateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobShrinkRequest self = new UpdateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateJobShrinkRequest setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
        return this;
    }
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    public UpdateJobShrinkRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public UpdateJobShrinkRequest setChildJobId(String childJobId) {
        this.childJobId = childJobId;
        return this;
    }
    public String getChildJobId() {
        return this.childJobId;
    }

    public UpdateJobShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateJobShrinkRequest setDependentStrategy(Integer dependentStrategy) {
        this.dependentStrategy = dependentStrategy;
        return this;
    }
    public Integer getDependentStrategy() {
        return this.dependentStrategy;
    }

    public UpdateJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobShrinkRequest setExecutorBlockStrategy(Integer executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy;
        return this;
    }
    public Integer getExecutorBlockStrategy() {
        return this.executorBlockStrategy;
    }

    public UpdateJobShrinkRequest setJobHandler(String jobHandler) {
        this.jobHandler = jobHandler;
        return this;
    }
    public String getJobHandler() {
        return this.jobHandler;
    }

    public UpdateJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateJobShrinkRequest setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
        return this;
    }
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    public UpdateJobShrinkRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateJobShrinkRequest setNoticeConfigShrink(String noticeConfigShrink) {
        this.noticeConfigShrink = noticeConfigShrink;
        return this;
    }
    public String getNoticeConfigShrink() {
        return this.noticeConfigShrink;
    }

    public UpdateJobShrinkRequest setNoticeContactsShrink(String noticeContactsShrink) {
        this.noticeContactsShrink = noticeContactsShrink;
        return this;
    }
    public String getNoticeContactsShrink() {
        return this.noticeContactsShrink;
    }

    public UpdateJobShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public UpdateJobShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateJobShrinkRequest setRouteStrategy(Integer routeStrategy) {
        this.routeStrategy = routeStrategy;
        return this;
    }
    public Integer getRouteStrategy() {
        return this.routeStrategy;
    }

    public UpdateJobShrinkRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public UpdateJobShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateJobShrinkRequest setStartTimeType(String startTimeType) {
        this.startTimeType = startTimeType;
        return this;
    }
    public String getStartTimeType() {
        return this.startTimeType;
    }

    public UpdateJobShrinkRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public UpdateJobShrinkRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public UpdateJobShrinkRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public UpdateJobShrinkRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public UpdateJobShrinkRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

}
