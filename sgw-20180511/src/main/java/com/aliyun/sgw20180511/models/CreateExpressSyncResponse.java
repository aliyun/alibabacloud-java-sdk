// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateExpressSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateExpressSyncResponseBody body;

    public static CreateExpressSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressSyncResponse self = new CreateExpressSyncResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressSyncResponse setBody(CreateExpressSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressSyncResponseBody getBody() {
        return this.body;
    }

}
