// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListInfiniteCanvasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInfiniteCanvasesResponseBody body;

    public static ListInfiniteCanvasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInfiniteCanvasesResponse self = new ListInfiniteCanvasesResponse();
        return TeaModel.build(map, self);
    }

    public ListInfiniteCanvasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInfiniteCanvasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInfiniteCanvasesResponse setBody(ListInfiniteCanvasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInfiniteCanvasesResponseBody getBody() {
        return this.body;
    }

}
