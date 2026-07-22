// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
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
     * <p>The retry interval. Unit: seconds. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <p>The custom calendar. This parameter is optional for the cron time type.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The child node IDs. Separate multiple IDs with commas.</p>
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
     * <p>The node coordinate in the workflow.</p>
     */
    @NameInMap("Coordinate")
    public String coordinateShrink;

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
     * <p>The jobhandler name.</p>
     * 
     * <strong>example:</strong>
     * <p>testJobVoidHandler</p>
     */
    @NameInMap("JobHandler")
    public String jobHandler;

    /**
     * <p>The node type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The maximum number of retry attempts upon failure. Set this parameter based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of concurrent instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The node name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoticeConfig")
    public String noticeConfigShrink;

    /**
     * <p>The notification contact configuration.</p>
     */
    @NameInMap("NoticeContacts")
    public String noticeContactsShrink;

    /**
     * <p>The node parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The priority. Valid values:</p>
     * <ul>
     * <li>1: low</li>
     * <li>5: medium</li>
     * <li>10: high</li>
     * <li>15: very high</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
     * <li>8: shard broadcast</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteStrategy")
    public Integer routeStrategy;

    /**
     * <p>The script content for non-BEAN node types. Use this field to pass the script content.</p>
     * 
     * <strong>example:</strong>
     * <p>echo &quot;hello world&quot;</p>
     */
    @NameInMap("Script")
    public String script;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1701310327000</p>
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
    public Integer startTimeType;

    /**
     * <p>The node status. Default value: 1 (enabled). Valid values:</p>
     * <ul>
     * <li>0: disabled</li>
     * <li>1: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The time expression. Set this parameter based on the selected time type.</p>
     * <ul>
     * <li><strong>none</strong>: No value is required.</li>
     * <li><strong>cron</strong>: Specify a standard cron expression. Online verification is supported.</li>
     * <li><strong>api</strong>: No value is required.</li>
     * <li><strong>fixed_rate</strong>: Specify a fixed frequency value in seconds. For example, 200 indicates that the node is triggered every 200 seconds.</li>
     * <li><strong>one_time</strong>: Specify a scheduling time in the format of yyyy-MM-dd HH:mm:ss or a timestamp in milliseconds. For example, &quot;2022-10-10 10:10:00&quot;.</li>
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
     * <li>-1: none<br/></li>
     * <li>1: cron<br/></li>
     * <li>3: fix_rate<br/></li>
     * <li>5: one_time<br/></li>
     * <li>100: api</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
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
     * <p>The configuration for K8s node types. Set this parameter if the node type is K8s.
     * Job node: {&quot;resource&quot;:&quot;job&quot;}
     * Shell node: {&quot;image&quot;:&quot;busybox&quot;,&quot;resource&quot;:&quot;shell&quot;}</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;resource&quot;:&quot;job&quot;}</p>
     */
    @NameInMap("XAttrs")
    public String XAttrs;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateJobShrinkRequest setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
        return this;
    }
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    public CreateJobShrinkRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public CreateJobShrinkRequest setChildJobId(String childJobId) {
        this.childJobId = childJobId;
        return this;
    }
    public String getChildJobId() {
        return this.childJobId;
    }

    public CreateJobShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateJobShrinkRequest setCoordinateShrink(String coordinateShrink) {
        this.coordinateShrink = coordinateShrink;
        return this;
    }
    public String getCoordinateShrink() {
        return this.coordinateShrink;
    }

    public CreateJobShrinkRequest setDependentStrategy(Integer dependentStrategy) {
        this.dependentStrategy = dependentStrategy;
        return this;
    }
    public Integer getDependentStrategy() {
        return this.dependentStrategy;
    }

    public CreateJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobShrinkRequest setExecutorBlockStrategy(Integer executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy;
        return this;
    }
    public Integer getExecutorBlockStrategy() {
        return this.executorBlockStrategy;
    }

    public CreateJobShrinkRequest setJobHandler(String jobHandler) {
        this.jobHandler = jobHandler;
        return this;
    }
    public String getJobHandler() {
        return this.jobHandler;
    }

    public CreateJobShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateJobShrinkRequest setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
        return this;
    }
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    public CreateJobShrinkRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public CreateJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobShrinkRequest setNoticeConfigShrink(String noticeConfigShrink) {
        this.noticeConfigShrink = noticeConfigShrink;
        return this;
    }
    public String getNoticeConfigShrink() {
        return this.noticeConfigShrink;
    }

    public CreateJobShrinkRequest setNoticeContactsShrink(String noticeContactsShrink) {
        this.noticeContactsShrink = noticeContactsShrink;
        return this;
    }
    public String getNoticeContactsShrink() {
        return this.noticeContactsShrink;
    }

    public CreateJobShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateJobShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateJobShrinkRequest setRouteStrategy(Integer routeStrategy) {
        this.routeStrategy = routeStrategy;
        return this;
    }
    public Integer getRouteStrategy() {
        return this.routeStrategy;
    }

    public CreateJobShrinkRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public CreateJobShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateJobShrinkRequest setStartTimeType(Integer startTimeType) {
        this.startTimeType = startTimeType;
        return this;
    }
    public Integer getStartTimeType() {
        return this.startTimeType;
    }

    public CreateJobShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateJobShrinkRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public CreateJobShrinkRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public CreateJobShrinkRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateJobShrinkRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public CreateJobShrinkRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

}
