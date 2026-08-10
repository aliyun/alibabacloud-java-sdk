// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateInfiniteCanvasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInfiniteCanvasResponseBody body;

    public static UpdateInfiniteCanvasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInfiniteCanvasResponse self = new UpdateInfiniteCanvasResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInfiniteCanvasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInfiniteCanvasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInfiniteCanvasResponse setBody(UpdateInfiniteCanvasResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInfiniteCanvasResponseBody getBody() {
        return this.body;
    }

}
