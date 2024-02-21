// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachResourceToVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachResourceToVpcEndpointServiceResponseBody body;

    public static AttachResourceToVpcEndpointServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachResourceToVpcEndpointServiceResponse self = new AttachResourceToVpcEndpointServiceResponse();
        return TeaModel.build(map, self);
    }

    public AttachResourceToVpcEndpointServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachResourceToVpcEndpointServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachResourceToVpcEndpointServiceResponse setBody(AttachResourceToVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachResourceToVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
