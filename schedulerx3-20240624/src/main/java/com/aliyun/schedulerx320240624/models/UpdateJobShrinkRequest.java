// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateJobShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppGroupId")
    public Long appGroupId;

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
     * <p>The retry interval for a failed job.</p>
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
     * <p>The IDs of child jobs. Separate multiple IDs with commas.</p>
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
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The client blocking strategy. Valid values:</p>
     * <ul>
     * <li>1: single-machine serial execution</li>
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
     * <p>The name of the job handler.</p>
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
     * <p>The tag information of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>{key:value}</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The maximum number of retries for a failed job.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrent instances for a job.</p>
     * <blockquote>
     * <p>The maximum number of instances that can run concurrently for the same job. A value of 1 indicates that repeated execution is not allowed. If the concurrency limit is exceeded, the current scheduling is skipped.</p>
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
     * <p>The notification configuration.</p>
     */
    @NameInMap("NoticeConfig")
    public String noticeConfigShrink;

    /**
     * <p>The notification contact configuration.</p>
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
     * <p>The execution priority of the job. Valid values:</p>
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
     * <p>The routing strategy. Valid values:</p>
     * <ul>
     * <li>1: round robin</li>
     * <li>2: random</li>
     * <li>3: first</li>
     * <li>4: last</li>
     * <li>5: least frequently used</li>
     * <li>6: least recently used</li>
     * <li>7: consistent hashing</li>
     * <li>8: sharding broadcast</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteStrategy")
    public Integer routeStrategy;

    /**
     * <p>The script configuration for non-BEAN jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>echo &quot;hello world&quot;</p>
     */
    @NameInMap("Script")
    public String script;

    /**
     * <p>The start time of the scheduling.</p>
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
     * <p>The time expression. Configure the time expression based on the selected time type.</p>
     * <ul>
     * <li>none: not required</li>
     * <li>cron: Enter a standard cron expression. Online verification is supported.</li>
     * <li>api: not required</li>
     * <li>fixed_rate: Enter a fixed frequency value in seconds. For example, 30 indicates that the job is triggered every 30 seconds.</li>
     * <li>one_time: Enter the scheduling time in the yyyy-MM-dd HH:mm:ss format or a timestamp in milliseconds, such as &quot;2022-10-10 10:10:00&quot;.</li>
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
     * <p>The weight of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>The extended properties of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;reponseMode&quot;:&quot;streaming&quot;}</p>
     */
    @NameInMap("XAttrs")
    public String XAttrs;

    public static UpdateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobShrinkRequest self = new UpdateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobShrinkRequest setAppGroupId(Long appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public Long getAppGroupId() {
        return this.appGroupId;
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

    public UpdateJobShrinkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
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
