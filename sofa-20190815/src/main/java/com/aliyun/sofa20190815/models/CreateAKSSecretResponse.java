// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSSecretResponseBody body;

    public static CreateAKSSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSSecretResponse self = new CreateAKSSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSSecretResponse setBody(CreateAKSSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSSecretResponseBody getBody() {
        return this.body;
    }

}
