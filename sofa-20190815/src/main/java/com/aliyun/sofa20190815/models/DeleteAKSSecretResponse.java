// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSSecretResponseBody body;

    public static DeleteAKSSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSSecretResponse self = new DeleteAKSSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSSecretResponse setBody(DeleteAKSSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSSecretResponseBody getBody() {
        return this.body;
    }

}
