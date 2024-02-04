// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBNodeClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeClassResponse setBody(ModifyDBNodeClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeClassResponseBody getBody() {
        return this.body;
    }

}
