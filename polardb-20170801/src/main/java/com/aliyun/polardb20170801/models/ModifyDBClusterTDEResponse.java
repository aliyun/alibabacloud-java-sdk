// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterTDEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBClusterTDEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterTDEResponse setBody(ModifyDBClusterTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterTDEResponseBody getBody() {
        return this.body;
    }

}
