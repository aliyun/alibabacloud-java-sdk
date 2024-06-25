// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamPoolCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpamPoolCidrResponseBody body;

    public static DeleteIpamPoolCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamPoolCidrResponse self = new DeleteIpamPoolCidrResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpamPoolCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpamPoolCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpamPoolCidrResponse setBody(DeleteIpamPoolCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpamPoolCidrResponseBody getBody() {
        return this.body;
    }

}
