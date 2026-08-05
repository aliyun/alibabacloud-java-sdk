// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetInfiniteCanvasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInfiniteCanvasResponseBody body;

    public static GetInfiniteCanvasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInfiniteCanvasResponse self = new GetInfiniteCanvasResponse();
        return TeaModel.build(map, self);
    }

    public GetInfiniteCanvasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInfiniteCanvasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInfiniteCanvasResponse setBody(GetInfiniteCanvasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInfiniteCanvasResponseBody getBody() {
        return this.body;
    }

}
