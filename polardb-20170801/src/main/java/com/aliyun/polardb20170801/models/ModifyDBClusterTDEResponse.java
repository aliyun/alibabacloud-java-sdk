// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterTDEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterTDEResponseBody body;

    public static ModifyDBClusterTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterTDEResponse self = new ModifyDBClusterTDEResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterTDEResponse setBody(ModifyDBClusterTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterTDEResponseBody getBody() {
        return this.body;
    }

}
