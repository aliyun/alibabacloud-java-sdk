// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSSecretImagepullResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSSecretImagepullResponseBody body;

    public static CreateAKSSecretImagepullResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSSecretImagepullResponse self = new CreateAKSSecretImagepullResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSSecretImagepullResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSSecretImagepullResponse setBody(CreateAKSSecretImagepullResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSSecretImagepullResponseBody getBody() {
        return this.body;
    }

}
