// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPythonplugincopyRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    public static ExecHasInspectPythonplugincopyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPythonplugincopyRequest self = new ExecHasInspectPythonplugincopyRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPythonplugincopyRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
