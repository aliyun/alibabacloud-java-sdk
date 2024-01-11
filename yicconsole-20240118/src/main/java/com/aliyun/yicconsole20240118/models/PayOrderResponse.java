// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class PayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PayOrderResponseBody body;

    public static PayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        PayOrderResponse self = new PayOrderResponse();
        return TeaModel.build(map, self);
    }

    public PayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PayOrderResponse setBody(PayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public PayOrderResponseBody getBody() {
        return this.body;
    }

}
