// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class OrderQosProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderQosProductResponseBody body;

    public static OrderQosProductResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderQosProductResponse self = new OrderQosProductResponse();
        return TeaModel.build(map, self);
    }

    public OrderQosProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderQosProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderQosProductResponse setBody(OrderQosProductResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderQosProductResponseBody getBody() {
        return this.body;
    }

}
