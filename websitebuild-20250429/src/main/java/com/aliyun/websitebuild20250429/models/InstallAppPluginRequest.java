// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class InstallAppPluginRequest extends TeaModel {
    /**
     * <p>The ID of the gateway plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The locked version. If left empty, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.7</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    public static InstallAppPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAppPluginRequest self = new InstallAppPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallAppPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public InstallAppPluginRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

}
