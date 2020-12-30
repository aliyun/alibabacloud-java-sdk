// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSslVpnServerResponseBody body;

    public static CreateSslVpnServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnServerResponse self = new CreateSslVpnServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSslVpnServerResponse setBody(CreateSslVpnServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSslVpnServerResponseBody getBody() {
        return this.body;
    }

}
