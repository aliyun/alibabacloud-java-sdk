// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateAdditionalCertificatesWithListenerResponseBody body;

    public static AssociateAdditionalCertificatesWithListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateAdditionalCertificatesWithListenerResponse self = new AssociateAdditionalCertificatesWithListenerResponse();
        return TeaModel.build(map, self);
    }

    public AssociateAdditionalCertificatesWithListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateAdditionalCertificatesWithListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateAdditionalCertificatesWithListenerResponse setBody(AssociateAdditionalCertificatesWithListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateAdditionalCertificatesWithListenerResponseBody getBody() {
        return this.body;
    }

}
