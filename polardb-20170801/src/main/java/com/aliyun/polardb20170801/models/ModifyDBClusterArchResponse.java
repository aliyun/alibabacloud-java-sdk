// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterArchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterArchResponseBody body;

    public static ModifyDBClusterArchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterArchResponse self = new ModifyDBClusterArchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterArchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterArchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterArchResponse setBody(ModifyDBClusterArchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterArchResponseBody getBody() {
        return this.body;
    }

}
