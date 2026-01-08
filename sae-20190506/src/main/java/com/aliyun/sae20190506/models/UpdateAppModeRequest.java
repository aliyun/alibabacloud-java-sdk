// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppModeRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>Enable Idle Mode?</p>
     * <p>Enumeration value:</p>
     * <ul>
     * <li>true: enables.</li>
     * <li>false: disables.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIdle")
    public Boolean enableIdle;

    @NameInMap("IdleHour")
    public String idleHour;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static UpdateAppModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModeRequest self = new UpdateAppModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppModeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppModeRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public UpdateAppModeRequest setEnableIdle(Boolean enableIdle) {
        this.enableIdle = enableIdle;
        return this;
    }
    public Boolean getEnableIdle() {
        return this.enableIdle;
    }

    public UpdateAppModeRequest setIdleHour(String idleHour) {
        this.idleHour = idleHour;
        return this;
    }
    public String getIdleHour() {
        return this.idleHour;
    }

    public UpdateAppModeRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
