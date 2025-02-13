// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolAllocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIpamPoolAllocationResponseBody body;

    public static GetIpamPoolAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpamPoolAllocationResponse self = new GetIpamPoolAllocationResponse();
        return TeaModel.build(map, self);
    }

    public GetIpamPoolAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpamPoolAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIpamPoolAllocationResponse setBody(GetIpamPoolAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpamPoolAllocationResponseBody getBody() {
        return this.body;
    }

}
