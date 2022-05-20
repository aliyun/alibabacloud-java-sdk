// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class OrderQosServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderQosServiceResponseBody body;

    public static OrderQosServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderQosServiceResponse self = new OrderQosServiceResponse();
        return TeaModel.build(map, self);
    }

    public OrderQosServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderQosServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderQosServiceResponse setBody(OrderQosServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderQosServiceResponseBody getBody() {
        return this.body;
    }

}
