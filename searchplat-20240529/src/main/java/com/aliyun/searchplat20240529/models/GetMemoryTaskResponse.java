// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemoryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryTaskResponseBody body;

    public static GetMemoryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryTaskResponse self = new GetMemoryTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryTaskResponse setBody(GetMemoryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryTaskResponseBody getBody() {
        return this.body;
    }

}
