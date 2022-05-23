// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class OrderFreeFlowProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderFreeFlowProductResponseBody body;

    public static OrderFreeFlowProductResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderFreeFlowProductResponse self = new OrderFreeFlowProductResponse();
        return TeaModel.build(map, self);
    }

    public OrderFreeFlowProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderFreeFlowProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderFreeFlowProductResponse setBody(OrderFreeFlowProductResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderFreeFlowProductResponseBody getBody() {
        return this.body;
    }

}
