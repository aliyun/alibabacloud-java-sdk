// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetScdnDomainCertificateResponseBody body;

    public static SetScdnDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetScdnDomainCertificateResponse self = new SetScdnDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetScdnDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetScdnDomainCertificateResponse setBody(SetScdnDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetScdnDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
