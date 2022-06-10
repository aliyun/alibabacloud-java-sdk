// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayConvertStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNatGatewayConvertStatusResponseBody body;

    public static GetNatGatewayConvertStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayConvertStatusResponse self = new GetNatGatewayConvertStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayConvertStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNatGatewayConvertStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNatGatewayConvertStatusResponse setBody(GetNatGatewayConvertStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNatGatewayConvertStatusResponseBody getBody() {
        return this.body;
    }

}
