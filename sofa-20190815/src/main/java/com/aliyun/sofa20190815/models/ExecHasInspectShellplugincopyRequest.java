// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectShellplugincopyRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static ExecHasInspectShellplugincopyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectShellplugincopyRequest self = new ExecHasInspectShellplugincopyRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectShellplugincopyRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
