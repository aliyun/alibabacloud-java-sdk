// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachSecurityGroupFromVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachSecurityGroupFromVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachSecurityGroupFromVpcEndpointResponse setBody(DetachSecurityGroupFromVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachSecurityGroupFromVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
