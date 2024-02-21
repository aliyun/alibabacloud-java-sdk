// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachSecurityGroupToVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachSecurityGroupToVpcEndpointResponseBody body;

    public static AttachSecurityGroupToVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachSecurityGroupToVpcEndpointResponse self = new AttachSecurityGroupToVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public AttachSecurityGroupToVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachSecurityGroupToVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachSecurityGroupToVpcEndpointResponse setBody(AttachSecurityGroupToVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachSecurityGroupToVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
