// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemoryHealthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryHealthResponseBody body;

    public static GetMemoryHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryHealthResponse self = new GetMemoryHealthResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryHealthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryHealthResponse setBody(GetMemoryHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryHealthResponseBody getBody() {
        return this.body;
    }

}
