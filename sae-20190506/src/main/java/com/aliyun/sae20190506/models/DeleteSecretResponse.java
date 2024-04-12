// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecretResponseBody body;

    public static DeleteSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponse self = new DeleteSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecretResponse setBody(DeleteSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretResponseBody getBody() {
        return this.body;
    }

}
