// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePublicKeyResponseBody body;

    public static DeletePublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicKeyResponse self = new DeletePublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicKeyResponse setBody(DeletePublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicKeyResponseBody getBody() {
        return this.body;
    }

}
