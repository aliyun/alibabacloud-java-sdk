// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteSecretParameterResponse setBody(DeleteSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretParameterResponseBody getBody() {
        return this.body;
    }

}
