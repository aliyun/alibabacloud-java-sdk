// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewaySpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNatGatewaySpecResponseBody body;

    public static ModifyNatGatewaySpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewaySpecResponse self = new ModifyNatGatewaySpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewaySpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatGatewaySpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatGatewaySpecResponse setBody(ModifyNatGatewaySpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatGatewaySpecResponseBody getBody() {
        return this.body;
    }

}
