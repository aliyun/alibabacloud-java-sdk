// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTaskOrderResponseBody body;

    public static CreateTaskOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderResponse self = new CreateTaskOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskOrderResponse setBody(CreateTaskOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskOrderResponseBody getBody() {
        return this.body;
    }

}
