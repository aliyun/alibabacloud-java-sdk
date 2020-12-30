// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBgpGroupAttributeResponseBody body;

    public static ModifyBgpGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpGroupAttributeResponse self = new ModifyBgpGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBgpGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBgpGroupAttributeResponse setBody(ModifyBgpGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBgpGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
