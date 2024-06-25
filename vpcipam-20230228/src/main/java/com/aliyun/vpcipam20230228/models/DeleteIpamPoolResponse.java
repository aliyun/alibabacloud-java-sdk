// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpamPoolResponseBody body;

    public static DeleteIpamPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamPoolResponse self = new DeleteIpamPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpamPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpamPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpamPoolResponse setBody(DeleteIpamPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpamPoolResponseBody getBody() {
        return this.body;
    }

}
