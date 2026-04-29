// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;enabled&quot;: true,
     *     &quot;dmPolicy&quot;: &quot;open&quot;,
     *     &quot;allowFrom&quot;: [
     *         &quot;*&quot;,
     *         &quot;ou_abc&quot;
     *     ]
     * }</p>
     */
    @NameInMap("ChannelConfig")
    public java.util.Map<String, ?> channelConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>@larksuite/<a href="mailto:openclaw-feishu@2026.4.7">openclaw-feishu@2026.4.7</a></p>
     */
    @NameInMap("NpmPackage")
    public String npmPackage;

    /**
     * <strong>example:</strong>
     * <p>openclaw-feishu</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static UpgradePolarClawChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawChannelRequest self = new UpgradePolarClawChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawChannelRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpgradePolarClawChannelRequest setChannelConfig(java.util.Map<String, ?> channelConfig) {
        this.channelConfig = channelConfig;
        return this;
    }
    public java.util.Map<String, ?> getChannelConfig() {
        return this.channelConfig;
    }

    public UpgradePolarClawChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpgradePolarClawChannelRequest setNpmPackage(String npmPackage) {
        this.npmPackage = npmPackage;
        return this;
    }
    public String getNpmPackage() {
        return this.npmPackage;
    }

    public UpgradePolarClawChannelRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpgradePolarClawChannelRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
