// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNatGatewayNatTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNatGatewayNatTypeResponseBody body;

    public static UpdateNatGatewayNatTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNatGatewayNatTypeResponse self = new UpdateNatGatewayNatTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNatGatewayNatTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNatGatewayNatTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNatGatewayNatTypeResponse setBody(UpdateNatGatewayNatTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNatGatewayNatTypeResponseBody getBody() {
        return this.body;
    }

}
