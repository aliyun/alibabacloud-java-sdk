// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcGatewayEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcGatewayEndpointAttributeResponseBody body;

    public static GetVpcGatewayEndpointAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcGatewayEndpointAttributeResponse self = new GetVpcGatewayEndpointAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcGatewayEndpointAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcGatewayEndpointAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcGatewayEndpointAttributeResponse setBody(GetVpcGatewayEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcGatewayEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
