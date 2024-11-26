// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class HelloResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HelloResponseBody body;

    public static HelloResponse build(java.util.Map<String, ?> map) throws Exception {
        HelloResponse self = new HelloResponse();
        return TeaModel.build(map, self);
    }

    public HelloResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HelloResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HelloResponse setBody(HelloResponseBody body) {
        this.body = body;
        return this;
    }
    public HelloResponseBody getBody() {
        return this.body;
    }

}
