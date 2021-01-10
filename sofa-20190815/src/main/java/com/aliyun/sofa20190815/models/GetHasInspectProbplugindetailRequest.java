// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectProbplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectProbplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectProbplugindetailRequest self = new GetHasInspectProbplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectProbplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
