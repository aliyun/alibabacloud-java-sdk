// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateVpnGatewayWithCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateVpnGatewayWithCertificateResponseBody body;

    public static DissociateVpnGatewayWithCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateVpnGatewayWithCertificateResponse self = new DissociateVpnGatewayWithCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DissociateVpnGatewayWithCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateVpnGatewayWithCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateVpnGatewayWithCertificateResponse setBody(DissociateVpnGatewayWithCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateVpnGatewayWithCertificateResponseBody getBody() {
        return this.body;
    }

}
