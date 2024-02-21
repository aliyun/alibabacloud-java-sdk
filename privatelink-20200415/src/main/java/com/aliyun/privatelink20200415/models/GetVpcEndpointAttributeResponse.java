// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetVpcEndpointAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcEndpointAttributeResponse setBody(GetVpcEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
