// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnClientCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSslVpnClientCertResponseBody body;

    public static DeleteSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnClientCertResponse self = new DeleteSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSslVpnClientCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSslVpnClientCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSslVpnClientCertResponse setBody(DeleteSslVpnClientCertResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSslVpnClientCertResponseBody getBody() {
        return this.body;
    }

}
