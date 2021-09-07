// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSuperAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSuperAccountResponseBody body;

    public static CreateSuperAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSuperAccountResponse self = new CreateSuperAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateSuperAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSuperAccountResponse setBody(CreateSuperAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSuperAccountResponseBody getBody() {
        return this.body;
    }

}
