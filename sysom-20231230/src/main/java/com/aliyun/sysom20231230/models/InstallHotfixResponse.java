// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallHotfixResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallHotfixResponseBody body;

    public static InstallHotfixResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallHotfixResponse self = new InstallHotfixResponse();
        return TeaModel.build(map, self);
    }

    public InstallHotfixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallHotfixResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallHotfixResponse setBody(InstallHotfixResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallHotfixResponseBody getBody() {
        return this.body;
    }

}
