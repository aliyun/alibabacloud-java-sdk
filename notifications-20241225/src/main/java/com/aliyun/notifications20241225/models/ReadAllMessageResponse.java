// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadAllMessageResponseBody body;

    public static ReadAllMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadAllMessageResponse self = new ReadAllMessageResponse();
        return TeaModel.build(map, self);
    }

    public ReadAllMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadAllMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadAllMessageResponse setBody(ReadAllMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadAllMessageResponseBody getBody() {
        return this.body;
    }

}
