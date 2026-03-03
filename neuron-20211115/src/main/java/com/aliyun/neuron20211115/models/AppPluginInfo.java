// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AppPluginInfo extends TeaModel {
    @NameInMap("appId")
    public Long appId;

    @NameInMap("appVersion")
    public String appVersion;

    @NameInMap("appVersionId")
    public Long appVersionId;

    @NameInMap("config")
    public MobiPluginConfig config;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>MULTIPLEMALL_CONSOLE_LAYOUT_APPSTORE</p>
     */
    @NameInMap("pluginKey")
    public String pluginKey;

    /**
     * <strong>example:</strong>
     * <p>PAGE</p>
     */
    @NameInMap("pluginType")
    public String pluginType;

    /**
     * <strong>example:</strong>
     * <p>MOBI</p>
     */
    @NameInMap("type")
    public String type;

    public static AppPluginInfo build(java.util.Map<String, ?> map) throws Exception {
        AppPluginInfo self = new AppPluginInfo();
        return TeaModel.build(map, self);
    }

    public AppPluginInfo setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public AppPluginInfo setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AppPluginInfo setAppVersionId(Long appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public Long getAppVersionId() {
        return this.appVersionId;
    }

    public AppPluginInfo setConfig(MobiPluginConfig config) {
        this.config = config;
        return this;
    }
    public MobiPluginConfig getConfig() {
        return this.config;
    }

    public AppPluginInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppPluginInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppPluginInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AppPluginInfo setPluginKey(String pluginKey) {
        this.pluginKey = pluginKey;
        return this;
    }
    public String getPluginKey() {
        return this.pluginKey;
    }

    public AppPluginInfo setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public AppPluginInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
