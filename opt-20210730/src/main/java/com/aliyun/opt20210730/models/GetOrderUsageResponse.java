// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrderUsageResponseBody body;

    public static GetOrderUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderUsageResponse self = new GetOrderUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderUsageResponse setBody(GetOrderUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderUsageResponseBody getBody() {
        return this.body;
    }

}
