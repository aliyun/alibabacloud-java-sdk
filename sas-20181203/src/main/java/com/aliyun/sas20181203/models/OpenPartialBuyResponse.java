// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenPartialBuyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenPartialBuyResponseBody body;

    public static OpenPartialBuyResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenPartialBuyResponse self = new OpenPartialBuyResponse();
        return TeaModel.build(map, self);
    }

    public OpenPartialBuyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenPartialBuyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenPartialBuyResponse setBody(OpenPartialBuyResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenPartialBuyResponseBody getBody() {
        return this.body;
    }

}
