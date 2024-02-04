// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBClusterSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterSSLResponse setBody(ModifyDBClusterSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterSSLResponseBody getBody() {
        return this.body;
    }

}
