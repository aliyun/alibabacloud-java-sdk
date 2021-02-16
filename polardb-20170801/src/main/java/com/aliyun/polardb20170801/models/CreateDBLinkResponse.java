// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBLinkResponseBody body;

    public static CreateDBLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBLinkResponse self = new CreateDBLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBLinkResponse setBody(CreateDBLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBLinkResponseBody getBody() {
        return this.body;
    }

}
