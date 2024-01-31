// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOrderForDeleteDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrderForDeleteDBNodesResponseBody body;

    public static CreateOrderForDeleteDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForDeleteDBNodesResponse self = new CreateOrderForDeleteDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderForDeleteDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderForDeleteDBNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderForDeleteDBNodesResponse setBody(CreateOrderForDeleteDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderForDeleteDBNodesResponseBody getBody() {
        return this.body;
    }

}
