// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachSecurityGroupToVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AttachSecurityGroupToVpcEndpointResponse setBody(AttachSecurityGroupToVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachSecurityGroupToVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
