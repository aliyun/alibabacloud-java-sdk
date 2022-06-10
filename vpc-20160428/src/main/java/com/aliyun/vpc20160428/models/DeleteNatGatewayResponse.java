// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNatGatewayResponseBody body;

    public static DeleteNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayResponse self = new DeleteNatGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNatGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNatGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNatGatewayResponse setBody(DeleteNatGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNatGatewayResponseBody getBody() {
        return this.body;
    }

}
