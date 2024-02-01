// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcGatewayEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcGatewayEndpointResponseBody body;

    public static CreateVpcGatewayEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcGatewayEndpointResponse self = new CreateVpcGatewayEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcGatewayEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcGatewayEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcGatewayEndpointResponse setBody(CreateVpcGatewayEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

}
