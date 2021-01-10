// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectPythonplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonplugindetailRequest self = new GetHasInspectPythonplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
