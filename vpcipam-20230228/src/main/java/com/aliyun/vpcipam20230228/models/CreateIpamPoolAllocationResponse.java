// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolAllocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpamPoolAllocationResponseBody body;

    public static CreateIpamPoolAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolAllocationResponse self = new CreateIpamPoolAllocationResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpamPoolAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpamPoolAllocationResponse setBody(CreateIpamPoolAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpamPoolAllocationResponseBody getBody() {
        return this.body;
    }

}
