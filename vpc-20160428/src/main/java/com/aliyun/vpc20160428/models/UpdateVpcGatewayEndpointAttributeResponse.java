// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVpcGatewayEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateVpcGatewayEndpointAttributeResponse setBody(UpdateVpcGatewayEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcGatewayEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
