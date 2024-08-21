// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetVodDomainSSLCertificateResponseBody body;

    public static SetVodDomainSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainSSLCertificateResponse self = new SetVodDomainSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetVodDomainSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVodDomainSSLCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVodDomainSSLCertificateResponse setBody(SetVodDomainSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVodDomainSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
