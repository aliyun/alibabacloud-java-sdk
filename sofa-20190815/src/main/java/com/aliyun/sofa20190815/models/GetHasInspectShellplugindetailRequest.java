// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectShellplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellplugindetailRequest self = new GetHasInspectShellplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
