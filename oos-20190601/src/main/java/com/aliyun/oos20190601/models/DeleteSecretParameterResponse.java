// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecretParameterResponseBody body;

    public static DeleteSecretParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretParameterResponse self = new DeleteSecretParameterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecretParameterResponse setBody(DeleteSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretParameterResponseBody getBody() {
        return this.body;
    }

}
