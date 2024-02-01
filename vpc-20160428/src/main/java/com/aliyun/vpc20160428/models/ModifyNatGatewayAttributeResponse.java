// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNatGatewayAttributeResponseBody body;

    public static ModifyNatGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayAttributeResponse self = new ModifyNatGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatGatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatGatewayAttributeResponse setBody(ModifyNatGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
