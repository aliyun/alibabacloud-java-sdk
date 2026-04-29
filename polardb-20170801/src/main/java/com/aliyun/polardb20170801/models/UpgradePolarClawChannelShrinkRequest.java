// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawChannelShrinkRequest extends TeaModel {
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
    public String channelConfigShrink;

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

    public static UpgradePolarClawChannelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawChannelShrinkRequest self = new UpgradePolarClawChannelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawChannelShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpgradePolarClawChannelShrinkRequest setChannelConfigShrink(String channelConfigShrink) {
        this.channelConfigShrink = channelConfigShrink;
        return this;
    }
    public String getChannelConfigShrink() {
        return this.channelConfigShrink;
    }

    public UpgradePolarClawChannelShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpgradePolarClawChannelShrinkRequest setNpmPackage(String npmPackage) {
        this.npmPackage = npmPackage;
        return this;
    }
    public String getNpmPackage() {
        return this.npmPackage;
    }

    public UpgradePolarClawChannelShrinkRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpgradePolarClawChannelShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
