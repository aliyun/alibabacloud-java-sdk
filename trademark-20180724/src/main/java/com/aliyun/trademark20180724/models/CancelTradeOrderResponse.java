// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CancelTradeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelTradeOrderResponseBody body;

    public static CancelTradeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTradeOrderResponse self = new CancelTradeOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelTradeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTradeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelTradeOrderResponse setBody(CancelTradeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTradeOrderResponseBody getBody() {
        return this.body;
    }

}
