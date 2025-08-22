// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ltk1ZXHv6LvibZypFkPHzRA</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLog")
    public Boolean enableLog;

    @NameInMap("LabelRouteStrategy")
    public Integer labelRouteStrategy;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public CreateAppRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateAppRequest setEnableLog(Boolean enableLog) {
        this.enableLog = enableLog;
        return this;
    }
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    public CreateAppRequest setLabelRouteStrategy(Integer labelRouteStrategy) {
        this.labelRouteStrategy = labelRouteStrategy;
        return this;
    }
    public Integer getLabelRouteStrategy() {
        return this.labelRouteStrategy;
    }

    public CreateAppRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public CreateAppRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
