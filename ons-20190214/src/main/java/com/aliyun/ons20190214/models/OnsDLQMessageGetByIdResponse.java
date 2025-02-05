// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageGetByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsDLQMessageGetByIdResponseBody body;

    public static OnsDLQMessageGetByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageGetByIdResponse self = new OnsDLQMessageGetByIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageGetByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsDLQMessageGetByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsDLQMessageGetByIdResponse setBody(OnsDLQMessageGetByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsDLQMessageGetByIdResponseBody getBody() {
        return this.body;
    }

}
