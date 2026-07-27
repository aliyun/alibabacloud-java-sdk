// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGwConsumerOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGwConsumerOrderResponseBody body;

    public static CreateGwConsumerOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGwConsumerOrderResponse self = new CreateGwConsumerOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateGwConsumerOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGwConsumerOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGwConsumerOrderResponse setBody(CreateGwConsumerOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGwConsumerOrderResponseBody getBody() {
        return this.body;
    }

}
