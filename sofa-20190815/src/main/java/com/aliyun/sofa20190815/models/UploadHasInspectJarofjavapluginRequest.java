// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadHasInspectJarofjavapluginRequest extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UploadHasInspectJarofjavapluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadHasInspectJarofjavapluginRequest self = new UploadHasInspectJarofjavapluginRequest();
        return TeaModel.build(map, self);
    }

    public UploadHasInspectJarofjavapluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UploadHasInspectJarofjavapluginRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
