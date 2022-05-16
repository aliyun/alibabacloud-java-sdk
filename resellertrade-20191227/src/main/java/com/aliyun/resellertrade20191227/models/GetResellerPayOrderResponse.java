// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetResellerPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResellerPayOrderResponseBody body;

    public static GetResellerPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResellerPayOrderResponse self = new GetResellerPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetResellerPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResellerPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResellerPayOrderResponse setBody(GetResellerPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResellerPayOrderResponseBody getBody() {
        return this.body;
    }

}
