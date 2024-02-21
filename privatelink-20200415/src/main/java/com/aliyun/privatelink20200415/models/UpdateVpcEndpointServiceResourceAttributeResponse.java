// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceResourceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVpcEndpointServiceResourceAttributeResponseBody body;

    public static UpdateVpcEndpointServiceResourceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointServiceResourceAttributeResponse self = new UpdateVpcEndpointServiceResourceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointServiceResourceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpcEndpointServiceResourceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpcEndpointServiceResourceAttributeResponse setBody(UpdateVpcEndpointServiceResourceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcEndpointServiceResourceAttributeResponseBody getBody() {
        return this.body;
    }

}
