// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateVpnGatewayWithCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DissociateVpnGatewayWithCertificateResponse setBody(DissociateVpnGatewayWithCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateVpnGatewayWithCertificateResponseBody getBody() {
        return this.body;
    }

}
