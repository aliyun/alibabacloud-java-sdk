// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachDhcpOptionsSetToVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDhcpOptionsSetToVpcResponseBody body;

    public static AttachDhcpOptionsSetToVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDhcpOptionsSetToVpcResponse self = new AttachDhcpOptionsSetToVpcResponse();
        return TeaModel.build(map, self);
    }

    public AttachDhcpOptionsSetToVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDhcpOptionsSetToVpcResponse setBody(AttachDhcpOptionsSetToVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDhcpOptionsSetToVpcResponseBody getBody() {
        return this.body;
    }

}
