// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVpcEndpointServiceAttributeResponseBody body;

    public static GetVpcEndpointServiceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointServiceAttributeResponse self = new GetVpcEndpointServiceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcEndpointServiceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcEndpointServiceAttributeResponse setBody(GetVpcEndpointServiceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcEndpointServiceAttributeResponseBody getBody() {
        return this.body;
    }

}
