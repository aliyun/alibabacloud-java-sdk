// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySslVpnServerResponseBody body;

    public static ModifySslVpnServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnServerResponse self = new ModifySslVpnServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySslVpnServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySslVpnServerResponse setBody(ModifySslVpnServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySslVpnServerResponseBody getBody() {
        return this.body;
    }

}
