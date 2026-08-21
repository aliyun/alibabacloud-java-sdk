// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260810.models;

import com.aliyun.tea.*;

public class A2aResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Object body;

    public static A2aResponse build(java.util.Map<String, ?> map) throws Exception {
        A2aResponse self = new A2aResponse();
        return TeaModel.build(map, self);
    }

    public A2aResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public A2aResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public A2aResponse setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
