// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachSecurityGroupFromVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachSecurityGroupFromVpcEndpointResponseBody body;

    public static DetachSecurityGroupFromVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachSecurityGroupFromVpcEndpointResponse self = new DetachSecurityGroupFromVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DetachSecurityGroupFromVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachSecurityGroupFromVpcEndpointResponse setBody(DetachSecurityGroupFromVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachSecurityGroupFromVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
