// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MarkTodosReadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MarkTodosReadResponseBody body;

    public static MarkTodosReadResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkTodosReadResponse self = new MarkTodosReadResponse();
        return TeaModel.build(map, self);
    }

    public MarkTodosReadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkTodosReadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkTodosReadResponse setBody(MarkTodosReadResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkTodosReadResponseBody getBody() {
        return this.body;
    }

}
