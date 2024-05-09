// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTableResponseBody body;

    public static ModifyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTableResponse self = new ModifyTableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTableResponse setBody(ModifyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTableResponseBody getBody() {
        return this.body;
    }

}
