// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVpcEndpointAttributeResponseBody body;

    public static GetVpcEndpointAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointAttributeResponse self = new GetVpcEndpointAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcEndpointAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcEndpointAttributeResponse setBody(GetVpcEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
