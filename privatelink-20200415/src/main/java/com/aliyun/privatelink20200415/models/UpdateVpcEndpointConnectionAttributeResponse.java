// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVpcEndpointConnectionAttributeResponseBody body;

    public static UpdateVpcEndpointConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointConnectionAttributeResponse self = new UpdateVpcEndpointConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointConnectionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpcEndpointConnectionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpcEndpointConnectionAttributeResponse setBody(UpdateVpcEndpointConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcEndpointConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
