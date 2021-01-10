// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSTokenResponseBody body;

    public static CreateAKSTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSTokenResponse self = new CreateAKSTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSTokenResponse setBody(CreateAKSTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSTokenResponseBody getBody() {
        return this.body;
    }

}
