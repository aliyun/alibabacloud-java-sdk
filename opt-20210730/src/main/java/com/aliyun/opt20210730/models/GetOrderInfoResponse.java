// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrderInfoResponseBody body;

    public static GetOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderInfoResponse self = new GetOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderInfoResponse setBody(GetOrderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderInfoResponseBody getBody() {
        return this.body;
    }

}
