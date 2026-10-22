// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UninstallAppPluginRequest extends TeaModel {
    /**
     * <p>The ID of the gateway plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    public static UninstallAppPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallAppPluginRequest self = new UninstallAppPluginRequest();
        return TeaModel.build(map, self);
    }

    public UninstallAppPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
