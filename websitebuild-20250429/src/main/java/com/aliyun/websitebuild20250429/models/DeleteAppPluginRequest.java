// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppPluginRequest extends TeaModel {
    /**
     * <p>The ID of the gateway plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>aliplayer-react</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    public static DeleteAppPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppPluginRequest self = new DeleteAppPluginRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
