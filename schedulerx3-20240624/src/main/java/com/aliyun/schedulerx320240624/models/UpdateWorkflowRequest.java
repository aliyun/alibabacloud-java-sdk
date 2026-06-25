// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateWorkflowRequest extends TeaModel {
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
     * <p>The name of a custom calendar to exclude specific dates from the schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>A unique token that you provide to ensure the request is idempotent. The token can be up to 64 ASCII characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>D0DE9C33-992A-580B-89C4-B609A292748D</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-d6a5243b6fa</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The workflow description.</p>
     * 
     * <strong>example:</strong>
     * <p>my first workflow</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum concurrency for the workflow.</p>
     * <blockquote>
     * <p>The maximum number of concurrent instances that can run for the same workflow. A value of <code>1</code> prevents overlapping runs. If the number of running instances reaches this limit, subsequent scheduled runs are skipped.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>myWorkflow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The cron expression for the schedule. This parameter is required only when <code>TimeType</code> is set to <code>1</code> (cron).</p>
     * <ul>
     * <li><p>If <code>TimeType</code> is <code>-1</code> (none), this parameter is not required.</p>
     * </li>
     * <li><p>If <code>TimeType</code> is <code>1</code> (cron), specify a standard cron expression.</p>
     * </li>
     * <li><p>If <code>TimeType</code> is <code>100</code> (api), this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0 0/10 * * * ?</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li><p><code>-1</code> (none): The workflow is not scheduled and must be triggered on demand.</p>
     * </li>
     * <li><p><code>1</code> (cron): The workflow runs based on the cron expression in the <code>TimeExpression</code> parameter.</p>
     * </li>
     * <li><p><code>100</code> (api): The workflow is triggered by an API call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The time zone for the schedule.</p>
     * <blockquote>
     * <p>Defaults to the time zone of the SchedulerX server.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>The workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static UpdateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowRequest self = new UpdateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateWorkflowRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public UpdateWorkflowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateWorkflowRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkflowRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkflowRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public UpdateWorkflowRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public UpdateWorkflowRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public UpdateWorkflowRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
