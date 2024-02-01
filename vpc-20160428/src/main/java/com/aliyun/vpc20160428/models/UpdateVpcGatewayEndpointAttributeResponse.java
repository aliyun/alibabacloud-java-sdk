// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVpcGatewayEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVpcGatewayEndpointAttributeResponseBody body;

    public static UpdateVpcGatewayEndpointAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcGatewayEndpointAttributeResponse self = new UpdateVpcGatewayEndpointAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpcGatewayEndpointAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpcGatewayEndpointAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpcGatewayEndpointAttributeResponse setBody(UpdateVpcGatewayEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcGatewayEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
