// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectPluginRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static DeleteHasInspectPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectPluginRequest self = new DeleteHasInspectPluginRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
