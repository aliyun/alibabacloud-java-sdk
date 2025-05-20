// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class DelMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelMessageResponseBody body;

    public static DelMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DelMessageResponse self = new DelMessageResponse();
        return TeaModel.build(map, self);
    }

    public DelMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelMessageResponse setBody(DelMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DelMessageResponseBody getBody() {
        return this.body;
    }

}
