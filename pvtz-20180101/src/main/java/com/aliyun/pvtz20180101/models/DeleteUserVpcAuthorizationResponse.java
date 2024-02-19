// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteUserVpcAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserVpcAuthorizationResponseBody body;

    public static DeleteUserVpcAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserVpcAuthorizationResponse self = new DeleteUserVpcAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserVpcAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserVpcAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserVpcAuthorizationResponse setBody(DeleteUserVpcAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserVpcAuthorizationResponseBody getBody() {
        return this.body;
    }

}
