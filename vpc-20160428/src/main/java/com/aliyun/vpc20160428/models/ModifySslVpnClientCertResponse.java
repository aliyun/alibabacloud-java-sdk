// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnClientCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifySslVpnClientCertResponse setBody(ModifySslVpnClientCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySslVpnClientCertResponseBody getBody() {
        return this.body;
    }

}
