// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteUserPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserPublicKeyResponseBody body;

    public static DeleteUserPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPublicKeyResponse self = new DeleteUserPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserPublicKeyResponse setBody(DeleteUserPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserPublicKeyResponseBody getBody() {
        return this.body;
    }

}
