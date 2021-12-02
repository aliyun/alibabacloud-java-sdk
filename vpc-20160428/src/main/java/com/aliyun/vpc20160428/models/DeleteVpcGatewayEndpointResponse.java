// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpcGatewayEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteVpcGatewayEndpointResponse setBody(DeleteVpcGatewayEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

}
