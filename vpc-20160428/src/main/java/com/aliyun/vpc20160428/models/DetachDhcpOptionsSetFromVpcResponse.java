// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DetachDhcpOptionsSetFromVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachDhcpOptionsSetFromVpcResponseBody body;

    public static DetachDhcpOptionsSetFromVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDhcpOptionsSetFromVpcResponse self = new DetachDhcpOptionsSetFromVpcResponse();
        return TeaModel.build(map, self);
    }

    public DetachDhcpOptionsSetFromVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDhcpOptionsSetFromVpcResponse setBody(DetachDhcpOptionsSetFromVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDhcpOptionsSetFromVpcResponseBody getBody() {
        return this.body;
    }

}
