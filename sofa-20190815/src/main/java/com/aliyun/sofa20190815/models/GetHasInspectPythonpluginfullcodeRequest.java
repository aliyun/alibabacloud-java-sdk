// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonpluginfullcodeRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static GetHasInspectPythonpluginfullcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonpluginfullcodeRequest self = new GetHasInspectPythonpluginfullcodeRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonpluginfullcodeRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public GetHasInspectPythonpluginfullcodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
