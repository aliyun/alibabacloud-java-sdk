// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteInfiniteCanvasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInfiniteCanvasResponseBody body;

    public static DeleteInfiniteCanvasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInfiniteCanvasResponse self = new DeleteInfiniteCanvasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInfiniteCanvasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInfiniteCanvasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInfiniteCanvasResponse setBody(DeleteInfiniteCanvasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInfiniteCanvasResponseBody getBody() {
        return this.body;
    }

}
