// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectJavaplugincopyRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static ExecHasInspectJavaplugincopyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectJavaplugincopyRequest self = new ExecHasInspectJavaplugincopyRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectJavaplugincopyRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
