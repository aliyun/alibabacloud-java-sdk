// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSslVpnServerResponseBody body;

    public static DeleteSslVpnServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnServerResponse self = new DeleteSslVpnServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSslVpnServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSslVpnServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSslVpnServerResponse setBody(DeleteSslVpnServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSslVpnServerResponseBody getBody() {
        return this.body;
    }

}
