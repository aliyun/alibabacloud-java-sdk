// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPluginapplyforpublishRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static ExecHasInspectPluginapplyforpublishRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPluginapplyforpublishRequest self = new ExecHasInspectPluginapplyforpublishRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPluginapplyforpublishRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
