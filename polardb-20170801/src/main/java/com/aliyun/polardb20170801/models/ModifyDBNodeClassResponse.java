// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBNodeClassResponseBody body;

    public static ModifyDBNodeClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeClassResponse self = new ModifyDBNodeClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeClassResponse setBody(ModifyDBNodeClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeClassResponseBody getBody() {
        return this.body;
    }

}
