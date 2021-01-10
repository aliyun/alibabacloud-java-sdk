// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJarlistRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectJarlistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJarlistRequest self = new GetHasInspectJarlistRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJarlistRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
