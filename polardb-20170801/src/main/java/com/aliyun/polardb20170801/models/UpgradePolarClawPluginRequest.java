// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawPluginRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-********************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

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

    public static UpgradePolarClawPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawPluginRequest self = new UpgradePolarClawPluginRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawPluginRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpgradePolarClawPluginRequest setNpmPackage(String npmPackage) {
        this.npmPackage = npmPackage;
        return this;
    }
    public String getNpmPackage() {
        return this.npmPackage;
    }

    public UpgradePolarClawPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpgradePolarClawPluginRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
