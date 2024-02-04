// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisassociateAdditionalCertificatesWithListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateAdditionalCertificatesWithListenerResponseBody body;

    public static DisassociateAdditionalCertificatesWithListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateAdditionalCertificatesWithListenerResponse self = new DisassociateAdditionalCertificatesWithListenerResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateAdditionalCertificatesWithListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateAdditionalCertificatesWithListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateAdditionalCertificatesWithListenerResponse setBody(DisassociateAdditionalCertificatesWithListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateAdditionalCertificatesWithListenerResponseBody getBody() {
        return this.body;
    }

}
