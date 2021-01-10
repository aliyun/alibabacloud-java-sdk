// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectParamRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("ConfigKey")
    public String configKey;

    public static UpdateHasInspectParamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectParamRequest self = new UpdateHasInspectParamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectParamRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasInspectParamRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasInspectParamRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
