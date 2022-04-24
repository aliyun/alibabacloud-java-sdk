// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBNodesClassResponseBody body;

    public static ModifyDBNodesClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodesClassResponse self = new ModifyDBNodesClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodesClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodesClassResponse setBody(ModifyDBNodesClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodesClassResponseBody getBody() {
        return this.body;
    }

}
