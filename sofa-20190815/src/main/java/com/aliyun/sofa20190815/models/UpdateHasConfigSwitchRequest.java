// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasConfigSwitchRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasConfigSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasConfigSwitchRequest self = new UpdateHasConfigSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasConfigSwitchRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasConfigSwitchRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
