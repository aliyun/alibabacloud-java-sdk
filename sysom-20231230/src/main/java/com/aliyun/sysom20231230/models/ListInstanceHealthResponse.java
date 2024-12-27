// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceHealthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceHealthResponseBody body;

    public static ListInstanceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHealthResponse self = new ListInstanceHealthResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceHealthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceHealthResponse setBody(ListInstanceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceHealthResponseBody getBody() {
        return this.body;
    }

}
