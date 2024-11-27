// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f312159702f4469585586ed5a6904163v3</p>
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

}
