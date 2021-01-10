// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectMhsplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectMhsplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectMhsplugindetailRequest self = new GetHasInspectMhsplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectMhsplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
