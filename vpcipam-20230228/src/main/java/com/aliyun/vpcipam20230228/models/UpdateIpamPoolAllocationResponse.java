// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolAllocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpamPoolAllocationResponseBody body;

    public static UpdateIpamPoolAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolAllocationResponse self = new UpdateIpamPoolAllocationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpamPoolAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpamPoolAllocationResponse setBody(UpdateIpamPoolAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpamPoolAllocationResponseBody getBody() {
        return this.body;
    }

}
