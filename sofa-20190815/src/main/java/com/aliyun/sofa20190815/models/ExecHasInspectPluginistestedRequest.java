// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPluginistestedRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectPluginistestedRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPluginistestedRequest self = new ExecHasInspectPluginistestedRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPluginistestedRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ExecHasInspectPluginistestedRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
