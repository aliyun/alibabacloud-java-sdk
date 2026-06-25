// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateWorkflowRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxl-job-executor-sample</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The custom calendar. This parameter applies only when <code>TimeType</code> is <code>cron</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>A unique client token to ensure request idempotence. The token must contain only ASCII characters. If you omit this parameter, the system uses the RequestId as the ClientToken. The RequestId is unique to each request.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The workflow description.</p>
     * 
     * <strong>example:</strong>
     * <p>my first workflow for data analyse</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum concurrency for the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The workflow name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workflow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The status of the workflow. By default, the workflow is disabled. Valid values:</p>
     * <ul>
     * <li><p>0: Disabled</p>
     * </li>
     * <li><p>1: Enabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The time expression, which depends on the <code>TimeType</code> parameter.</p>
     * <ul>
     * <li><p><strong>none</strong>: This parameter is not required.</p>
     * </li>
     * <li><p><strong>cron</strong>: Enter a standard cron expression. Online validation is supported.</p>
     * </li>
     * <li><p><strong>api</strong>: This parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0 0 4 ? * Mon/1</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The schedule type. Valid values:</p>
     * <ul>
     * <li><p>-1: none<br></p>
     * </li>
     * <li><p>1: cron<br></p>
     * </li>
     * <li><p>100: api</p>
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
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static CreateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowRequest self = new CreateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateWorkflowRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public CreateWorkflowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWorkflowRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkflowRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public CreateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkflowRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateWorkflowRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public CreateWorkflowRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public CreateWorkflowRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
