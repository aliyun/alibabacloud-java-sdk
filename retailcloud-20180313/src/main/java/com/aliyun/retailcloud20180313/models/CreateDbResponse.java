// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDbResponseBody body;

    public static CreateDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDbResponse self = new CreateDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDbResponse setBody(CreateDbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDbResponseBody getBody() {
        return this.body;
    }

}
