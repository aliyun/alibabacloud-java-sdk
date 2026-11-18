// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairAIGatewayInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTairAIGatewayInstanceResponseBody body;

    public static CreateTairAIGatewayInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTairAIGatewayInstanceResponse self = new CreateTairAIGatewayInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateTairAIGatewayInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTairAIGatewayInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTairAIGatewayInstanceResponse setBody(CreateTairAIGatewayInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTairAIGatewayInstanceResponseBody getBody() {
        return this.body;
    }

}
