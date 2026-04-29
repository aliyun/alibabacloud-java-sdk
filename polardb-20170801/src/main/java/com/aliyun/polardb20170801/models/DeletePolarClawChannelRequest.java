// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UninstallPlugin")
    public Boolean uninstallPlugin;

    public static DeletePolarClawChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawChannelRequest self = new DeletePolarClawChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawChannelRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DeletePolarClawChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DeletePolarClawChannelRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DeletePolarClawChannelRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public DeletePolarClawChannelRequest setUninstallPlugin(Boolean uninstallPlugin) {
        this.uninstallPlugin = uninstallPlugin;
        return this;
    }
    public Boolean getUninstallPlugin() {
        return this.uninstallPlugin;
    }

}
