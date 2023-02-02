// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageResendByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsDLQMessageResendByIdResponseBody body;

    public static OnsDLQMessageResendByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageResendByIdResponse self = new OnsDLQMessageResendByIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageResendByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsDLQMessageResendByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsDLQMessageResendByIdResponse setBody(OnsDLQMessageResendByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsDLQMessageResendByIdResponseBody getBody() {
        return this.body;
    }

}
