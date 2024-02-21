// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVpcEndpointServiceAttributeResponseBody body;

    public static UpdateVpcEndpointServiceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointServiceAttributeResponse self = new UpdateVpcEndpointServiceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointServiceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpcEndpointServiceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpcEndpointServiceAttributeResponse setBody(UpdateVpcEndpointServiceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcEndpointServiceAttributeResponseBody getBody() {
        return this.body;
    }

}
