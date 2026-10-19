// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CountTodosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CountTodosResponseBody body;

    public static CountTodosResponse build(java.util.Map<String, ?> map) throws Exception {
        CountTodosResponse self = new CountTodosResponse();
        return TeaModel.build(map, self);
    }

    public CountTodosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountTodosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountTodosResponse setBody(CountTodosResponseBody body) {
        this.body = body;
        return this;
    }
    public CountTodosResponseBody getBody() {
        return this.body;
    }

}
