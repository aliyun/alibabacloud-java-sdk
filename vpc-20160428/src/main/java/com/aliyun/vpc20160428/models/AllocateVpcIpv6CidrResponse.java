// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateVpcIpv6CidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateVpcIpv6CidrResponseBody body;

    public static AllocateVpcIpv6CidrResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateVpcIpv6CidrResponse self = new AllocateVpcIpv6CidrResponse();
        return TeaModel.build(map, self);
    }

    public AllocateVpcIpv6CidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateVpcIpv6CidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateVpcIpv6CidrResponse setBody(AllocateVpcIpv6CidrResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateVpcIpv6CidrResponseBody getBody() {
        return this.body;
    }

}
