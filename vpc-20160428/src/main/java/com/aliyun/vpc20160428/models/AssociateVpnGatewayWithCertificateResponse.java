// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpnGatewayWithCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateVpnGatewayWithCertificateResponseBody body;

    public static AssociateVpnGatewayWithCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpnGatewayWithCertificateResponse self = new AssociateVpnGatewayWithCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AssociateVpnGatewayWithCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateVpnGatewayWithCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateVpnGatewayWithCertificateResponse setBody(AssociateVpnGatewayWithCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateVpnGatewayWithCertificateResponseBody getBody() {
        return this.body;
    }

}
