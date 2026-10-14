// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallHotfixResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallHotfixResponseBody body;

    public static UninstallHotfixResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallHotfixResponse self = new UninstallHotfixResponse();
        return TeaModel.build(map, self);
    }

    public UninstallHotfixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallHotfixResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallHotfixResponse setBody(UninstallHotfixResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallHotfixResponseBody getBody() {
        return this.body;
    }

}
