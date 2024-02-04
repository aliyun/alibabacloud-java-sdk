// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBNodesClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodesClassResponse setBody(ModifyDBNodesClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodesClassResponseBody getBody() {
        return this.body;
    }

}
