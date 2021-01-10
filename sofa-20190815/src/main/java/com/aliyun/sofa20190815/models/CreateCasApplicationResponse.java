// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasApplicationResponseBody body;

    public static CreateCasApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasApplicationResponse self = new CreateCasApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasApplicationResponse setBody(CreateCasApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasApplicationResponseBody getBody() {
        return this.body;
    }

}
