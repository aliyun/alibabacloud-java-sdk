// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpcGatewayEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpcGatewayEndpointResponseBody body;

    public static DeleteVpcGatewayEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcGatewayEndpointResponse self = new DeleteVpcGatewayEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcGatewayEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcGatewayEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcGatewayEndpointResponse setBody(DeleteVpcGatewayEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

}
