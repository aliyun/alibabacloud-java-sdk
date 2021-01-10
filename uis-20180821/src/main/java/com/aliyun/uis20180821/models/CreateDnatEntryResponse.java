// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateDnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDnatEntryResponseBody body;

    public static CreateDnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDnatEntryResponse self = new CreateDnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDnatEntryResponse setBody(CreateDnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDnatEntryResponseBody getBody() {
        return this.body;
    }

}
