// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavaplugindetailRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static GetHasInspectJavaplugindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavaplugindetailRequest self = new GetHasInspectJavaplugindetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavaplugindetailRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
