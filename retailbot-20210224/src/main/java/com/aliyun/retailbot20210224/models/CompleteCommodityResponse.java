// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CompleteCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteCommodityResponseBody body;

    public static CompleteCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteCommodityResponse self = new CompleteCommodityResponse();
        return TeaModel.build(map, self);
    }

    public CompleteCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteCommodityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteCommodityResponse setBody(CompleteCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteCommodityResponseBody getBody() {
        return this.body;
    }

}
