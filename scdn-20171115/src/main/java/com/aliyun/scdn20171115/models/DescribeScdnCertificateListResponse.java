// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnCertificateListResponseBody body;

    public static DescribeScdnCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCertificateListResponse self = new DescribeScdnCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnCertificateListResponse setBody(DescribeScdnCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnCertificateListResponseBody getBody() {
        return this.body;
    }

}
