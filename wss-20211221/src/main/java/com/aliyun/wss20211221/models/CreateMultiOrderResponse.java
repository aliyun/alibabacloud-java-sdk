// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultiOrderResponseBody body;

    public static CreateMultiOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderResponse self = new CreateMultiOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiOrderResponse setBody(CreateMultiOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiOrderResponseBody getBody() {
        return this.body;
    }

}
