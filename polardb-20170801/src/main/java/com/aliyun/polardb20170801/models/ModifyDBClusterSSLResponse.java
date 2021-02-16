// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterSSLResponseBody body;

    public static ModifyDBClusterSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterSSLResponse self = new ModifyDBClusterSSLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterSSLResponse setBody(ModifyDBClusterSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterSSLResponseBody getBody() {
        return this.body;
    }

}
