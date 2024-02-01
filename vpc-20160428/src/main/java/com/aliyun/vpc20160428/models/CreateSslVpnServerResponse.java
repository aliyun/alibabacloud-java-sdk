// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateSslVpnServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSslVpnServerResponse setBody(CreateSslVpnServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSslVpnServerResponseBody getBody() {
        return this.body;
    }

}
