// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectImageplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectImageplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectImageplugindetailRequest self = new GetHasInspectImageplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectImageplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
