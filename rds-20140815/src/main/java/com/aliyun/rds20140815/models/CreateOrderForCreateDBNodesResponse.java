// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOrderForCreateDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderForCreateDBNodesResponseBody body;

    public static CreateOrderForCreateDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForCreateDBNodesResponse self = new CreateOrderForCreateDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderForCreateDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderForCreateDBNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderForCreateDBNodesResponse setBody(CreateOrderForCreateDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderForCreateDBNodesResponseBody getBody() {
        return this.body;
    }

}
