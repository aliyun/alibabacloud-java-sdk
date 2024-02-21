// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVpcEndpointAttributeResponseBody body;

    public static UpdateVpcEndpointAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointAttributeResponse self = new UpdateVpcEndpointAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpcEndpointAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpcEndpointAttributeResponse setBody(UpdateVpcEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
