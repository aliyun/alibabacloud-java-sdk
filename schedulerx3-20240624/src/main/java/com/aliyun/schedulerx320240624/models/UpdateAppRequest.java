// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    /**
     * <p>The access token.</p>
     * 
     * <strong>example:</strong>
     * <p>f312159702f4469585586ed5a6904163v3</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

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
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable logging.</p>
     * <ul>
     * <li><p><code>true</code>: Enables logging.</p>
     * </li>
     * <li><p><code>false</code>: Disables logging.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLog")
    public Boolean enableLog;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LabelRouteStrategy")
    public Integer labelRouteStrategy;

    /**
     * <p>The task execution queue size.</p>
     * <blockquote>
     * <p>Sets the maximum number of concurrent task instances in the application group. Additional task instances are queued for execution and not discarded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试应用</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkerId")
    public Integer workerId;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAppRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateAppRequest setEnableLog(Boolean enableLog) {
        this.enableLog = enableLog;
        return this;
    }
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    public UpdateAppRequest setLabelRouteStrategy(Integer labelRouteStrategy) {
        this.labelRouteStrategy = labelRouteStrategy;
        return this;
    }
    public Integer getLabelRouteStrategy() {
        return this.labelRouteStrategy;
    }

    public UpdateAppRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateAppRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateAppRequest setWorkerId(Integer workerId) {
        this.workerId = workerId;
        return this;
    }
    public Integer getWorkerId() {
        return this.workerId;
    }

}
