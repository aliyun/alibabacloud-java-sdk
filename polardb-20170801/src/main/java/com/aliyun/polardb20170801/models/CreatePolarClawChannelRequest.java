// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawChannelRequest extends TeaModel {
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
     *         &quot;*&quot;
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@larksuite/<a href="mailto:openclaw-lark@2026.4.7">openclaw-lark@2026.4.7</a></p>
     */
    @NameInMap("NpmPackage")
    public String npmPackage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openclaw-lark</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static CreatePolarClawChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawChannelRequest self = new CreatePolarClawChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawChannelRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawChannelRequest setChannelConfig(java.util.Map<String, ?> channelConfig) {
        this.channelConfig = channelConfig;
        return this;
    }
    public java.util.Map<String, ?> getChannelConfig() {
        return this.channelConfig;
    }

    public CreatePolarClawChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreatePolarClawChannelRequest setNpmPackage(String npmPackage) {
        this.npmPackage = npmPackage;
        return this;
    }
    public String getNpmPackage() {
        return this.npmPackage;
    }

    public CreatePolarClawChannelRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public CreatePolarClawChannelRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
