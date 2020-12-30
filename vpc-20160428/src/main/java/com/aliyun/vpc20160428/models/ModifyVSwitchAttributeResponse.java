// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVSwitchAttributeResponseBody body;

    public static ModifyVSwitchAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeResponse self = new ModifyVSwitchAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVSwitchAttributeResponse setBody(ModifyVSwitchAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVSwitchAttributeResponseBody getBody() {
        return this.body;
    }

}
