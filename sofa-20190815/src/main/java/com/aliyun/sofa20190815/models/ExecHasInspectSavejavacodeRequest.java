// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSavejavacodeRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectSavejavacodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSavejavacodeRequest self = new ExecHasInspectSavejavacodeRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSavejavacodeRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ExecHasInspectSavejavacodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
