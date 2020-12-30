// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNatGatewayResponseBody body;

    public static CreateNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponse self = new CreateNatGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatGatewayResponse setBody(CreateNatGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatGatewayResponseBody getBody() {
        return this.body;
    }

}
