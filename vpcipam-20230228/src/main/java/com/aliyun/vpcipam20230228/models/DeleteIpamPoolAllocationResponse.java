// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamPoolAllocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpamPoolAllocationResponseBody body;

    public static DeleteIpamPoolAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamPoolAllocationResponse self = new DeleteIpamPoolAllocationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpamPoolAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpamPoolAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpamPoolAllocationResponse setBody(DeleteIpamPoolAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpamPoolAllocationResponseBody getBody() {
        return this.body;
    }

}
