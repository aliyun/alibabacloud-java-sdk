// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RollbackAppPluginVersionRequest extends TeaModel {
    /**
     * <p>The ID of the gateway plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The target version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    public static RollbackAppPluginVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackAppPluginVersionRequest self = new RollbackAppPluginVersionRequest();
        return TeaModel.build(map, self);
    }

    public RollbackAppPluginVersionRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public RollbackAppPluginVersionRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

}
