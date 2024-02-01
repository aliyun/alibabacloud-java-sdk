// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnClientCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySslVpnClientCertResponseBody body;

    public static ModifySslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnClientCertResponse self = new ModifySslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnClientCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySslVpnClientCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySslVpnClientCertResponse setBody(ModifySslVpnClientCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySslVpnClientCertResponseBody getBody() {
        return this.body;
    }

}
