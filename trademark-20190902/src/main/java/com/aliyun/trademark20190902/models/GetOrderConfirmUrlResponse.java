// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetOrderConfirmUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrderConfirmUrlResponseBody body;

    public static GetOrderConfirmUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderConfirmUrlResponse self = new GetOrderConfirmUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderConfirmUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderConfirmUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderConfirmUrlResponse setBody(GetOrderConfirmUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderConfirmUrlResponseBody getBody() {
        return this.body;
    }

}
