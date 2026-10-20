// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCveHotfixResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCveHotfixResponseBody body;

    public static GetCveHotfixResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCveHotfixResponse self = new GetCveHotfixResponse();
        return TeaModel.build(map, self);
    }

    public GetCveHotfixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCveHotfixResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCveHotfixResponse setBody(GetCveHotfixResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCveHotfixResponseBody getBody() {
        return this.body;
    }

}
