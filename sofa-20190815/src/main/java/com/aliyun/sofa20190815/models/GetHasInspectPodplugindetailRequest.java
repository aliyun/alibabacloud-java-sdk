// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPodplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectPodplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPodplugindetailRequest self = new GetHasInspectPodplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPodplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
