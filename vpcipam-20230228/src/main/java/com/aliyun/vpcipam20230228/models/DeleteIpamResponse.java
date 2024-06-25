// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpamResponseBody body;

    public static DeleteIpamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamResponse self = new DeleteIpamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpamResponse setBody(DeleteIpamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpamResponseBody getBody() {
        return this.body;
    }

}
