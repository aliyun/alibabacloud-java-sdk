// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotfixTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotfixTaskResponseBody body;

    public static GetHotfixTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotfixTaskResponse self = new GetHotfixTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetHotfixTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotfixTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotfixTaskResponse setBody(GetHotfixTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotfixTaskResponseBody getBody() {
        return this.body;
    }

}
