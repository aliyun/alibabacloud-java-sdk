// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetVpcEndpointServiceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcEndpointServiceAttributeResponse setBody(GetVpcEndpointServiceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcEndpointServiceAttributeResponseBody getBody() {
        return this.body;
    }

}
