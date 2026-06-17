// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawChannelShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The channel configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;enabled&quot;: true,
     *     &quot;dmPolicy&quot;: &quot;open&quot;,
     *     &quot;allowFrom&quot;: [
     *         &quot;*&quot;
     *     ]
     * }</p>
     */
    @NameInMap("ChannelConfig")
    public String channelConfigShrink;

    /**
     * <p>The channel\&quot;s unique identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The name and version of the npm package for the channel plugin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@larksuite/<a href="mailto:openclaw-lark@2026.4.7">openclaw-lark@2026.4.7</a></p>
     */
    @NameInMap("NpmPackage")
    public String npmPackage;

    /**
     * <p>The channel plugin\&quot;s name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openclaw-lark</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>Indicates whether to restart the gateway after the channel is created. Default: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static CreatePolarClawChannelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawChannelShrinkRequest self = new CreatePolarClawChannelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawChannelShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawChannelShrinkRequest setChannelConfigShrink(String channelConfigShrink) {
        this.channelConfigShrink = channelConfigShrink;
        return this;
    }
    public String getChannelConfigShrink() {
        return this.channelConfigShrink;
    }

    public CreatePolarClawChannelShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreatePolarClawChannelShrinkRequest setNpmPackage(String npmPackage) {
        this.npmPackage = npmPackage;
        return this;
    }
    public String getNpmPackage() {
        return this.npmPackage;
    }

    public CreatePolarClawChannelShrinkRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public CreatePolarClawChannelShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
