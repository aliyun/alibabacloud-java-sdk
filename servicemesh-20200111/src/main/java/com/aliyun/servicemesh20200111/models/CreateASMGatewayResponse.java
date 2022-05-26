// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateASMGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateASMGatewayResponseBody body;

    public static CreateASMGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateASMGatewayResponse self = new CreateASMGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateASMGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateASMGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateASMGatewayResponse setBody(CreateASMGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateASMGatewayResponseBody getBody() {
        return this.body;
    }

}
