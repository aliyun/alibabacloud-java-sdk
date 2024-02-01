// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnClientCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSslVpnClientCertResponseBody body;

    public static CreateSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnClientCertResponse self = new CreateSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnClientCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSslVpnClientCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSslVpnClientCertResponse setBody(CreateSslVpnClientCertResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSslVpnClientCertResponseBody getBody() {
        return this.body;
    }

}
