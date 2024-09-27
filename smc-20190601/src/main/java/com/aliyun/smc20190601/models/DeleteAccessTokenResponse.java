// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessTokenResponseBody body;

    public static DeleteAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessTokenResponse self = new DeleteAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessTokenResponse setBody(DeleteAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessTokenResponseBody getBody() {
        return this.body;
    }

}
