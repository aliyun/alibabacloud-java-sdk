// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellpluginfullcodeRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static GetHasInspectShellpluginfullcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellpluginfullcodeRequest self = new GetHasInspectShellpluginfullcodeRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellpluginfullcodeRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public GetHasInspectShellpluginfullcodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
