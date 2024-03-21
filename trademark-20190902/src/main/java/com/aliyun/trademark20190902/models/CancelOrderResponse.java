// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CancelOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOrderResponseBody body;

    public static CancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderResponse self = new CancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOrderResponse setBody(CancelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrderResponseBody getBody() {
        return this.body;
    }

}
