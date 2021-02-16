// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccountResponseBody body;

    public static CreateAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountResponse self = new CreateAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccountResponse setBody(CreateAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccountResponseBody getBody() {
        return this.body;
    }

}
