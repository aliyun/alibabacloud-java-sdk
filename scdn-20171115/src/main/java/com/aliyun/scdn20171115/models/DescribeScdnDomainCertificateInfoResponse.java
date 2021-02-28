// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainCertificateInfoResponseBody body;

    public static DescribeScdnDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainCertificateInfoResponse self = new DescribeScdnDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainCertificateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainCertificateInfoResponse setBody(DescribeScdnDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
