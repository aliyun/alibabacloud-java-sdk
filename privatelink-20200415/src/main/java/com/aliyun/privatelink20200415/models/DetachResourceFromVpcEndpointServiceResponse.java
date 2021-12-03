// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachResourceFromVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachResourceFromVpcEndpointServiceResponseBody body;

    public static DetachResourceFromVpcEndpointServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachResourceFromVpcEndpointServiceResponse self = new DetachResourceFromVpcEndpointServiceResponse();
        return TeaModel.build(map, self);
    }

    public DetachResourceFromVpcEndpointServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachResourceFromVpcEndpointServiceResponse setBody(DetachResourceFromVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachResourceFromVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
