// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginRequest extends TeaModel {
    /**
     * <p>The gateway plug-in ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    public static GetAppPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginRequest self = new GetAppPluginRequest();
        return TeaModel.build(map, self);
    }

    public GetAppPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
