// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnCertificateDetailResponseBody body;

    public static DescribeScdnCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCertificateDetailResponse self = new DescribeScdnCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnCertificateDetailResponse setBody(DescribeScdnCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
