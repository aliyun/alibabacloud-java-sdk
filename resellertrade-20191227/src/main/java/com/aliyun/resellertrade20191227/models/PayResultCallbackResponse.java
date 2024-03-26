// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class PayResultCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PayResultCallbackResponseBody body;

    public static PayResultCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        PayResultCallbackResponse self = new PayResultCallbackResponse();
        return TeaModel.build(map, self);
    }

    public PayResultCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PayResultCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PayResultCallbackResponse setBody(PayResultCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public PayResultCallbackResponseBody getBody() {
        return this.body;
    }

}
