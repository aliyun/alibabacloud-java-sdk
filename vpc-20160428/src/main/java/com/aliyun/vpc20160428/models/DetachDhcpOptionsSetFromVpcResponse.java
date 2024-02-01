// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DetachDhcpOptionsSetFromVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachDhcpOptionsSetFromVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDhcpOptionsSetFromVpcResponse setBody(DetachDhcpOptionsSetFromVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDhcpOptionsSetFromVpcResponseBody getBody() {
        return this.body;
    }

}
