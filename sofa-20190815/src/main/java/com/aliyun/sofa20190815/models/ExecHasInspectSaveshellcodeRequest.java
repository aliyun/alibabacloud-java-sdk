// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSaveshellcodeRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectSaveshellcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSaveshellcodeRequest self = new ExecHasInspectSaveshellcodeRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSaveshellcodeRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ExecHasInspectSaveshellcodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
