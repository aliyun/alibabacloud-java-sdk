// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingInstanceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRenderingInstanceGatewayResponseBody body;

    public static CreateRenderingInstanceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingInstanceGatewayResponse self = new CreateRenderingInstanceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateRenderingInstanceGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRenderingInstanceGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRenderingInstanceGatewayResponse setBody(CreateRenderingInstanceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRenderingInstanceGatewayResponseBody getBody() {
        return this.body;
    }

}
